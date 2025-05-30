// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.icp.intellikit.psi.impl.*;

public interface RustTypes {

  IElementType ARRAY_EXPRESSION = new RustElementType("ARRAY_EXPRESSION");
  IElementType ARRAY_TYPE = new RustElementType("ARRAY_TYPE");
  IElementType BINARY_EXPRESSION = new RustElementType("BINARY_EXPRESSION");
  IElementType BLOCK = new RustElementType("BLOCK");
  IElementType CALL_EXPRESSION = new RustElementType("CALL_EXPRESSION");
  IElementType EXPRESSION = new RustElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new RustElementType("EXPRESSION_STATEMENT");
  IElementType FIELD = new RustElementType("FIELD");
  IElementType FIELD_EXPRESSION = new RustElementType("FIELD_EXPRESSION");
  IElementType FIELD_INITIALIZER = new RustElementType("FIELD_INITIALIZER");
  IElementType FIELD_LIST = new RustElementType("FIELD_LIST");
  IElementType FOR_STATEMENT = new RustElementType("FOR_STATEMENT");
  IElementType FUNCTION_BODY = new RustElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new RustElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_TYPE = new RustElementType("FUNCTION_TYPE");
  IElementType IF_STATEMENT = new RustElementType("IF_STATEMENT");
  IElementType IMPL_BODY = new RustElementType("IMPL_BODY");
  IElementType IMPL_DECLARATION = new RustElementType("IMPL_DECLARATION");
  IElementType IMPL_ITEM = new RustElementType("IMPL_ITEM");
  IElementType LET_STATEMENT = new RustElementType("LET_STATEMENT");
  IElementType LITERAL = new RustElementType("LITERAL");
  IElementType LOOP_STATEMENT = new RustElementType("LOOP_STATEMENT");
  IElementType MATCH_ARM = new RustElementType("MATCH_ARM");
  IElementType MATCH_STATEMENT = new RustElementType("MATCH_STATEMENT");
  IElementType METHOD_CALL_EXPRESSION = new RustElementType("METHOD_CALL_EXPRESSION");
  IElementType MODULE_BODY = new RustElementType("MODULE_BODY");
  IElementType MODULE_DECLARATION = new RustElementType("MODULE_DECLARATION");
  IElementType OPERATOR = new RustElementType("OPERATOR");
  IElementType PARAMETER = new RustElementType("PARAMETER");
  IElementType PARAMETERS = new RustElementType("PARAMETERS");
  IElementType PARAMETER_LIST = new RustElementType("PARAMETER_LIST");
  IElementType PATH = new RustElementType("PATH");
  IElementType PRIMITIVE_TYPE = new RustElementType("PRIMITIVE_TYPE");
  IElementType REFERENCE_TYPE = new RustElementType("REFERENCE_TYPE");
  IElementType RETURN_STATEMENT = new RustElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new RustElementType("STATEMENT");
  IElementType STRUCT_BODY = new RustElementType("STRUCT_BODY");
  IElementType STRUCT_DECLARATION = new RustElementType("STRUCT_DECLARATION");
  IElementType STRUCT_EXPRESSION = new RustElementType("STRUCT_EXPRESSION");
  IElementType STRUCT_TYPE = new RustElementType("STRUCT_TYPE");
  IElementType TRAIT_BODY = new RustElementType("TRAIT_BODY");
  IElementType TRAIT_BOUND = new RustElementType("TRAIT_BOUND");
  IElementType TRAIT_DECLARATION = new RustElementType("TRAIT_DECLARATION");
  IElementType TRAIT_ITEM = new RustElementType("TRAIT_ITEM");
  IElementType TUPLE_EXPRESSION = new RustElementType("TUPLE_EXPRESSION");
  IElementType TUPLE_TYPE = new RustElementType("TUPLE_TYPE");
  IElementType TYPE_ARGUMENTS = new RustElementType("TYPE_ARGUMENTS");
  IElementType TYPE_DECLARATION = new RustElementType("TYPE_DECLARATION");
  IElementType TYPE_EXPRESSION = new RustElementType("TYPE_EXPRESSION");
  IElementType TYPE_PARAMETER = new RustElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new RustElementType("TYPE_PARAMETERS");
  IElementType USE_DECLARATION = new RustElementType("USE_DECLARATION");
  IElementType USE_PATH = new RustElementType("USE_PATH");
  IElementType WHILE_STATEMENT = new RustElementType("WHILE_STATEMENT");

  IElementType AMPERSAND = new RustTokenType("ampersand");
  IElementType ARROW = new RustTokenType("arrow");
  IElementType BOOL = new RustTokenType("bool");
  IElementType COLON = new RustTokenType(":");
  IElementType COMMA = new RustTokenType(",");
  IElementType COMMENT = new RustTokenType("comment");
  IElementType DOT = new RustTokenType(".");
  IElementType DOUBLE_COLON = new RustTokenType("double_colon");
  IElementType ELSE = new RustTokenType("else");
  IElementType EQ = new RustTokenType("==");
  IElementType F32 = new RustTokenType("f32");
  IElementType F64 = new RustTokenType("f64");
  IElementType FALSE = new RustTokenType("false");
  IElementType FN_KW = new RustTokenType("fn");
  IElementType FOR = new RustTokenType("for");
  IElementType GT = new RustTokenType(">");
  IElementType GTE = new RustTokenType(">=");
  IElementType I32 = new RustTokenType("i32");
  IElementType I64 = new RustTokenType("i64");
  IElementType ID = new RustTokenType("id");
  IElementType IDENTIFIER = new RustTokenType("IDENTIFIER");
  IElementType IF = new RustTokenType("if");
  IElementType IMPL_KW = new RustTokenType("impl");
  IElementType IN = new RustTokenType("in");
  IElementType LBRACE = new RustTokenType("lbrace");
  IElementType LBRACK = new RustTokenType("[");
  IElementType LET = new RustTokenType("let");
  IElementType LOOP = new RustTokenType("loop");
  IElementType LPAREN = new RustTokenType("lparen");
  IElementType LT = new RustTokenType("<");
  IElementType LTE = new RustTokenType("<=");
  IElementType MATCH = new RustTokenType("match");
  IElementType MINUS = new RustTokenType("-");
  IElementType MOD_KW = new RustTokenType("mod");
  IElementType MUT = new RustTokenType("mut");
  IElementType NEQ = new RustTokenType("!=");
  IElementType NUMBER = new RustTokenType("number");
  IElementType PATTERN = new RustTokenType("pattern");
  IElementType PLUS = new RustTokenType("+");
  IElementType PUB = new RustTokenType("pub");
  IElementType RBRACE = new RustTokenType("rbrace");
  IElementType RBRACK = new RustTokenType("]");
  IElementType RETURN = new RustTokenType("return");
  IElementType RPAREN = new RustTokenType("rparen");
  IElementType SEMICOLON = new RustTokenType(";");
  IElementType SLASH = new RustTokenType("/");
  IElementType STAR = new RustTokenType("*");
  IElementType STR = new RustTokenType("str");
  IElementType STRING = new RustTokenType("String");
  IElementType STRUCT_KW = new RustTokenType("struct");
  IElementType TRAIT_KW = new RustTokenType("trait");
  IElementType TRUE = new RustTokenType("true");
  IElementType TYPE = new RustTokenType("type");
  IElementType U32 = new RustTokenType("u32");
  IElementType U64 = new RustTokenType("u64");
  IElementType USE_KW = new RustTokenType("use");
  IElementType WHILE = new RustTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_EXPRESSION) {
        return new RustArrayExpressionImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new RustArrayTypeImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new RustBinaryExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new RustBlockImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new RustCallExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new RustExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new RustExpressionStatementImpl(node);
      }
      else if (type == FIELD) {
        return new RustFieldImpl(node);
      }
      else if (type == FIELD_EXPRESSION) {
        return new RustFieldExpressionImpl(node);
      }
      else if (type == FIELD_INITIALIZER) {
        return new RustFieldInitializerImpl(node);
      }
      else if (type == FIELD_LIST) {
        return new RustFieldListImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new RustForStatementImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new RustFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new RustFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new RustFunctionTypeImpl(node);
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
      else if (type == IMPL_ITEM) {
        return new RustImplItemImpl(node);
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
      else if (type == MATCH_ARM) {
        return new RustMatchArmImpl(node);
      }
      else if (type == MATCH_STATEMENT) {
        return new RustMatchStatementImpl(node);
      }
      else if (type == METHOD_CALL_EXPRESSION) {
        return new RustMethodCallExpressionImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new RustModuleBodyImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new RustModuleDeclarationImpl(node);
      }
      else if (type == OPERATOR) {
        return new RustOperatorImpl(node);
      }
      else if (type == PARAMETER) {
        return new RustParameterImpl(node);
      }
      else if (type == PARAMETERS) {
        return new RustParametersImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new RustParameterListImpl(node);
      }
      else if (type == PATH) {
        return new RustPathImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new RustPrimitiveTypeImpl(node);
      }
      else if (type == REFERENCE_TYPE) {
        return new RustReferenceTypeImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new RustReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new RustStatementImpl(node);
      }
      else if (type == STRUCT_BODY) {
        return new RustStructBodyImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new RustStructDeclarationImpl(node);
      }
      else if (type == STRUCT_EXPRESSION) {
        return new RustStructExpressionImpl(node);
      }
      else if (type == STRUCT_TYPE) {
        return new RustStructTypeImpl(node);
      }
      else if (type == TRAIT_BODY) {
        return new RustTraitBodyImpl(node);
      }
      else if (type == TRAIT_BOUND) {
        return new RustTraitBoundImpl(node);
      }
      else if (type == TRAIT_DECLARATION) {
        return new RustTraitDeclarationImpl(node);
      }
      else if (type == TRAIT_ITEM) {
        return new RustTraitItemImpl(node);
      }
      else if (type == TUPLE_EXPRESSION) {
        return new RustTupleExpressionImpl(node);
      }
      else if (type == TUPLE_TYPE) {
        return new RustTupleTypeImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new RustTypeArgumentsImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new RustTypeDeclarationImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new RustTypeExpressionImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new RustTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new RustTypeParametersImpl(node);
      }
      else if (type == USE_DECLARATION) {
        return new RustUseDeclarationImpl(node);
      }
      else if (type == USE_PATH) {
        return new RustUsePathImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new RustWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
