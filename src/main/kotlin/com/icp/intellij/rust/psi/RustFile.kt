package com.icp.intellij.rust.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.icp.intellij.rust.RustFileType
import com.icp.intellij.rust.RustLanguage

class RustFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RustLanguage.INSTANCE) {
    override fun getFileType(): FileType = RustFileType.INSTANCE

    override fun toString(): String = "Rust File"
}