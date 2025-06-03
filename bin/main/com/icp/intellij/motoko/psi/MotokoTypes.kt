package com.icp.intellij.motoko.psi

import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.MotokoLanguage

class MotokoTokenType(debugName: String) : IElementType(debugName, MotokoLanguage.INSTANCE)

object MotokoTypes {
    // Keywords
    val ACTOR = MotokoTokenType("ACTOR")
    val MODULE = MotokoTokenType("MODULE")
    val TYPE = MotokoTokenType("TYPE")
    val FUNC = MotokoTokenType("FUNC")
    val VAR = MotokoTokenType("VAR")
    val LET = MotokoTokenType("LET")
    val CLASS = MotokoTokenType("CLASS")
    val OBJECT = MotokoTokenType("OBJECT")
    val QUERY = MotokoTokenType("QUERY")
    val ONE_WAY = MotokoTokenType("ONE_WAY")
    val ASYNC = MotokoTokenType("ASYNC")
    val AWAIT = MotokoTokenType("AWAIT")
    val TRY = MotokoTokenType("TRY")
    val CATCH = MotokoTokenType("CATCH")
    val THROW = MotokoTokenType("THROW")
    val IF = MotokoTokenType("IF")
    val ELSE = MotokoTokenType("ELSE")
    val SWITCH = MotokoTokenType("SWITCH")
    val CASE = MotokoTokenType("CASE")
    val WHILE = MotokoTokenType("WHILE")
    val FOR = MotokoTokenType("FOR")
    val IN = MotokoTokenType("IN")
    val RETURN = MotokoTokenType("RETURN")
    val BREAK = MotokoTokenType("BREAK")
    val CONTINUE = MotokoTokenType("CONTINUE")
    val IMPORT = MotokoTokenType("IMPORT")
    val EXPORT = MotokoTokenType("EXPORT")
    val PUBLIC = MotokoTokenType("PUBLIC")
    val PRIVATE = MotokoTokenType("PRIVATE")
    val SHARED = MotokoTokenType("SHARED")
    val STABLE = MotokoTokenType("STABLE")
    val FLEXIBLE = MotokoTokenType("FLEXIBLE")
    val SYSTEM = MotokoTokenType("SYSTEM")
    val DEBUG = MotokoTokenType("DEBUG")
    val PREUPGRADE = MotokoTokenType("PREUPGRADE")
    val POSTUPGRADE = MotokoTokenType("POSTUPGRADE")
    val TRUE = MotokoTokenType("TRUE")
    val FALSE = MotokoTokenType("FALSE")
    val NULL = MotokoTokenType("NULL")

    // Punctuation
    val LPAREN = MotokoTokenType("LPAREN")
    val RPAREN = MotokoTokenType("RPAREN")
    val LBRACE = MotokoTokenType("LBRACE")
    val RBRACE = MotokoTokenType("RBRACE")
    val LBRACK = MotokoTokenType("LBRACK")
    val RBRACK = MotokoTokenType("RBRACK")
    val SEMICOLON = MotokoTokenType("SEMICOLON")
    val COMMA = MotokoTokenType("COMMA")
    val DOT = MotokoTokenType("DOT")
    val COLON = MotokoTokenType("COLON")
    val DOUBLE_COLON = MotokoTokenType("DOUBLE_COLON")

    // Operators
    val EQ = MotokoTokenType("EQ")
    val EQEQ = MotokoTokenType("EQEQ")
    val NEQ = MotokoTokenType("NEQ")
    val PLUS = MotokoTokenType("PLUS")
    val MINUS = MotokoTokenType("MINUS")
    val MUL = MotokoTokenType("MUL")
    val DIV = MotokoTokenType("DIV")
    val MOD = MotokoTokenType("MOD")
    val NOT = MotokoTokenType("NOT")
    val AND = MotokoTokenType("AND")
    val OR = MotokoTokenType("OR")
    val LT = MotokoTokenType("LT")
    val GT = MotokoTokenType("GT")
    val LE = MotokoTokenType("LE")
    val GE = MotokoTokenType("GE")
    val ARROW = MotokoTokenType("ARROW")
    val FAT_ARROW = MotokoTokenType("FAT_ARROW")
    val QUESTION = MotokoTokenType("QUESTION")
    val DOUBLE_QUESTION = MotokoTokenType("DOUBLE_QUESTION")

    // Literals
    val IDENTIFIER = MotokoTokenType("IDENTIFIER")
    val NUMBER = MotokoTokenType("NUMBER")
    val STRING_LITERAL = MotokoTokenType("STRING_LITERAL")
    val CHAR = MotokoTokenType("CHAR")
    val LINE_COMMENT = MotokoTokenType("LINE_COMMENT")
    val BLOCK_COMMENT = MotokoTokenType("BLOCK_COMMENT")

    // Collections of token types
    val KEYWORDS = setOf(
        ACTOR, MODULE, FUNC, VAR, LET, TYPE, CLASS, OBJECT,
        PUBLIC, PRIVATE, SHARED, QUERY, ONE_WAY, ASYNC, AWAIT,
        TRY, CATCH, THROW, IF, ELSE, SWITCH, CASE, WHILE,
        FOR, IN, RETURN, BREAK, CONTINUE, IMPORT,
        EXPORT, NULL, TRUE, FALSE
    )

    val OPERATORS = setOf(
        EQ, EQEQ, NEQ, PLUS, MINUS, MUL, DIV, MOD, NOT,
        AND, OR, LT, GT, LE, GE, ARROW, FAT_ARROW, QUESTION, DOUBLE_QUESTION
    )

    val BRACKETS = setOf(
        LPAREN, RPAREN, LBRACE, RBRACE, LBRACK, RBRACK
    )

    val COMMENT_TOKENS = setOf(
        LINE_COMMENT, BLOCK_COMMENT
    )
} 