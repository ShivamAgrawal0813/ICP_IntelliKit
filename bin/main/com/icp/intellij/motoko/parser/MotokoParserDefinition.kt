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
import com.icp.intellij.motoko.lexer.MotokoLexerWrapper
import com.icp.intellij.motoko.psi.MotokoFactory
import com.icp.intellij.motoko.psi.MotokoFile
import com.icp.intellij.motoko.psi.MotokoTypes
import com.intellij.lexer.FlexAdapter

class MotokoParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return FlexAdapter(MotokoLexerWrapper())
    }

    override fun createParser(project: Project): PsiParser {
        return MotokoParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.create(MotokoTypes.LINE_COMMENT, MotokoTypes.BLOCK_COMMENT)
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.create(MotokoTypes.STRING_LITERAL)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return MotokoFactory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return MotokoFile(viewProvider)
    }

    companion object {
        val FILE = IFileElementType(MotokoLanguage.INSTANCE)
    }
} 