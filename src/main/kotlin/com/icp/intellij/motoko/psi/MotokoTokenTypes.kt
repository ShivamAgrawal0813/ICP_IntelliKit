package com.icp.intellij.motoko.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import com.icp.intellij.motoko.MotokoLanguage

interface MotokoTokenTypes {
    companion object {
        // Keywords
        val ACTOR = IElementType("ACTOR", MotokoLanguage.INSTANCE)
        val MODULE = IElementType("MODULE", MotokoLanguage.INSTANCE)
        val FUNC = IElementType("FUNC", MotokoLanguage.INSTANCE)
        val LET = IElementType("LET", MotokoLanguage.INSTANCE)
        val VAR = IElementType("VAR", MotokoLanguage.INSTANCE)
        val TYPE = IElementType("TYPE", MotokoLanguage.INSTANCE)
        val CLASS = IElementType("CLASS", MotokoLanguage.INSTANCE)
        val OBJECT = IElementType("OBJECT", MotokoLanguage.INSTANCE)
        val PUBLIC = IElementType("PUBLIC", MotokoLanguage.INSTANCE)
        val PRIVATE = IElementType("PRIVATE", MotokoLanguage.INSTANCE)
        val SHARED = IElementType("SHARED", MotokoLanguage.INSTANCE)
        
        // Operators
        val EQ = IElementType("EQ", MotokoLanguage.INSTANCE)
        val PLUS = IElementType("PLUS", MotokoLanguage.INSTANCE)
        val MINUS = IElementType("MINUS", MotokoLanguage.INSTANCE)
        val MUL = IElementType("MUL", MotokoLanguage.INSTANCE)
        val DIV = IElementType("DIV", MotokoLanguage.INSTANCE)
        
        // Delimiters
        val LPAREN = IElementType("LPAREN", MotokoLanguage.INSTANCE)
        val RPAREN = IElementType("RPAREN", MotokoLanguage.INSTANCE)
        val LBRACE = IElementType("LBRACE", MotokoLanguage.INSTANCE)
        val RBRACE = IElementType("RBRACE", MotokoLanguage.INSTANCE)
        val SEMICOLON = IElementType("SEMICOLON", MotokoLanguage.INSTANCE)
        val COMMA = IElementType("COMMA", MotokoLanguage.INSTANCE)
        
        // Literals
        val STRING_LITERAL = IElementType("STRING_LITERAL", MotokoLanguage.INSTANCE)
        val NUMBER_LITERAL = IElementType("NUMBER_LITERAL", MotokoLanguage.INSTANCE)
        val IDENTIFIER = IElementType("IDENTIFIER", MotokoLanguage.INSTANCE)
        
        // Comments
        val LINE_COMMENT = IElementType("LINE_COMMENT", MotokoLanguage.INSTANCE)
        val BLOCK_COMMENT = IElementType("BLOCK_COMMENT", MotokoLanguage.INSTANCE)
        
        // Token Sets
        val WHITESPACE_TOKENS = TokenSet.create(
            com.intellij.psi.TokenType.WHITE_SPACE
        )
        
        val COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT,
            BLOCK_COMMENT
        )
        
        val STRING_LITERALS = TokenSet.create(
            STRING_LITERAL
        )
        
        val KEYWORDS = TokenSet.create(
            ACTOR, MODULE, FUNC, LET, VAR, TYPE, CLASS, OBJECT,
            PUBLIC, PRIVATE, SHARED
        )
        
        val OPERATORS = TokenSet.create(
            EQ, PLUS, MINUS, MUL, DIV
        )
    }
} 