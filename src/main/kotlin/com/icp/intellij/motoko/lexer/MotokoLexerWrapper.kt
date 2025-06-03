package com.icp.intellij.motoko.lexer

import com.intellij.lexer.FlexLexer
import com.intellij.psi.tree.IElementType
import java.io.Reader
import java.io.StringReader
import com.icp.intellij.motoko.lexer.MotokoLexer

class MotokoLexerWrapper : FlexLexer {
    private val lexer: MotokoLexer

    constructor() {
        lexer = MotokoLexer(StringReader(""))
    }

    constructor(reader: Reader) {
        lexer = MotokoLexer(reader)
    }

    override fun advance(): IElementType {
        return lexer.advance()
    }

    override fun reset(buffer: CharSequence, start: Int, end: Int, initialState: Int) {
        lexer.reset(buffer, start, end, initialState)
    }

    override fun yybegin(state: Int) {
        lexer.yybegin(state)
    }

    override fun yystate(): Int {
        return lexer.yystate()
    }

    override fun getTokenStart(): Int {
        return lexer.getTokenStart()
    }

    override fun getTokenEnd(): Int {
        return lexer.getTokenEnd()
    }
} 