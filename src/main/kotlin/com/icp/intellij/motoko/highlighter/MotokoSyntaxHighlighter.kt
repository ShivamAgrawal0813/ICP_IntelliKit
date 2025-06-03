package com.icp.intellij.motoko.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.lexer.MotokoLexerWrapper
import com.icp.intellij.motoko.psi.MotokoTypes
import com.intellij.lexer.FlexAdapter

class MotokoSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return FlexAdapter(MotokoLexerWrapper())
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            in MotokoTypes.KEYWORDS -> KEYWORD_KEYS
            in MotokoTypes.OPERATORS -> OPERATOR_KEYS
            in MotokoTypes.BRACKETS -> BRACKET_KEYS
            MotokoTypes.IDENTIFIER -> IDENTIFIER_KEYS
            MotokoTypes.NUMBER -> NUMBER_KEYS
            MotokoTypes.STRING_LITERAL -> STRING_KEYS
            MotokoTypes.CHAR -> CHAR_KEYS
            in MotokoTypes.COMMENT_TOKENS -> COMMENT_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        private val KEYWORD_KEYS = arrayOf(DefaultLanguageHighlighterColors.KEYWORD)
        private val OPERATOR_KEYS = arrayOf(DefaultLanguageHighlighterColors.OPERATION_SIGN)
        private val BRACKET_KEYS = arrayOf(DefaultLanguageHighlighterColors.BRACKETS)
        private val IDENTIFIER_KEYS = arrayOf(DefaultLanguageHighlighterColors.IDENTIFIER)
        private val NUMBER_KEYS = arrayOf(DefaultLanguageHighlighterColors.NUMBER)
        private val STRING_KEYS = arrayOf(DefaultLanguageHighlighterColors.STRING)
        private val CHAR_KEYS = arrayOf(DefaultLanguageHighlighterColors.STRING)
        private val COMMENT_KEYS = arrayOf(DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
} 