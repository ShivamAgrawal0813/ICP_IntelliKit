package com.icp.intellij.rust.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import com.icp.intellij.rust.RustLanguage

interface RustTokenTypes {
    companion object {
        // Keywords
        val MOD = IElementType("MOD", RustLanguage.INSTANCE)
        val FN = IElementType("FN", RustLanguage.INSTANCE)
        val STRUCT = IElementType("STRUCT", RustLanguage.INSTANCE)
        val ENUM = IElementType("ENUM", RustLanguage.INSTANCE)
        val TRAIT = IElementType("TRAIT", RustLanguage.INSTANCE)
        val IMPL = IElementType("IMPL", RustLanguage.INSTANCE)
        val PUB = IElementType("PUB", RustLanguage.INSTANCE)
        val CRATE = IElementType("CRATE", RustLanguage.INSTANCE)
        val SUPER = IElementType("SUPER", RustLanguage.INSTANCE)
        val SELF = IElementType("SELF", RustLanguage.INSTANCE)
        val IN = IElementType("IN", RustLanguage.INSTANCE)
        val LET = IElementType("LET", RustLanguage.INSTANCE)
        val MUT = IElementType("MUT", RustLanguage.INSTANCE)
        val CONST = IElementType("CONST", RustLanguage.INSTANCE)
        val STATIC = IElementType("STATIC", RustLanguage.INSTANCE)
        val TYPE = IElementType("TYPE", RustLanguage.INSTANCE)
        val USE = IElementType("USE", RustLanguage.INSTANCE)
        val RETURN = IElementType("RETURN", RustLanguage.INSTANCE)
        val IF = IElementType("IF", RustLanguage.INSTANCE)
        val ELSE = IElementType("ELSE", RustLanguage.INSTANCE)
        val MATCH = IElementType("MATCH", RustLanguage.INSTANCE)
        val LOOP = IElementType("LOOP", RustLanguage.INSTANCE)
        val WHILE = IElementType("WHILE", RustLanguage.INSTANCE)
        val FOR = IElementType("FOR", RustLanguage.INSTANCE)
        val TRUE = IElementType("TRUE", RustLanguage.INSTANCE)
        val FALSE = IElementType("FALSE", RustLanguage.INSTANCE)
        val AS = IElementType("AS", RustLanguage.INSTANCE)
        val WHERE = IElementType("WHERE", RustLanguage.INSTANCE)
        
        // Literals
        val STRING_LITERAL = IElementType("STRING_LITERAL", RustLanguage.INSTANCE)
        val CHAR_LITERAL = IElementType("CHAR_LITERAL", RustLanguage.INSTANCE)
        val INTEGER_LITERAL = IElementType("INTEGER_LITERAL", RustLanguage.INSTANCE)
        val FLOAT_LITERAL = IElementType("FLOAT_LITERAL", RustLanguage.INSTANCE)
        val LIFETIME = IElementType("LIFETIME", RustLanguage.INSTANCE)
        val IDENTIFIER = IElementType("IDENTIFIER", RustLanguage.INSTANCE)
        
        // Comments
        val LINE_COMMENT = IElementType("LINE_COMMENT", RustLanguage.INSTANCE)
        val BLOCK_COMMENT = IElementType("BLOCK_COMMENT", RustLanguage.INSTANCE)
        
        // Token Sets
        val WHITESPACE_TOKENS = TokenSet.create(
            com.intellij.psi.TokenType.WHITE_SPACE
        )
        
        val COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT,
            BLOCK_COMMENT
        )
        
        val STRING_LITERALS = TokenSet.create(
            STRING_LITERAL,
            CHAR_LITERAL
        )
        
        val KEYWORDS = TokenSet.create(
            MOD, FN, STRUCT, ENUM, TRAIT, IMPL, PUB, CRATE, SUPER, SELF, IN, LET, MUT,
            CONST, STATIC, TYPE, USE, RETURN, IF, ELSE, MATCH, LOOP, WHILE, FOR, TRUE, FALSE,
            AS, WHERE
        )
    }
}

// Operators and symbols
// ... (similar to Motoko but with Rust-specific operators)

// PSI Elements
val MODULE_DECLARATION = IElementType("MODULE_DECLARATION", RustLanguage.INSTANCE)
val FUNCTION_DECLARATION = IElementType("FUNCTION_DECLARATION", RustLanguage.INSTANCE)
val STRUCT_DECLARATION = IElementType("STRUCT_DECLARATION", RustLanguage.INSTANCE)
val IMPL_DECLARATION = IElementType("IMPL_DECLARATION", RustLanguage.INSTANCE)
val TRAIT_DECLARATION = IElementType("TRAIT_DECLARATION", RustLanguage.INSTANCE)
val USE_DECLARATION = IElementType("USE_DECLARATION", RustLanguage.INSTANCE)

// Token Sets
// ... (similar to Motoko but with Rust-specific token sets)

object Factory {
    fun createElement(node: com.intellij.lang.ASTNode): com.intellij.psi.PsiElement {
        val type = node.elementType
        // Create appropriate PSI elements based on the element type
        return com.intellij.psi.impl.source.tree.LeafPsiElement(type, node.text)
    }
}