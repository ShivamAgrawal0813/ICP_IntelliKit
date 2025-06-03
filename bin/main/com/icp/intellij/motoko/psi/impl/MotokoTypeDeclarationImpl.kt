package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoTypeDeclaration

class MotokoTypeDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoTypeDeclaration 