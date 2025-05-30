package com.icp.intellikit.psi

import com.intellij.psi.tree.IElementType
import com.icp.intellikit.MotokoLanguage

class MotokoTokenType(debugName: String) : IElementType(debugName, MotokoLanguage.INSTANCE) {
    override fun toString(): String = "MotokoTokenType." + super.toString()
}

object MotokoTypes {
    // Keywords
    val ACTOR = MotokoTokenType("ACTOR")
    val MODULE = MotokoTokenType("MODULE")
    val TYPE = MotokoTokenType("TYPE")
    val FUNC = MotokoTokenType("FUNC")
    val LET = MotokoTokenType("LET")
    val VAR = MotokoTokenType("VAR")
    val RETURN = MotokoTokenType("RETURN")
    val IF = MotokoTokenType("IF")
    val ELSE = MotokoTokenType("ELSE")
    val LOOP = MotokoTokenType("LOOP")
    val PUBLIC = MotokoTokenType("PUBLIC")
    val PRIVATE = MotokoTokenType("PRIVATE")
    val SHARED = MotokoTokenType("SHARED")

    // Types
    val NAT = MotokoTokenType("NAT")
    val INT = MotokoTokenType("INT")
    val BOOL = MotokoTokenType("BOOL")
    val TEXT = MotokoTokenType("TEXT")
    val FLOAT = MotokoTokenType("FLOAT")

    // Literals
    val TRUE = MotokoTokenType("TRUE")
    val FALSE = MotokoTokenType("FALSE")
    val NULL = MotokoTokenType("NULL")
    val NUMBER = MotokoTokenType("NUMBER")
    val STRING = MotokoTokenType("STRING")
    val IDENTIFIER = MotokoTokenType("IDENTIFIER")

    // Operators
    val EQ = MotokoTokenType("EQ")
    val EQEQ = MotokoTokenType("EQEQ")
    val NEQ = MotokoTokenType("NEQ")
    val LT = MotokoTokenType("LT")
    val LTE = MotokoTokenType("LTE")
    val GT = MotokoTokenType("GT")
    val GTE = MotokoTokenType("GTE")
    val PLUS = MotokoTokenType("PLUS")
    val MINUS = MotokoTokenType("MINUS")
    val MUL = MotokoTokenType("MUL")
    val DIV = MotokoTokenType("DIV")

    // Delimiters
    val LPAREN = MotokoTokenType("LPAREN")
    val RPAREN = MotokoTokenType("RPAREN")
    val LBRACE = MotokoTokenType("LBRACE")
    val RBRACE = MotokoTokenType("RBRACE")
    val LBRACK = MotokoTokenType("LBRACK")
    val RBRACK = MotokoTokenType("RBRACK")
    val SEMICOLON = MotokoTokenType("SEMICOLON")
    val COMMA = MotokoTokenType("COMMA")
    val COLON = MotokoTokenType("COLON")
    val ARROW = MotokoTokenType("ARROW")

    // Comments
    val COMMENT = MotokoTokenType("COMMENT")
} 