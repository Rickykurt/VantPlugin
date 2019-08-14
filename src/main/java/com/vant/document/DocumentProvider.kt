package main.java.com.vant.document

import com.intellij.lang.documentation.AbstractDocumentationProvider
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.html.HtmlTagImpl
import kotlin.reflect.full.declaredMemberProperties

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
        return StringUtil.escapeXmlEntities(raw)
    }

    override fun generateDoc(element: PsiElement?, originalElement: PsiElement?): String? {
        // 相关处理，不处理返回null
        val text = (originalElement!!.context as HtmlTagImpl).name
        if (null != text) {
            var doc = "doc: $text"
            val textHandle = text.replace("-".toRegex(), "").replace("\n|\r\n".toRegex(), "")
            val fields = DocumentConstant::class.declaredMemberProperties
            for (field in fields) {
                if (textHandle == field.name) {
                    try {
                        doc = field.get(DocumentConstant).toString()
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