package com.icp.intellij.rust

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object RustIcons {
    val FILE: Icon = IconLoader.getIcon("/icons/rust.svg", RustIcons::class.java)
    val FUNCTION: Icon = IconLoader.getIcon("/icons/rust_function.svg", RustIcons::class.java)
    val STRUCT: Icon = IconLoader.getIcon("/icons/rust_struct.svg", RustIcons::class.java)
    val TRAIT: Icon = IconLoader.getIcon("/icons/rust_trait.svg", RustIcons::class.java)
}