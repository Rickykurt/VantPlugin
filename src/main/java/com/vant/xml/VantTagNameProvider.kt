package main.java.com.vant.xml

import com.intellij.codeInsight.completion.XmlTagInsertHandler
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.impl.source.xml.XmlElementDescriptorProvider
import com.intellij.psi.xml.XmlTag
import com.intellij.xml.XmlElementDescriptor
import com.intellij.xml.XmlTagNameProvider


class VantTagNameProvider : XmlElementDescriptorProvider, XmlTagNameProvider {
    /**
     * 添加属性元素标签
     * 在输入 < 后执行, 需在plugin.xml中配置xml.tagNameProvider
     * @param list
     * @param xmlTag
     * @param s
     */
    override fun addTagNameVariants(list: MutableList<LookupElement>, xmlTag: XmlTag, s: String) {
        for ((key) in VantTagConstant.TAG_CONSTANT) {
            list.add(LookupElementBuilder.create(key).withInsertHandler(XmlTagInsertHandler.INSTANCE))
        }
    }


    /**
     * 获取标签描述
     * 在任意输入后执行, 需在plugin.xml中配置xml.elementDescriptorProvider
     * @param xmlTag
     * @return
     */
    override fun getDescriptor(xmlTag: XmlTag): XmlElementDescriptor? {

        var special = false
        for ((key) in VantTagConstant.TAG_CONSTANT) {
            if (key == xmlTag.name) {
                special = true
                break
            }
        }
        if (special) {
//            var declare: PsiFile? = null
//            val virtualFile = ArchiveUtil.getFileFromArchive("constants/weex-built-in-components.xml")
//            if (virtualFile != null) {
//                declare = PsiManager.getInstance(xmlTag.project).findFile(virtualFile!!)
//            }
//            if (declare == null) {
//
//            }
            var declare = xmlTag.containingFile
            return VantXmlElementDescriptor(xmlTag.name, declare)
        }
        return null
//        val tags = DirectiveLint.getWeexTagNames()
//        val htmlTags = DirectiveLint.getHtmlTags()
//        if (tags.contains(xmlTag.name) && !htmlTags.contains(xmlTag.name)) {
//
//            val tag = DirectiveLint.getWeexTag(xmlTag.name)
//            if (tag != null) {
//                declare = tag!!.declare
//            }
//            if (declare == null) {
//
//
//            }
//
//
//        }
//
//        val contextTags = ContextTagResolver.resolve(xmlTag)
//        for (tag in contextTags) {
//            if (xmlTag.name.equals(tag.tag)) {
//                return WeexTagDescriptor(tag.tag, tag.declare)
//            }
//        }
//
//
//
//
//
//
//
//
//        val nsDescriptor = xmlTag.getNSDescriptor(xmlTag.namespace, false)
//        val descriptor = nsDescriptor?.getElementDescriptor(xmlTag)
//        // 判断是否包含在特定处理标签内
//
//        return if (!special) {
//            null
//        } else VantXmlElementDescriptor(descriptor, nsDescriptor, xmlTag.name)

    }
}
