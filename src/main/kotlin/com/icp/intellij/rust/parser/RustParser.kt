package com.icp.intellij.rust.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.psi.tree.IElementType
import com.icp.intellikit.psi.RustTypes

class RustParser : PsiParser {
    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        val rootMarker = builder.mark()
        
        while (!builder.eof()) {
            when (builder.tokenType) {
                RustTypes.MOD_KW -> parseModuleDeclaration(builder)
                RustTypes.FN_KW -> parseFunctionDeclaration(builder)
                RustTypes.STRUCT_KW -> parseStructDeclaration(builder)
                RustTypes.IMPL_KW -> parseImplDeclaration(builder)
                RustTypes.TRAIT_KW -> parseTraitDeclaration(builder)
                RustTypes.USE_KW -> parseUseDeclaration(builder)
                else -> builder.advanceLexer()
            }
        }
        
        rootMarker.done(root)
        return builder.treeBuilt
    }

    private fun parseModuleDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // MOD_KW
        builder.advanceLexer() // IDENTIFIER
        if (builder.tokenType == RustTypes.LBRACE) {
            parseBlock(builder)
        }
        marker.done(RustTypes.MODULE_DECLARATION)
    }

    private fun parseFunctionDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // FN_KW
        builder.advanceLexer() // IDENTIFIER
        parseParameters(builder)
        if (builder.tokenType == RustTypes.ARROW) {
            builder.advanceLexer()
            parseType(builder)
        }
        parseBlock(builder)
        marker.done(RustTypes.FUNCTION_DECLARATION)
    }

    private fun parseStructDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // STRUCT_KW
        builder.advanceLexer() // IDENTIFIER
        parseStructBody(builder)
        marker.done(RustTypes.STRUCT_DECLARATION)
    }

    private fun parseImplDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // IMPL_KW
        parseType(builder)
        parseImplBody(builder)
        marker.done(RustTypes.IMPL_DECLARATION)
    }

    private fun parseTraitDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // TRAIT_KW
        builder.advanceLexer() // IDENTIFIER
        parseTraitBody(builder)
        marker.done(RustTypes.TRAIT_DECLARATION)
    }

    private fun parseUseDeclaration(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // USE_KW
        parsePath(builder)
        marker.done(RustTypes.USE_DECLARATION)
    }

    private fun parseBlock(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // LBRACE
        while (builder.tokenType != RustTypes.RBRACE && !builder.eof()) {
            builder.advanceLexer()
        }
        if (builder.tokenType == RustTypes.RBRACE) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.BLOCK)
    }

    private fun parseParameters(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // LPAREN
        while (builder.tokenType != RustTypes.RPAREN && !builder.eof()) {
            builder.advanceLexer()
        }
        if (builder.tokenType == RustTypes.RPAREN) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.PARAMETERS)
    }

    private fun parseType(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // IDENTIFIER
        marker.done(RustTypes.TYPE)
    }

    private fun parsePath(builder: PsiBuilder) {
        val marker = builder.mark()
        while (builder.tokenType == RustTypes.IDENTIFIER || builder.tokenType == RustTypes.DOUBLE_COLON) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.PATH)
    }

    private fun parseStructBody(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // LBRACE
        while (builder.tokenType != RustTypes.RBRACE && !builder.eof()) {
            builder.advanceLexer()
        }
        if (builder.tokenType == RustTypes.RBRACE) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.STRUCT_BODY)
    }

    private fun parseImplBody(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // LBRACE
        while (builder.tokenType != RustTypes.RBRACE && !builder.eof()) {
            builder.advanceLexer()
        }
        if (builder.tokenType == RustTypes.RBRACE) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.IMPL_BODY)
    }

    private fun parseTraitBody(builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer() // LBRACE
        while (builder.tokenType != RustTypes.RBRACE && !builder.eof()) {
            builder.advanceLexer()
        }
        if (builder.tokenType == RustTypes.RBRACE) {
            builder.advanceLexer()
        }
        marker.done(RustTypes.TRAIT_BODY)
    }
}