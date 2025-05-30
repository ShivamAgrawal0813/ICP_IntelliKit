package com.icp.intellij.rust

import com.intellij.lang.Language

class RustLanguage : Language("Rust") {
    companion object {
        val INSTANCE = RustLanguage()
    }
}