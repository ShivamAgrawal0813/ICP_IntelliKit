package com.icp.intellij.motoko.psi

import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.MotokoLanguage

class MotokoElementType(debugName: String) : IElementType(debugName, MotokoLanguage.INSTANCE) {
    override fun toString(): String = "MotokoElementType." + super.toString()
} 