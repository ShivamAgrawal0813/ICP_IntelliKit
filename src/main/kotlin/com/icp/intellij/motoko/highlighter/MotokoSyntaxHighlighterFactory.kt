package com.icp.intellij.motoko.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.icp.intellij.motoko.MotokoLanguage
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as DefaultColors

class MotokoSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
        return MotokoSyntaxHighlighter()
    }

    companion object {
        val KEYWORDS = TextAttributesKey.createTextAttributesKey("MOTOKO_KEYWORD", DefaultColors.KEYWORD)
        val STRING = TextAttributesKey.createTextAttributesKey("MOTOKO_STRING", DefaultColors.STRING)
        val NUMBER = TextAttributesKey.createTextAttributesKey("MOTOKO_NUMBER", DefaultColors.NUMBER)
        val COMMENT = TextAttributesKey.createTextAttributesKey("MOTOKO_COMMENT", DefaultColors.LINE_COMMENT)
        val OPERATOR = TextAttributesKey.createTextAttributesKey("MOTOKO_OPERATOR", DefaultColors.OPERATION_SIGN)
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey("MOTOKO_IDENTIFIER", DefaultColors.IDENTIFIER)
    }
} 