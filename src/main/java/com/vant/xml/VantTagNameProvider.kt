package main.java.com.vant.xml

import com.intellij.codeInsight.completion.XmlTagInsertHandler
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.impl.source.xml.XmlElementDescriptorProvider
import com.intellij.psi.xml.XmlTag
import com.intellij.xml.XmlElementDescriptor
import com.intellij.xml.XmlNSDescriptor
import com.intellij.xml.XmlTagNameProvider

import java.util.HashMap

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
        val nsDescriptor = xmlTag.getNSDescriptor(xmlTag.namespace, false)
        val descriptor = nsDescriptor?.getElementDescriptor(xmlTag)
        // 判断是否包含在特定处理标签内
        var special = false
        for ((key) in VantTagConstant.TAG_CONSTANT) {
            if (key == xmlTag.name) {
                special = true
                break
            }
        }
        return if (!special) {
            null
        } else VantAnyXmlElementDescriptor(descriptor, nsDescriptor, xmlTag.name)

    }
}
