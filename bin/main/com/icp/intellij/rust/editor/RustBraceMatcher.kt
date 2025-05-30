package com.icp.intellij.rust.editor

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.icp.intellikit.psi.RustTypes

class RustBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
        BracePair(RustTypes.LPAREN, RustTypes.RPAREN, false),
        BracePair(RustTypes.LBRACE, RustTypes.RBRACE, false),
        BracePair(RustTypes.LBRACK, RustTypes.RBRACK, false)
    )

    override fun isPairedBracesAllowedBeforeType(
        lbraceType: IElementType,
        contextType: IElementType?
    ): Boolean = true

    override fun getCodeConstructStart(file: PsiFile, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(RustTypes.LPAREN, RustTypes.RPAREN, false),
            BracePair(RustTypes.LBRACE, RustTypes.RBRACE, true),
            BracePair(RustTypes.LBRACK, RustTypes.RBRACK, false)
        )
    }
}