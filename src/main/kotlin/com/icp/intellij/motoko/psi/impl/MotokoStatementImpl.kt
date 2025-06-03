package com.icp.intellij.motoko.psi.impl

import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoStatement

class MotokoStatementImpl(node: ASTNode) : MotokoElementImpl(node), MotokoStatement 