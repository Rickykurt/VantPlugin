package main.java.com.vant.language

import com.intellij.lang.PsiParser
import com.intellij.lang.html.HTMLParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType

class VantParserDefinition : HTMLParserDefinition() {
    override fun createLexer(project: Project?): Lexer {
        return super.createLexer(project)
    }

    override fun getFileNodeType(): IFileElementType {
        return super.getFileNodeType()
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return super.createFile(viewProvider)
    }

    override fun createParser(project: Project?): PsiParser {
        return super.createParser(project)
    }
}
