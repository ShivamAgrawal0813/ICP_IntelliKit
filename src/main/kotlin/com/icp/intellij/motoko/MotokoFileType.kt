package com.icp.intellij.motoko

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class MotokoFileType : LanguageFileType(MotokoLanguage.INSTANCE) {
    override fun getName(): String = "Motoko"
    
    override fun getDescription(): @NlsContexts.Label String = "Motoko language file"
    
    override fun getDefaultExtension(): @NonNls String = "mo"
    
    override fun getIcon(): Icon = MotokoIcons.FILE
    
    companion object {
        val INSTANCE = MotokoFileType()
    }
} 