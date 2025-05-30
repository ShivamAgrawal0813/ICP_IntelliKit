package com.icp.intellij.motoko.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.icp.intellij.motoko.MotokoFileType
import com.icp.intellij.motoko.MotokoLanguage

class MotokoFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MotokoLanguage.INSTANCE) {
    override fun getFileType(): FileType = MotokoFileType.INSTANCE

    override fun toString(): String = "Motoko File"
} 