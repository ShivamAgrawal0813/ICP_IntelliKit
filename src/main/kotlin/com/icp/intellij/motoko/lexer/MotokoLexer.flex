package com.icp.intellij.motoko.lexer

import com.intellij.lexer.FlexLexer
import com.intellij.psi.tree.IElementType
import com.icp.intellij.motoko.psi.MotokoTypes
import com.intellij.psi.TokenType
import java.io.Reader

%%

%class MotokoLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
    public MotokoLexer() {
        this(null);
    }

    public MotokoLexer(Reader in) {
        super(in);
    }

    @Override
    public void reset(CharSequence buffer, int start, int end, int initialState) {
        super.reset(buffer, start, end, initialState);
    }

    @Override
    public void yybegin(int state) {
        super.yybegin(state);
    }

    @Override
    public int yystate() {
        return super.yystate();
    }

    @Override
    public void yyreset(Reader reader) {
        super.yyreset(reader);
    }

    @Override
    public void yyclose() throws java.io.IOException {
        super.yyclose();
    }

    @Override
    public void yylex() throws java.io.IOException {
        super.yylex();
    }

    @Override
    public void yy_do_eof() {
        super.yy_do_eof();
    }

    @Override
    public void yy_scan_error(int errorCode) {
        super.yy_scan_error(errorCode);
    }

    @Override
    public void yy_scan_error() {
        super.yy_scan_error();
    }

    @Override
    public void yy_scan_error(String message) {
        super.yy_scan_error(message);
    }

    @Override
    public void yy_scan_error(String message, int errorCode) {
        super.yy_scan_error(message, errorCode);
    }

    @Override
    public void yy_scan_error(String message, int errorCode, int line, int column) {
        super.yy_scan_error(message, errorCode, line, column);
    }

    @Override
    public void yy_scan_error(String message, int errorCode, int line, int column, int length) {
        super.yy_scan_error(message, errorCode, line, column, length);
    }
%}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state WAITING_VALUE
%state COMMENT

%%

<YYINITIAL> {
  {WHITE_SPACE}+                  { return TokenType.WHITE_SPACE; }
  
  "actor"                         { return MotokoTypes.ACTOR; }
  "module"                        { return MotokoTypes.MODULE; }
  "type"                          { return MotokoTypes.TYPE; }
  "func"                          { return MotokoTypes.FUNC; }
  "var"                           { return MotokoTypes.VAR; }
  "let"                           { return MotokoTypes.LET; }
  "class"                         { return MotokoTypes.CLASS; }
  "object"                        { return MotokoTypes.OBJECT; }
  "query"                         { return MotokoTypes.QUERY; }
  "oneway"                        { return MotokoTypes.ONE_WAY; }
  "async"                         { return MotokoTypes.ASYNC; }
  "await"                         { return MotokoTypes.AWAIT; }
  "try"                           { return MotokoTypes.TRY; }
  "catch"                         { return MotokoTypes.CATCH; }
  "throw"                         { return MotokoTypes.THROW; }
  "if"                            { return MotokoTypes.IF; }
  "else"                          { return MotokoTypes.ELSE; }
  "switch"                        { return MotokoTypes.SWITCH; }
  "case"                          { return MotokoTypes.CASE; }
  "while"                         { return MotokoTypes.WHILE; }
  "for"                           { return MotokoTypes.FOR; }
  "in"                            { return MotokoTypes.IN; }
  "return"                        { return MotokoTypes.RETURN; }
  "break"                         { return MotokoTypes.BREAK; }
  "continue"                      { return MotokoTypes.CONTINUE; }
  "import"                        { return MotokoTypes.IMPORT; }
  "export"                        { return MotokoTypes.EXPORT; }
  "public"                        { return MotokoTypes.PUBLIC; }
  "private"                       { return MotokoTypes.PRIVATE; }
  "shared"                        { return MotokoTypes.SHARED; }
  "stable"                        { return MotokoTypes.STABLE; }
  "flexible"                      { return MotokoTypes.FLEXIBLE; }
  "system"                        { return MotokoTypes.SYSTEM; }
  "debug"                         { return MotokoTypes.DEBUG; }
  "preupgrade"                    { return MotokoTypes.PREUPGRADE; }
  "postupgrade"                   { return MotokoTypes.POSTUPGRADE; }
  "true"                          { return MotokoTypes.TRUE; }
  "false"                         { return MotokoTypes.FALSE; }
  "null"                          { return MotokoTypes.NULL; }
  
  "("                             { return MotokoTypes.LPAREN; }
  ")"                             { return MotokoTypes.RPAREN; }
  "{"                             { return MotokoTypes.LBRACE; }
  "}"                             { return MotokoTypes.RBRACE; }
  "["                             { return MotokoTypes.LBRACK; }
  "]"                             { return MotokoTypes.RBRACK; }
  ";"                             { return MotokoTypes.SEMICOLON; }
  ","                             { return MotokoTypes.COMMA; }
  "."                             { return MotokoTypes.DOT; }
  ":"                             { return MotokoTypes.COLON; }
  "::"                            { return MotokoTypes.DOUBLE_COLON; }
  "="                             { return MotokoTypes.EQ; }
  "=="                            { return MotokoTypes.EQEQ; }
  "!="                            { return MotokoTypes.NEQ; }
  "+"                             { return MotokoTypes.PLUS; }
  "-"                             { return MotokoTypes.MINUS; }
  "*"                             { return MotokoTypes.MUL; }
  "/"                             { return MotokoTypes.DIV; }
  "%"                             { return MotokoTypes.MOD; }
  "!"                             { return MotokoTypes.NOT; }
  "&&"                            { return MotokoTypes.AND; }
  "||"                            { return MotokoTypes.OR; }
  "<"                             { return MotokoTypes.LT; }
  ">"                             { return MotokoTypes.GT; }
  "<="                            { return MotokoTypes.LE; }
  ">="                            { return MotokoTypes.GE; }
  "->"                            { return MotokoTypes.ARROW; }
  "=>"                            { return MotokoTypes.FAT_ARROW; }
  "?"                             { return MotokoTypes.QUESTION; }
  "??"                            { return MotokoTypes.DOUBLE_QUESTION; }
  
  [a-zA-Z_][a-zA-Z0-9_]*         { return MotokoTypes.IDENTIFIER; }
  [0-9]+                          { return MotokoTypes.NUMBER; }
  \"([^\\\"\r\n]|\\t|\\u|\\n|\\r|\\\"|\\\'|\\\\|(\\[0-3]?[0-7]?[0-7]))*\" { return MotokoTypes.STRING_LITERAL; }
  \'([^\\\'\r\n]|\\t|\\u|\\n|\\r|\\\"|\\\'|\\\\|(\\[0-3]?[0-7]?[0-7]))*\' { return MotokoTypes.CHAR; }
  
  "/*"                            { yybegin(COMMENT); }
  {END_OF_LINE_COMMENT}           { return MotokoTypes.LINE_COMMENT; }
  
  [^]                             { return TokenType.BAD_CHARACTER; }
}

<COMMENT> {
  "*/"                            { yybegin(YYINITIAL); return MotokoTypes.BLOCK_COMMENT; }
  [^]                             { return MotokoTypes.BLOCK_COMMENT; }
} 