package com.icp.intellij.motoko.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.icp.intellij.motoko.psi.MotokoElement

abstract class MotokoElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), MotokoElement 