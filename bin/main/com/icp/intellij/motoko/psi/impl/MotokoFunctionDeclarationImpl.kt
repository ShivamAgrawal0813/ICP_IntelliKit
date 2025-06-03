package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoFunctionDeclaration

class MotokoFunctionDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoFunctionDeclaration 