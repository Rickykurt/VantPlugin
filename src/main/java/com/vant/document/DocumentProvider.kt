package main.java.com.vant.document

import com.intellij.lang.documentation.AbstractDocumentationProvider
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

import java.lang.reflect.Field

class DocumentProvider : AbstractDocumentationProvider() {
    override fun getQuickNavigateInfo(element: PsiElement?, originalElement: PsiElement?): String? {
        return if (element is IProperty) {
            "\"" + renderPropertyValue((element as IProperty?)!!) + "\"" + getLocationString(element)
        } else null
    }

    private fun getLocationString(element: PsiElement): String {
        val file = element.containingFile
        return if (file != null) " [" + file.name + "]" else ""
    }

    private fun renderPropertyValue(prop: IProperty): String {
        val raw = prop.value ?: return "<i>empty</i>"
        return StringUtil.escapeXml(raw)
    }

    override fun generateDoc(element: PsiElement?, originalElement: PsiElement?): String? {
        // 相关处理，不处理返回null
        val text = originalElement!!.text

        if (null != text) {
            println(text)
            var doc = "doc: $text"
            val textHandle = text.replace("-".toRegex(), "").replace("\n|\r\n".toRegex(), "")
            val clazz = DocumentConstant::class.java
            val fields = clazz.fields
            for (field in fields) {
                if (textHandle == field.name && field.type.toString().endsWith("java.lang.String")) {
                    try {
                        doc = field.get(DocumentConstant::class.java) as String
                    } catch (e: IllegalAccessException) {
                        e.printStackTrace()
                    }

                    break
                }
            }
            return if ("doc: " == doc) {
                null
            } else {
                doc
            }
        }
        return null
    }
}