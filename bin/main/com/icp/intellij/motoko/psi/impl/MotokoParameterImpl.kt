package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoParameter

class MotokoParameterImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoParameter 