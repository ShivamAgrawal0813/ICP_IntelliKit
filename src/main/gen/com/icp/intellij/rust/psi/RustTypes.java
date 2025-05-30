// This is a generated file. Not intended for manual editing.
package com.icp.intellij.rust.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.icp.intellij.rust.psi.impl.*;

public interface RustTypes {

  IElementType ARRAY_TYPE = new RustElementType("ARRAY_TYPE");
  IElementType BLOCK = new RustElementType("BLOCK");
  IElementType BLOCK_EXPRESSION = new RustElementType("BLOCK_EXPRESSION");
  IElementType BOOL_LITERAL = new RustElementType("BOOL_LITERAL");
  IElementType EXPRESSION = new RustElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new RustElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STATEMENT = new RustElementType("EXPRESSION_STATEMENT");
  IElementType FUNCTION_BODY = new RustElementType("FUNCTION_BODY");
  IElementType FUNCTION_CALL = new RustElementType("FUNCTION_CALL");
  IElementType FUNCTION_DECLARATION = new RustElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_TYPE = new RustElementType("FUNCTION_TYPE");
  IElementType IDENTIFIER = new RustElementType("IDENTIFIER");
  IElementType IF_STATEMENT = new RustElementType("IF_STATEMENT");
  IElementType IMPL_BODY = new RustElementType("IMPL_BODY");
  IElementType IMPL_DECLARATION = new RustElementType("IMPL_DECLARATION");
  IElementType LET_STATEMENT = new RustElementType("LET_STATEMENT");
  IElementType LITERAL = new RustElementType("LITERAL");
  IElementType LOOP_STATEMENT = new RustElementType("LOOP_STATEMENT");
  IElementType MODULE_BODY = new RustElementType("MODULE_BODY");
  IElementType MODULE_DECLARATION = new RustElementType("MODULE_DECLARATION");
  IElementType MOD_DECLARATION = new RustElementType("MOD_DECLARATION");
  IElementType NUMBER = new RustElementType("NUMBER");
  IElementType NUMBER_LITERAL = new RustElementType("NUMBER_LITERAL");
  IElementType PARAMETER = new RustElementType("PARAMETER");
  IElementType PARAMETER_LIST = new RustElementType("PARAMETER_LIST");
  IElementType PRIMITIVE_TYPE = new RustElementType("PRIMITIVE_TYPE");
  IElementType RETURN_STATEMENT = new RustElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new RustElementType("STATEMENT");
  IElementType STRING = new RustElementType("STRING");
  IElementType STRING_LITERAL = new RustElementType("STRING_LITERAL");
  IElementType STRUCT_DECLARATION = new RustElementType("STRUCT_DECLARATION");
  IElementType STRUCT_FIELD = new RustElementType("STRUCT_FIELD");
  IElementType STRUCT_TYPE = new RustElementType("STRUCT_TYPE");
  IElementType TYPE_EXPRESSION = new RustElementType("TYPE_EXPRESSION");
  IElementType USE_DECLARATION = new RustElementType("USE_DECLARATION");

  IElementType A_ZA_Z0_9_ = new RustTokenType("a-zA-Z0-9_");
  IElementType A_ZA_Z_ = new RustTokenType("a-zA-Z_");
  IElementType PATH = new RustTokenType("path");
  IElementType STRING_1_0_0 = new RustTokenType("STRING_1_0_0");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_TYPE) {
        return new RustArrayTypeImpl(node);
      }
      else if (type == BLOCK) {
        return new RustBlockImpl(node);
      }
      else if (type == BLOCK_EXPRESSION) {
        return new RustBlockExpressionImpl(node);
      }
      else if (type == BOOL_LITERAL) {
        return new RustBoolLiteralImpl(node);
      }
      else if (type == EXPRESSION) {
        return new RustExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new RustExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new RustExpressionStatementImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new RustFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new RustFunctionCallImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new RustFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new RustFunctionTypeImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new RustIdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new RustIfStatementImpl(node);
      }
      else if (type == IMPL_BODY) {
        return new RustImplBodyImpl(node);
      }
      else if (type == IMPL_DECLARATION) {
        return new RustImplDeclarationImpl(node);
      }
      else if (type == LET_STATEMENT) {
        return new RustLetStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new RustLiteralImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new RustLoopStatementImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new RustModuleBodyImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new RustModuleDeclarationImpl(node);
      }
      else if (type == MOD_DECLARATION) {
        return new RustModDeclarationImpl(node);
      }
      else if (type == NUMBER) {
        return new RustNumberImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new RustNumberLiteralImpl(node);
      }
      else if (type == PARAMETER) {
        return new RustParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new RustParameterListImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new RustPrimitiveTypeImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new RustReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new RustStatementImpl(node);
      }
      else if (type == STRING) {
        return new RustStringImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new RustStringLiteralImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new RustStructDeclarationImpl(node);
      }
      else if (type == STRUCT_FIELD) {
        return new RustStructFieldImpl(node);
      }
      else if (type == STRUCT_TYPE) {
        return new RustStructTypeImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new RustTypeExpressionImpl(node);
      }
      else if (type == USE_DECLARATION) {
        return new RustUseDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
