package com.icp.intellij.rust

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class RustFileType : LanguageFileType(RustLanguage.INSTANCE) {
    override fun getName(): String = "Rust"
    
    override fun getDescription(): @NlsContexts.Label String = "Rust language file"
    
    override fun getDefaultExtension(): @NonNls String = "rs"
    
    override fun getIcon(): Icon = RustIcons.FILE
    
    companion object {
        val INSTANCE = RustFileType()
    }
}