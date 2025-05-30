package com.icp.intellij.project

import com.intellij.ide.IconProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.icp.intellij.motoko.MotokoFileType
import com.icp.intellij.motoko.MotokoIcons
import com.icp.intellij.rust.RustFileType
import com.icp.intellij.rust.RustIcons
import javax.swing.Icon

class DfxIconProvider : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        if (element is PsiFile) {
            if (element.name == "dfx.json") {
                return DfxIcons.DFX_FILE
            }
            
            val fileType = element.fileType
            if (fileType == MotokoFileType.INSTANCE) {
                return MotokoIcons.FILE
            } else if (fileType == RustFileType.INSTANCE) {
                return RustIcons.FILE
            }
        } else if (element is PsiDirectory) {
            val dir = element.virtualFile
            if (isDfxCanisterDirectory(dir)) {
                return DfxIcons.CANISTER_FOLDER
            }
        }
        return null
    }
    
    private fun isDfxCanisterDirectory(dir: VirtualFile): Boolean {
        val parent = dir.parent ?: return false
        val dfxJson = parent.findChild("dfx.json") ?: return false
        return dfxJson.exists() && dir.findChild("src") != null
    }
}