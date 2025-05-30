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
        val RETURN = IElementType("RETURN", MotokoLanguage.INSTANCE)
        val IF = IElementType("IF", MotokoLanguage.INSTANCE)
        val ELSE = IElementType("ELSE", MotokoLanguage.INSTANCE)
        val LOOP = IElementType("LOOP", MotokoLanguage.INSTANCE)
        val TRUE = IElementType("TRUE", MotokoLanguage.INSTANCE)
        val FALSE = IElementType("FALSE", MotokoLanguage.INSTANCE)
        val NULL = IElementType("NULL", MotokoLanguage.INSTANCE)
        
        // Operators
        val EQ = IElementType("EQ", MotokoLanguage.INSTANCE)
        val PLUS = IElementType("PLUS", MotokoLanguage.INSTANCE)
        val MINUS = IElementType("MINUS", MotokoLanguage.INSTANCE)
        val MUL = IElementType("MUL", MotokoLanguage.INSTANCE)
        val DIV = IElementType("DIV", MotokoLanguage.INSTANCE)
        val EQEQ = IElementType("EQEQ", MotokoLanguage.INSTANCE)
        val NEQ = IElementType("NEQ", MotokoLanguage.INSTANCE)
        val LT = IElementType("LT", MotokoLanguage.INSTANCE)
        val LTEQ = IElementType("LTEQ", MotokoLanguage.INSTANCE)
        val GT = IElementType("GT", MotokoLanguage.INSTANCE)
        val GTEQ = IElementType("GTEQ", MotokoLanguage.INSTANCE)
        val ARROW = IElementType("ARROW", MotokoLanguage.INSTANCE)
        
        // Delimiters
        val LPAREN = IElementType("LPAREN", MotokoLanguage.INSTANCE)
        val RPAREN = IElementType("RPAREN", MotokoLanguage.INSTANCE)
        val LBRACE = IElementType("LBRACE", MotokoLanguage.INSTANCE)
        val RBRACE = IElementType("RBRACE", MotokoLanguage.INSTANCE)
        val LBRACK = IElementType("LBRACK", MotokoLanguage.INSTANCE)
        val RBRACK = IElementType("RBRACK", MotokoLanguage.INSTANCE)
        val SEMICOLON = IElementType("SEMICOLON", MotokoLanguage.INSTANCE)
        val COMMA = IElementType("COMMA", MotokoLanguage.INSTANCE)
        val COLON = IElementType("COLON", MotokoLanguage.INSTANCE)
        val DOT = IElementType("DOT", MotokoLanguage.INSTANCE)
        
        // Literals
        val STRING_LITERAL = IElementType("STRING_LITERAL", MotokoLanguage.INSTANCE)
        val NUMBER_LITERAL = IElementType("NUMBER_LITERAL", MotokoLanguage.INSTANCE)
        val IDENTIFIER = IElementType("IDENTIFIER", MotokoLanguage.INSTANCE)
        
        // Comments
        val LINE_COMMENT = IElementType("LINE_COMMENT", MotokoLanguage.INSTANCE)
        val BLOCK_COMMENT = IElementType("BLOCK_COMMENT", MotokoLanguage.INSTANCE)
        
        // PSI Elements
        val ACTOR_DECLARATION = IElementType("ACTOR_DECLARATION", MotokoLanguage.INSTANCE)
        val MODULE_DECLARATION = IElementType("MODULE_DECLARATION", MotokoLanguage.INSTANCE)
        val TYPE_DECLARATION = IElementType("TYPE_DECLARATION", MotokoLanguage.INSTANCE)
        val FUNCTION_DECLARATION = IElementType("FUNCTION_DECLARATION", MotokoLanguage.INSTANCE)
        val VARIABLE_DECLARATION = IElementType("VARIABLE_DECLARATION", MotokoLanguage.INSTANCE)
        val PARAMETER = IElementType("PARAMETER", MotokoLanguage.INSTANCE)
        val TYPE_EXPRESSION = IElementType("TYPE_EXPRESSION", MotokoLanguage.INSTANCE)
        val EXPRESSION = IElementType("EXPRESSION", MotokoLanguage.INSTANCE)
        val STATEMENT = IElementType("STATEMENT", MotokoLanguage.INSTANCE)
        
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
            PUBLIC, PRIVATE, SHARED, RETURN, IF, ELSE, LOOP,
            TRUE, FALSE, NULL
        )
        
        val OPERATORS = TokenSet.create(
            EQ, PLUS, MINUS, MUL, DIV, EQEQ, NEQ, LT, LTEQ, GT, GTEQ, ARROW
        )
        
        val BRACES = TokenSet.create(
            LBRACE, RBRACE
        )
        
        val BRACKETS = TokenSet.create(
            LBRACK, RBRACK
        )
        
        val PARENTHESES = TokenSet.create(
            LPAREN, RPAREN
        )
        
        object Factory {
            fun createElement(node: com.intellij.lang.ASTNode): com.intellij.psi.PsiElement {
                val type = node.elementType
                // Create appropriate PSI elements based on the element type
                return com.intellij.psi.impl.source.tree.LeafPsiElement(type, node.text)
            }
        }
    }
}