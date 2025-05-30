package com.icp.intellikit.lexer

import com.intellij.lexer.FlexLexer
import com.intellij.psi.tree.IElementType
import com.icp.intellikit.psi.MotokoTypes
import com.intellij.psi.TokenType

%%

%class MotokoLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("//")[^\r\n]*
BLOCK_COMMENT="/*"([^*]|"*"+[^*/])*"*"+"/"

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
NUMBER=[0-9]+
STRING=\"([^\\\"\r\n]|\\t|\\u|\\n|\\r|\\\"|\\\'|\\\\|[0-7][0-7]?|[0-3][0-7]{2})*\"

%state WAITING_VALUE

%%

<YYINITIAL> {
  "actor"                           { return MotokoTypes.ACTOR; }
  "module"                          { return MotokoTypes.MODULE; }
  "type"                            { return MotokoTypes.TYPE; }
  "func"                            { return MotokoTypes.FUNC; }
  "let"                             { return MotokoTypes.LET; }
  "var"                             { return MotokoTypes.VAR; }
  "return"                          { return MotokoTypes.RETURN; }
  "if"                              { return MotokoTypes.IF; }
  "else"                            { return MotokoTypes.ELSE; }
  "loop"                            { return MotokoTypes.LOOP; }
  "public"                          { return MotokoTypes.PUBLIC; }
  "private"                         { return MotokoTypes.PRIVATE; }
  "shared"                          { return MotokoTypes.SHARED; }
  "Nat"                             { return MotokoTypes.NAT; }
  "Int"                             { return MotokoTypes.INT; }
  "Bool"                            { return MotokoTypes.BOOL; }
  "Text"                            { return MotokoTypes.TEXT; }
  "Float"                           { return MotokoTypes.FLOAT; }
  "true"                            { return MotokoTypes.TRUE; }
  "false"                           { return MotokoTypes.FALSE; }
  "null"                            { return MotokoTypes.NULL; }
  
  "="                               { return MotokoTypes.EQ; }
  "=="                              { return MotokoTypes.EQEQ; }
  "!="                              { return MotokoTypes.NEQ; }
  "<"                               { return MotokoTypes.LT; }
  "<="                              { return MotokoTypes.LTE; }
  ">"                               { return MotokoTypes.GT; }
  ">="                              { return MotokoTypes.GTE; }
  "+"                               { return MotokoTypes.PLUS; }
  "-"                               { return MotokoTypes.MINUS; }
  "*"                               { return MotokoTypes.MUL; }
  "/"                               { return MotokoTypes.DIV; }
  "("                               { return MotokoTypes.LPAREN; }
  ")"                               { return MotokoTypes.RPAREN; }
  "{"                               { return MotokoTypes.LBRACE; }
  "}"                               { return MotokoTypes.RBRACE; }
  "["                               { return MotokoTypes.LBRACK; }
  "]"                               { return MotokoTypes.RBRACK; }
  ";"                               { return MotokoTypes.SEMICOLON; }
  ","                               { return MotokoTypes.COMMA; }
  ":"                               { return MotokoTypes.COLON; }
  "->"                              { return MotokoTypes.ARROW; }
  
  {IDENTIFIER}                      { return MotokoTypes.IDENTIFIER; }
  {NUMBER}                          { return MotokoTypes.NUMBER; }
  {STRING}                          { return MotokoTypes.STRING; }
  {END_OF_LINE_COMMENT}             { return MotokoTypes.COMMENT; }
  {BLOCK_COMMENT}                   { return MotokoTypes.COMMENT; }
  {WHITE_SPACE}+                    { return TokenType.WHITE_SPACE; }
  
  [^]                               { return TokenType.BAD_CHARACTER; }
} 