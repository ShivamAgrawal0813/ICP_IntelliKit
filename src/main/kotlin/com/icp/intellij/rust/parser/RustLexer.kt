package com.icp.intellij.rust.parser

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class RustLexer : FlexAdapter(com.icp.intellij.rust.lexer.RustLexer(Reader.nullReader()))