package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoModuleDeclaration

class MotokoModuleDeclarationImpl(node: ASTNode) : MotokoNamedElementImpl(node), MotokoModuleDeclaration 