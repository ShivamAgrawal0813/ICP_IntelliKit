package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoNamedElement
import com.icp.intellij.motoko.psi.MotokoTypes

abstract class MotokoNamedElementImpl(node: ASTNode) : MotokoElementImpl(node), MotokoNamedElement {
    override fun getName(): String? {
        val identifier = node.findChildByType(MotokoTypes.IDENTIFIER)
        return identifier?.text
    }
} 