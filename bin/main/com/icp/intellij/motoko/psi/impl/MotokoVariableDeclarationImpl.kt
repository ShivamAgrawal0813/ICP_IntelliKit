package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoVariableDeclaration

class MotokoVariableDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoVariableDeclaration 