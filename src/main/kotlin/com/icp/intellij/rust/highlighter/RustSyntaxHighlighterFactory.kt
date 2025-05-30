package com.icp.intellij.rust.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class RustSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
        return RustSyntaxHighlighter()
    }

    companion object {
        val KEYWORDS = TextAttributesKey.createTextAttributesKey("RUST_KEYWORD")
        val STRING = TextAttributesKey.createTextAttributesKey("RUST_STRING")
        val NUMBER = TextAttributesKey.createTextAttributesKey("RUST_NUMBER")
        val COMMENT = TextAttributesKey.createTextAttributesKey("RUST_COMMENT")
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey("RUST_IDENTIFIER")
        val LIFETIME = TextAttributesKey.createTextAttributesKey("RUST_LIFETIME")
    }
}