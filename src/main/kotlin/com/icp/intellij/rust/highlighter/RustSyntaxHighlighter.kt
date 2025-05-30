package com.icp.intellij.rust.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.icp.intellij.rust.parser.RustLexer
import com.icp.intellij.rust.psi.RustTokenTypes

class RustSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = RustLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            in RustTokenTypes.KEYWORDS -> pack(RustSyntaxHighlighterFactory.KEYWORDS)
            in RustTokenTypes.STRING_LITERALS -> pack(RustSyntaxHighlighterFactory.STRING)
            RustTokenTypes.INTEGER_LITERAL, RustTokenTypes.FLOAT_LITERAL -> pack(RustSyntaxHighlighterFactory.NUMBER)
            in RustTokenTypes.COMMENT_TOKENS -> pack(RustSyntaxHighlighterFactory.COMMENT)
            RustTokenTypes.IDENTIFIER -> pack(RustSyntaxHighlighterFactory.IDENTIFIER)
            RustTokenTypes.LIFETIME -> pack(RustSyntaxHighlighterFactory.LIFETIME)
            else -> emptyArray()
        }
    }
}