package com.icp.intellij.motoko.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.parser.MotokoLexer
import com.icp.intellij.motoko.psi.MotokoTokenTypes

class MotokoSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = MotokoLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            in MotokoTokenTypes.KEYWORDS -> pack(MotokoSyntaxHighlighterFactory.KEYWORDS)
            MotokoTokenTypes.STRING_LITERAL -> pack(MotokoSyntaxHighlighterFactory.STRING)
            MotokoTokenTypes.NUMBER_LITERAL -> pack(MotokoSyntaxHighlighterFactory.NUMBER)
            in MotokoTokenTypes.COMMENT_TOKENS -> pack(MotokoSyntaxHighlighterFactory.COMMENT)
            in MotokoTokenTypes.OPERATORS -> pack(MotokoSyntaxHighlighterFactory.OPERATOR)
            MotokoTokenTypes.IDENTIFIER -> pack(MotokoSyntaxHighlighterFactory.IDENTIFIER)
            else -> emptyArray()
        }
    }
} 