package com.icp.intellij.motoko.psi

import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.MotokoLanguage

class MotokoTokenType(debugName: String) : IElementType(debugName, MotokoLanguage.INSTANCE) {
    override fun toString(): String = "MotokoTokenType." + super.toString()
}

object MotokoTypes {
    // Keywords
    val ACTOR = MotokoTokenType("actor")
    val MODULE = MotokoTokenType("module")
    val TYPE = MotokoTokenType("type")
    val FUNC = MotokoTokenType("func")
    val LET = MotokoTokenType("let")
    val VAR = MotokoTokenType("var")
    val RETURN = MotokoTokenType("return")
    val IF = MotokoTokenType("if")
    val ELSE = MotokoTokenType("else")
    val LOOP = MotokoTokenType("loop")
    val PUBLIC = MotokoTokenType("public")
    val PRIVATE = MotokoTokenType("private")
    val SHARED = MotokoTokenType("shared")

    // Types
    val NAT = MotokoTokenType("Nat")
    val INT = MotokoTokenType("Int")
    val BOOL = MotokoTokenType("Bool")
    val TEXT = MotokoTokenType("Text")
    val FLOAT = MotokoTokenType("Float")

    // Literals
    val TRUE = MotokoTokenType("true")
    val FALSE = MotokoTokenType("false")
    val NULL = MotokoTokenType("null")
    val NUMBER = MotokoTokenType("number")
    val STRING = MotokoTokenType("string")
    val IDENTIFIER = MotokoTokenType("id")

    // Operators
    val EQ = MotokoTokenType("==")
    val EQEQ = MotokoTokenType("==")
    val NEQ = MotokoTokenType("!=")
    val LT = MotokoTokenType("<")
    val LTE = MotokoTokenType("<=")
    val GT = MotokoTokenType(">")
    val GTE = MotokoTokenType(">=")
    val PLUS = MotokoTokenType("+")
    val MINUS = MotokoTokenType("-")
    val MUL = MotokoTokenType("*")
    val DIV = MotokoTokenType("/")

    // Delimiters
    val LPAREN = MotokoTokenType("(")
    val RPAREN = MotokoTokenType(")")
    val LBRACE = MotokoTokenType("{")
    val RBRACE = MotokoTokenType("}")
    val LBRACK = MotokoTokenType("[")
    val RBRACK = MotokoTokenType("]")
    val SEMICOLON = MotokoTokenType(";")
    val COMMA = MotokoTokenType(",")
    val COLON = MotokoTokenType(":")
    val ARROW = MotokoTokenType("->")

    // Comments
    val COMMENT = MotokoTokenType("comment")

    // PSI Elements
    val ACTOR_DECLARATION = MotokoElementType("ACTOR_DECLARATION")
    val MODULE_DECLARATION = MotokoElementType("MODULE_DECLARATION")
    val TYPE_DECLARATION = MotokoElementType("TYPE_DECLARATION")
    val FUNCTION_DECLARATION = MotokoElementType("FUNCTION_DECLARATION")
    val VARIABLE_DECLARATION = MotokoElementType("VARIABLE_DECLARATION")
    val PARAMETER = MotokoElementType("PARAMETER")
    val TYPE_EXPRESSION = MotokoElementType("TYPE_EXPRESSION")
    val EXPRESSION = MotokoElementType("EXPRESSION")
    val STATEMENT = MotokoElementType("STATEMENT")
} 