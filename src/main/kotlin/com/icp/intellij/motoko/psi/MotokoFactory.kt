package com.icp.intellij.motoko.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.icp.intellij.motoko.psi.impl.*

object MotokoFactory {
    fun createElement(node: ASTNode): PsiElement {
        return when (node.elementType) {
            MotokoElementTypes.ACTOR_DECLARATION -> MotokoActorDeclarationImpl(node)
            MotokoElementTypes.MODULE_DECLARATION -> MotokoModuleDeclarationImpl(node)
            MotokoElementTypes.TYPE_DECLARATION -> MotokoTypeDeclarationImpl(node)
            MotokoElementTypes.FUNCTION_DECLARATION -> MotokoFunctionDeclarationImpl(node)
            MotokoElementTypes.VARIABLE_DECLARATION -> MotokoVariableDeclarationImpl(node)
            MotokoElementTypes.PARAMETER -> MotokoParameterImpl(node)
            MotokoElementTypes.TYPE_EXPRESSION -> MotokoTypeExpressionImpl(node)
            MotokoElementTypes.EXPRESSION -> MotokoExpressionImpl(node)
            MotokoElementTypes.STATEMENT -> MotokoStatementImpl(node)
            else -> throw IllegalArgumentException("Unknown element type: ${node.elementType}")
        }
    }
} 