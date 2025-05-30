package com.icp.intellij.motoko.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.icp.intellij.motoko.psi.MotokoTypes;
import com.intellij.psi.TokenType;

%%

%public
%class MotokoLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
  private int zzStartRead;
  private int zzEndRead;
  private int zzCurrentPos;
  private int zzMarkedPos;
  private int zzBufferStart;
  private int zzBufferEnd;
  private char[] zzBuffer;
  private int zzAtEOF;
  private int zzAtBOL;
  private int zzState;
  private int zzLexicalState;
  private int zzReader;
  private int zzLine;
  private int zzColumn;
  private int zzEOFDone;
  private int zzStartRead;
  private int zzEndRead;
  private int zzCurrentPos;
  private int zzMarkedPos;
  private int zzBufferStart;
  private int zzBufferEnd;
  private char[] zzBuffer;
  private int zzAtEOF;
  private int zzAtBOL;
  private int zzState;
  private int zzLexicalState;
  private int zzReader;
  private int zzLine;
  private int zzColumn;
  private int zzEOFDone;

  public MotokoLexer() {
    this((java.io.Reader)null);
  }

  public void start(CharSequence buffer, int startOffset, int endOffset, int initialState) {
    zzBuffer = buffer.toString().toCharArray();
    zzStartRead = startOffset;
    zzEndRead = endOffset;
    zzCurrentPos = startOffset;
    zzMarkedPos = startOffset;
    zzBufferStart = startOffset;
    zzBufferEnd = endOffset;
    zzAtEOF = false;
    zzAtBOL = true;
    zzState = initialState;
    zzLexicalState = YYINITIAL;
    zzLine = 0;
    zzColumn = 0;
    zzEOFDone = false;
  }

  public int getState() {
    return zzState;
  }

  public void setState(int state) {
    zzState = state;
  }

  public int getTokenStart() {
    return zzStartRead;
  }

  public int getTokenEnd() {
    return zzMarkedPos;
  }

  public void advance() {
    advance();
  }
%}

WHITESPACE=[\s\t\n\r]+
LINE_COMMENT="//"[^\n]*
BLOCK_COMMENT="/*"([^"*"]|"*"[^"/"])*"*/"
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
STRING_LITERAL="\""([^\\\"]|\\.)*"\""
NUMBER_LITERAL=[0-9]+(\.[0-9]+)?

%%

<YYINITIAL> {
  {WHITESPACE}        { return TokenType.WHITE_SPACE; }
  {LINE_COMMENT}      { return MotokoTypes.COMMENT; }
  {BLOCK_COMMENT}     { return MotokoTypes.COMMENT; }
  
  // Keywords
  "actor"             { return MotokoTypes.ACTOR; }
  "module"            { return MotokoTypes.MODULE; }
  "func"              { return MotokoTypes.FUNC; }
  "let"               { return MotokoTypes.LET; }
  "var"               { return MotokoTypes.VAR; }
  "type"              { return MotokoTypes.TYPE; }
  "class"             { return MotokoTypes.CLASS; }
  "object"            { return MotokoTypes.OBJECT; }
  "public"            { return MotokoTypes.PUBLIC; }
  "private"           { return MotokoTypes.PRIVATE; }
  "shared"            { return MotokoTypes.SHARED; }
  "return"            { return MotokoTypes.RETURN; }
  "if"                { return MotokoTypes.IF; }
  "else"              { return MotokoTypes.ELSE; }
  "loop"              { return MotokoTypes.LOOP; }
  "true"              { return MotokoTypes.TRUE; }
  "false"             { return MotokoTypes.FALSE; }
  "null"              { return MotokoTypes.NULL; }
  
  // Operators
  "="                 { return MotokoTypes.EQ; }
  "+"                 { return MotokoTypes.PLUS; }
  "-"                 { return MotokoTypes.MINUS; }
  "*"                 { return MotokoTypes.MUL; }
  "/"                 { return MotokoTypes.DIV; }
  "=="                { return MotokoTypes.EQEQ; }
  "!="                { return MotokoTypes.NEQ; }
  "<"                 { return MotokoTypes.LT; }
  "<="                { return MotokoTypes.LTE; }
  ">"                 { return MotokoTypes.GT; }
  ">="                { return MotokoTypes.GTE; }
  "->"                { return MotokoTypes.ARROW; }
  
  // Delimiters
  "("                 { return MotokoTypes.LPAREN; }
  ")"                 { return MotokoTypes.RPAREN; }
  "{"                 { return MotokoTypes.LBRACE; }
  "}"                 { return MotokoTypes.RBRACE; }
  "["                 { return MotokoTypes.LBRACK; }
  "]"                 { return MotokoTypes.RBRACK; }
  ";"                 { return MotokoTypes.SEMICOLON; }
  ","                 { return MotokoTypes.COMMA; }
  ":"                 { return MotokoTypes.COLON; }
  "."                 { return MotokoTypes.DOT; }
  
  // Literals
  {STRING_LITERAL}    { return MotokoTypes.STRING; }
  {NUMBER_LITERAL}    { return MotokoTypes.NUMBER; }
  {IDENTIFIER}        { return MotokoTypes.IDENTIFIER; }
  
  // Catch all
  [^]                 { return TokenType.BAD_CHARACTER; }
}