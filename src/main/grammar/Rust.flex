package com.icp.intellij.rust.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.icp.intellij.rust.psi.RustTokenTypes;
import com.intellij.psi.TokenType;

%%

%public
%class RustLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITESPACE=[\s\t\n\r]+
LINE_COMMENT="//"[^\n]*
BLOCK_COMMENT="/*"([^"*"]|"*"[^"/"])*"*/"
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
LIFETIME="'"[a-zA-Z_][a-zA-Z0-9_]*
STRING_LITERAL="\""([^\\\"]|\\.)*"\""
CHAR_LITERAL="'"([^\\']|\\.)*"'"
INTEGER_LITERAL=[0-9]+
FLOAT_LITERAL=[0-9]+\.[0-9]+([eE][+-]?[0-9]+)?

%%

<YYINITIAL> {
  {WHITESPACE}        { return TokenType.WHITE_SPACE; }
  {LINE_COMMENT}      { return RustTokenTypes.LINE_COMMENT; }
  {BLOCK_COMMENT}     { return RustTokenTypes.BLOCK_COMMENT; }
  
  // Keywords
  "mod"               { return RustTokenTypes.MOD; }
  "fn"                { return RustTokenTypes.FN; }
  "struct"            { return RustTokenTypes.STRUCT; }
  "enum"              { return RustTokenTypes.ENUM; }
  "trait"             { return RustTokenTypes.TRAIT; }
  "impl"              { return RustTokenTypes.IMPL; }
  "pub"               { return RustTokenTypes.PUB; }
  "crate"             { return RustTokenTypes.CRATE; }
  "super"             { return RustTokenTypes.SUPER; }
  "self"              { return RustTokenTypes.SELF; }
  "in"                { return RustTokenTypes.IN; }
  "let"               { return RustTokenTypes.LET; }
  "mut"               { return RustTokenTypes.MUT; }
  "const"             { return RustTokenTypes.CONST; }
  "static"            { return RustTokenTypes.STATIC; }
  "type"              { return RustTokenTypes.TYPE; }
  "use"               { return RustTokenTypes.USE; }
  "return"            { return RustTokenTypes.RETURN; }
  "if"                { return RustTokenTypes.IF; }
  "else"              { return RustTokenTypes.ELSE; }
  "match"             { return RustTokenTypes.MATCH; }
  "loop"              { return RustTokenTypes.LOOP; }
  "while"             { return RustTokenTypes.WHILE; }
  "for"               { return RustTokenTypes.FOR; }
  "true"              { return RustTokenTypes.TRUE; }
  "false"             { return RustTokenTypes.FALSE; }
  "as"                { return RustTokenTypes.AS; }
  "where"             { return RustTokenTypes.WHERE; }
  
  // Operators
  "="                 { return RustTokenTypes.EQ; }
  "+"                 { return RustTokenTypes.PLUS; }
  "-"                 { return RustTokenTypes.MINUS; }
  "*"                 { return RustTokenTypes.MUL; }
  "/"                 { return RustTokenTypes.DIV; }
  "%"                 { return RustTokenTypes.MOD; }
  "&"                 { return RustTokenTypes.AND; }
  "|"                 { return RustTokenTypes.OR; }
  "^"                 { return RustTokenTypes.XOR; }
  "<<"                { return RustTokenTypes.SHL; }
  ">>"                { return RustTokenTypes.SHR; }
  "=="                { return RustTokenTypes.EQEQ; }
  "!="                { return RustTokenTypes.NEQ; }
  "<"                 { return RustTokenTypes.LT; }
  "<="                { return RustTokenTypes.LTEQ; }
  ">"                 { return RustTokenTypes.GT; }
  ">="                { return RustTokenTypes.GTEQ; }
  "&&"                { return RustTokenTypes.ANDAND; }
  "||"                { return RustTokenTypes.OROR; }
  "!"                 { return RustTokenTypes.NOT; }
  "+="                { return RustTokenTypes.PLUSEQ; }
  "-="                { return RustTokenTypes.MINUSEQ; }
  "*="                { return RustTokenTypes.MULEQ; }
  "/="                { return RustTokenTypes.DIVEQ; }
  "%="                { return RustTokenTypes.MODEQ; }
  "&="                { return RustTokenTypes.ANDEQ; }
  "|="                { return RustTokenTypes.OREQ; }
  "^="                { return RustTokenTypes.XOREQ; }
  "<<="               { return RustTokenTypes.SHLEQ; }
  ">>="               { return RustTokenTypes.SHREQ; }
  "->"                { return RustTokenTypes.ARROW; }
  "=>"                { return RustTokenTypes.FAT_ARROW; }
  ".."                { return RustTokenTypes.DOTDOT; }
  "..="               { return RustTokenTypes.DOTDOTEQ; }
  
  // Delimiters
  "("                 { return RustTokenTypes.LPAREN; }
  ")"                 { return RustTokenTypes.RPAREN; }
  "{"                 { return RustTokenTypes.LBRACE; }
  "}"                 { return RustTokenTypes.RBRACE; }
  "["                 { return RustTokenTypes.LBRACK; }
  "]"                 { return RustTokenTypes.RBRACK; }
  ";"                 { return RustTokenTypes.SEMICOLON; }
  ","                 { return RustTokenTypes.COMMA; }
  ":"                 { return RustTokenTypes.COLON; }
  "::"                { return RustTokenTypes.COLONCOLON; }
  "."                 { return RustTokenTypes.DOT; }
  "#"                 { return RustTokenTypes.HASH; }
  
  // Literals
  {STRING_LITERAL}    { return RustTokenTypes.STRING_LITERAL; }
  {CHAR_LITERAL}      { return RustTokenTypes.CHAR_LITERAL; }
  {INTEGER_LITERAL}   { return RustTokenTypes.INTEGER_LITERAL; }
  {FLOAT_LITERAL}     { return RustTokenTypes.FLOAT_LITERAL; }
  {LIFETIME}          { return RustTokenTypes.LIFETIME; }
  {IDENTIFIER}        { return RustTokenTypes.IDENTIFIER; }
  
  // Catch all
  [^]                 { return TokenType.BAD_CHARACTER; }
}