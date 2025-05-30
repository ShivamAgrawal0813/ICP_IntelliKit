package com.icp.intellij.motoko.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.icp.intellij.motoko.psi.impl.*

object MotokoFactory {
    fun createElement(node: ASTNode): PsiElement {
        val type = node.elementType
        return when (type) {
            MotokoTypes.ACTOR_DECLARATION -> MotokoActorDeclarationImpl(node)
            MotokoTypes.MODULE_DECLARATION -> MotokoModuleDeclarationImpl(node)
            MotokoTypes.TYPE_DECLARATION -> MotokoTypeDeclarationImpl(node)
            MotokoTypes.FUNCTION_DECLARATION -> MotokoFunctionDeclarationImpl(node)
            MotokoTypes.VARIABLE_DECLARATION -> MotokoVariableDeclarationImpl(node)
            MotokoTypes.PARAMETER -> MotokoParameterImpl(node)
            MotokoTypes.TYPE_EXPRESSION -> MotokoTypeExpressionImpl(node)
            MotokoTypes.EXPRESSION -> MotokoExpressionImpl(node)
            MotokoTypes.STATEMENT -> MotokoStatementImpl(node)
            else -> LeafPsiElement(type, node.text)
        }
    }
} 