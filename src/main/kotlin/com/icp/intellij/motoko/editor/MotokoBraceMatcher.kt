package com.icp.intellij.motoko.editor

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.psi.MotokoTokenTypes

class MotokoBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(
        lbraceType: IElementType,
        contextType: IElementType?
    ): Boolean = true

    override fun getCodeConstructStart(file: PsiFile, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(MotokoTokenTypes.LPAREN, MotokoTokenTypes.RPAREN, false),
            BracePair(MotokoTokenTypes.LBRACE, MotokoTokenTypes.RBRACE, true),
            BracePair(MotokoTokenTypes.LBRACK, MotokoTokenTypes.RBRACK, false)
        )
    }
}