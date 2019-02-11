package main.java.com.vant.document

import com.intellij.openapi.actionSystem.DataKey
import com.intellij.openapi.util.Iconable
import com.intellij.pom.Navigatable
import com.intellij.psi.PsiElement
import com.intellij.util.IncorrectOperationException
import org.jetbrains.annotations.NonNls

interface IProperty : Navigatable, Iconable {

    val name: String

    val key: String?

    var value: String?

    /**
     * Returns the value with \n, \r, \t, \f and Unicode escape characters converted to their
     * character equivalents.
     *
     * @return unescaped value, or null if no value is specified for this property.
     */
    val unescapedValue: String?

    /**
     * Returns the key with \n, \r, \t, \f and Unicode escape characters converted to their
     * character equivalents.
     *
     * @return unescaped key, or null if no key is specified for this property.
     */
    val unescapedKey: String?

    /**
     * @return text of comment preceding this property. Comment-start characters ('#' and '!') are stripped from the text.
     */
    val docCommentText: String?

    /**
     * @return underlying psi element of property
     */
    val psiElement: PsiElement

    fun setName(name: String): PsiElement

    companion object {
        val EMPTY_ARRAY = arrayOfNulls<IProperty>(0)
        val ARRAY_KEY = DataKey.create<Array<IProperty>>("IProperty.array")
    }
}
