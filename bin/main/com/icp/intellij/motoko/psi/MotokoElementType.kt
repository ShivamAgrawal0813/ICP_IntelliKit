package com.icp.intellij.motoko.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.icp.intellij.motoko.MotokoLanguage

class MotokoElementType(debugName: String) : IElementType(debugName, MotokoLanguage.INSTANCE) {
    override fun toString(): String = "MotokoElementType." + super.toString()
}

object MotokoElementTypes {
    val FILE = IFileElementType(MotokoLanguage.INSTANCE)
    val ACTOR_DECLARATION = MotokoElementType("ACTOR_DECLARATION")
    val MODULE_DECLARATION = MotokoElementType("MODULE_DECLARATION")
    val TYPE_DECLARATION = MotokoElementType("TYPE_DECLARATION")
    val FUNCTION_DECLARATION = MotokoElementType("FUNCTION_DECLARATION")
    val VARIABLE_DECLARATION = MotokoElementType("VARIABLE_DECLARATION")
    val PARAMETER = MotokoElementType("PARAMETER")
    val TYPE_EXPRESSION = MotokoElementType("TYPE_EXPRESSION")
    val EXPRESSION = MotokoElementType("EXPRESSION")
    val STATEMENT = MotokoElementType("STATEMENT")
} 