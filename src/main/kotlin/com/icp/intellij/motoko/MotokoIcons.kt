package com.icp.intellij.motoko

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object MotokoIcons {
    val FILE: Icon = IconLoader.getIcon("/icons/motoko.png", MotokoIcons::class.java)
    val ACTOR: Icon = IconLoader.getIcon("/icons/actor.svg", MotokoIcons::class.java)
    val MODULE: Icon = IconLoader.getIcon("/icons/module.svg", MotokoIcons::class.java)
    val FUNCTION: Icon = IconLoader.getIcon("/icons/function.svg", MotokoIcons::class.java)
} 