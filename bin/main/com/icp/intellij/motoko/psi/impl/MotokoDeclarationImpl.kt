package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoDeclaration

abstract class MotokoDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoDeclaration 