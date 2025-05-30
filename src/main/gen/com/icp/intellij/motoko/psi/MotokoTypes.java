// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.icp.intellij.motoko.psi.impl.*;

public interface MotokoTypes {

  IElementType ACTOR_BODY = new MotokoElementType("ACTOR_BODY");
  IElementType ACTOR_DECLARATION = new MotokoElementType("ACTOR_DECLARATION");
  IElementType ARRAY_TYPE = new MotokoElementType("ARRAY_TYPE");
  IElementType BINARY_EXPRESSION = new MotokoElementType("BINARY_EXPRESSION");
  IElementType CALL_EXPRESSION = new MotokoElementType("CALL_EXPRESSION");
  IElementType EXPRESSION = new MotokoElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new MotokoElementType("EXPRESSION_STATEMENT");
  IElementType FIELD_TYPE = new MotokoElementType("FIELD_TYPE");
  IElementType FUNCTION_BODY = new MotokoElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new MotokoElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_TYPE = new MotokoElementType("FUNCTION_TYPE");
  IElementType IF_STATEMENT = new MotokoElementType("IF_STATEMENT");
  IElementType LITERAL = new MotokoElementType("LITERAL");
  IElementType LOOP_STATEMENT = new MotokoElementType("LOOP_STATEMENT");
  IElementType MODULE_BODY = new MotokoElementType("MODULE_BODY");
  IElementType MODULE_DECLARATION = new MotokoElementType("MODULE_DECLARATION");
  IElementType OBJECT_TYPE = new MotokoElementType("OBJECT_TYPE");
  IElementType PARAMETER = new MotokoElementType("PARAMETER");
  IElementType PARAMETER_LIST = new MotokoElementType("PARAMETER_LIST");
  IElementType PRIMITIVE_TYPE = new MotokoElementType("PRIMITIVE_TYPE");
  IElementType RETURN_STATEMENT = new MotokoElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new MotokoElementType("STATEMENT");
  IElementType TYPE_DECLARATION = new MotokoElementType("TYPE_DECLARATION");
  IElementType TYPE_EXPRESSION = new MotokoElementType("TYPE_EXPRESSION");
  IElementType TYPE_REFERENCE = new MotokoElementType("TYPE_REFERENCE");
  IElementType VARIABLE_DECLARATION = new MotokoElementType("VARIABLE_DECLARATION");

  IElementType ACTOR = new MotokoTokenType("actor");
  IElementType ARROW = new MotokoTokenType("->");
  IElementType BOOL = new MotokoTokenType("Bool");
  IElementType COLON = new MotokoTokenType(":");
  IElementType COMMA = new MotokoTokenType(",");
  IElementType COMMENT = new MotokoTokenType("comment");
  IElementType ELSE = new MotokoTokenType("else");
  IElementType EQ = new MotokoTokenType("==");
  IElementType FALSE = new MotokoTokenType("false");
  IElementType FLOAT = new MotokoTokenType("Float");
  IElementType FUNC = new MotokoTokenType("func");
  IElementType GT = new MotokoTokenType(">");
  IElementType GTE = new MotokoTokenType(">=");
  IElementType ID = new MotokoTokenType("id");
  IElementType IF = new MotokoTokenType("if");
  IElementType INT = new MotokoTokenType("Int");
  IElementType LBRACE = new MotokoTokenType("{");
  IElementType LBRACK = new MotokoTokenType("[");
  IElementType LET = new MotokoTokenType("let");
  IElementType LOOP = new MotokoTokenType("loop");
  IElementType LPAREN = new MotokoTokenType("(");
  IElementType LT = new MotokoTokenType("<");
  IElementType LTE = new MotokoTokenType("<=");
  IElementType MINUS = new MotokoTokenType("-");
  IElementType MODULE = new MotokoTokenType("module");
  IElementType NAT = new MotokoTokenType("Nat");
  IElementType NEQ = new MotokoTokenType("!=");
  IElementType NULL = new MotokoTokenType("null");
  IElementType NUMBER = new MotokoTokenType("number");
  IElementType PLUS = new MotokoTokenType("+");
  IElementType PRIVATE = new MotokoTokenType("private");
  IElementType PUBLIC = new MotokoTokenType("public");
  IElementType RBRACE = new MotokoTokenType("}");
  IElementType RBRACK = new MotokoTokenType("]");
  IElementType RETURN = new MotokoTokenType("return");
  IElementType RPAREN = new MotokoTokenType(")");
  IElementType SEMICOLON = new MotokoTokenType(";");
  IElementType SHARED = new MotokoTokenType("shared");
  IElementType SLASH = new MotokoTokenType("/");
  IElementType STAR = new MotokoTokenType("*");
  IElementType STRING = new MotokoTokenType("string");
  IElementType TEXT = new MotokoTokenType("Text");
  IElementType TRUE = new MotokoTokenType("true");
  IElementType TYPE = new MotokoTokenType("type");
  IElementType VAR = new MotokoTokenType("var");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTOR_BODY) {
        return new MotokoActorBodyImpl(node);
      }
      else if (type == ACTOR_DECLARATION) {
        return new MotokoActorDeclarationImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new MotokoArrayTypeImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new MotokoBinaryExpressionImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new MotokoCallExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new MotokoExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new MotokoExpressionStatementImpl(node);
      }
      else if (type == FIELD_TYPE) {
        return new MotokoFieldTypeImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new MotokoFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new MotokoFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new MotokoFunctionTypeImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new MotokoIfStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new MotokoLiteralImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new MotokoLoopStatementImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new MotokoModuleBodyImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new MotokoModuleDeclarationImpl(node);
      }
      else if (type == OBJECT_TYPE) {
        return new MotokoObjectTypeImpl(node);
      }
      else if (type == PARAMETER) {
        return new MotokoParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new MotokoParameterListImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new MotokoPrimitiveTypeImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new MotokoReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new MotokoStatementImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new MotokoTypeDeclarationImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new MotokoTypeExpressionImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new MotokoTypeReferenceImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new MotokoVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
