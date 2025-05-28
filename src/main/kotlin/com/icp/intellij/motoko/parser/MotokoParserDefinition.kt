package com.icp.intellij.motoko.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.icp.intellij.motoko.MotokoLanguage
import com.icp.intellij.motoko.psi.MotokoFile
import com.icp.intellij.motoko.psi.MotokoTokenTypes

class MotokoParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return MotokoLexer()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return MotokoTokenTypes.WHITESPACE_TOKENS
    }

    override fun getCommentTokens(): TokenSet {
        return MotokoTokenTypes.COMMENT_TOKENS
    }

    override fun getStringLiteralElements(): TokenSet {
        return MotokoTokenTypes.STRING_LITERALS
    }

    override fun createParser(project: Project): PsiParser {
        return MotokoParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return MotokoFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    override fun createElement(node: ASTNode): PsiElement {
        return MotokoTokenTypes.Factory.createElement(node)
    }

    companion object {
        val FILE = IFileElementType(MotokoLanguage.INSTANCE)
    }
} 