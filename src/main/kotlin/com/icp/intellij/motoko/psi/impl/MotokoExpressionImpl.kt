package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoExpression

class MotokoExpressionImpl(node: ASTNode) : MotokoElementImpl(node), MotokoExpression 