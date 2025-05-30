package com.icp.intellij.rust.parser

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
import com.icp.intellikit.psi.RustTypes
import com.icp.intellij.rust.RustLanguage
import com.icp.intellij.rust.psi.RustFile
import com.icp.intellij.rust.psi.RustTokenTypes

class RustParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return RustLexer()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return TokenSet.WHITE_SPACE
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return STRING_LITERALS
    }

    override fun createParser(project: Project): PsiParser {
        return RustParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createElement(node: ASTNode): PsiElement {
        return RustTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return RustFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        val FILE = IFileElementType(RustLanguage.INSTANCE)
        val COMMENTS = TokenSet.create(RustTokenTypes.LINE_COMMENT, RustTokenTypes.BLOCK_COMMENT)
        val STRING_LITERALS = TokenSet.create(RustTokenTypes.STRING_LITERAL)
    }
}