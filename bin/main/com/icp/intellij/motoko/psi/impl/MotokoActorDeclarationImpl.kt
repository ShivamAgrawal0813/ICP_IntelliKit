package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoActorDeclaration

class MotokoActorDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoActorDeclaration 