// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType ACTOR_BODY = new IElementType("ACTOR_BODY", null);
  IElementType ACTOR_DECLARATION = new IElementType("ACTOR_DECLARATION", null);
  IElementType ARRAY_EXPRESSION = new IElementType("ARRAY_EXPRESSION", null);
  IElementType BINARY_EXPRESSION = new IElementType("BINARY_EXPRESSION", null);
  IElementType BLOCK = new IElementType("BLOCK", null);
  IElementType CALL_EXPRESSION = new IElementType("CALL_EXPRESSION", null);
  IElementType EXPRESSION = new IElementType("EXPRESSION", null);
  IElementType EXPRESSION_STATEMENT = new IElementType("EXPRESSION_STATEMENT", null);
  IElementType FIELD = new IElementType("FIELD", null);
  IElementType FIELD_TYPE = new IElementType("FIELD_TYPE", null);
  IElementType FUNCTION_BODY = new IElementType("FUNCTION_BODY", null);
  IElementType FUNCTION_DECLARATION = new IElementType("FUNCTION_DECLARATION", null);
  IElementType FUNCTION_TYPE = new IElementType("FUNCTION_TYPE", null);
  IElementType IF_STATEMENT = new IElementType("IF_STATEMENT", null);
  IElementType LITERAL = new IElementType("LITERAL", null);
  IElementType LOOP_STATEMENT = new IElementType("LOOP_STATEMENT", null);
  IElementType MODULE_BODY = new IElementType("MODULE_BODY", null);
  IElementType MODULE_DECLARATION = new IElementType("MODULE_DECLARATION", null);
  IElementType OBJECT_EXPRESSION = new IElementType("OBJECT_EXPRESSION", null);
  IElementType OBJECT_TYPE = new IElementType("OBJECT_TYPE", null);
  IElementType OPERATOR = new IElementType("OPERATOR", null);
  IElementType PARAMETER = new IElementType("PARAMETER", null);
  IElementType PARAMETER_LIST = new IElementType("PARAMETER_LIST", null);
  IElementType PRIMITIVE_TYPE = new IElementType("PRIMITIVE_TYPE", null);
  IElementType RETURN_STATEMENT = new IElementType("RETURN_STATEMENT", null);
  IElementType STATEMENT = new IElementType("STATEMENT", null);
  IElementType TYPE_DECLARATION = new IElementType("TYPE_DECLARATION", null);
  IElementType TYPE_EXPRESSION = new IElementType("TYPE_EXPRESSION", null);
  IElementType TYPE_REFERENCE = new IElementType("TYPE_REFERENCE", null);
  IElementType VARIABLE_DECLARATION = new IElementType("VARIABLE_DECLARATION", null);
  IElementType VISIBILITY = new IElementType("VISIBILITY", null);

  IElementType ACTOR = new IElementType("actor", null);
  IElementType ARROW = new IElementType("->", null);
  IElementType BOOL = new IElementType("Bool", null);
  IElementType COLON = new IElementType(":", null);
  IElementType COMMA = new IElementType(",", null);
  IElementType COMMENT = new IElementType("comment", null);
  IElementType ELSE = new IElementType("else", null);
  IElementType EQ = new IElementType("==", null);
  IElementType FALSE = new IElementType("false", null);
  IElementType FLOAT = new IElementType("Float", null);
  IElementType FUNC = new IElementType("func", null);
  IElementType GT = new IElementType(">", null);
  IElementType GTE = new IElementType(">=", null);
  IElementType ID = new IElementType("id", null);
  IElementType IF = new IElementType("if", null);
  IElementType INT = new IElementType("Int", null);
  IElementType LBRACE = new IElementType("{", null);
  IElementType LBRACK = new IElementType("[", null);
  IElementType LET = new IElementType("let", null);
  IElementType LOOP = new IElementType("loop", null);
  IElementType LPAREN = new IElementType("(", null);
  IElementType LT = new IElementType("<", null);
  IElementType LTE = new IElementType("<=", null);
  IElementType MINUS = new IElementType("-", null);
  IElementType MODULE = new IElementType("module", null);
  IElementType NAT = new IElementType("Nat", null);
  IElementType NEQ = new IElementType("!=", null);
  IElementType NULL = new IElementType("null", null);
  IElementType NUMBER = new IElementType("number", null);
  IElementType PLUS = new IElementType("+", null);
  IElementType PRIVATE = new IElementType("private", null);
  IElementType PUBLIC = new IElementType("public", null);
  IElementType RBRACE = new IElementType("}", null);
  IElementType RBRACK = new IElementType("]", null);
  IElementType RETURN = new IElementType("return", null);
  IElementType RPAREN = new IElementType(")", null);
  IElementType SEMICOLON = new IElementType(";", null);
  IElementType SHARED = new IElementType("shared", null);
  IElementType SLASH = new IElementType("/", null);
  IElementType STAR = new IElementType("*", null);
  IElementType STRING = new IElementType("string", null);
  IElementType TEXT = new IElementType("Text", null);
  IElementType TRUE = new IElementType("true", null);
  IElementType TYPE = new IElementType("type", null);
  IElementType VAR = new IElementType("var", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTOR_BODY) {
        return new ActorBodyImpl(node);
      }
      else if (type == ACTOR_DECLARATION) {
        return new ActorDeclarationImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new ArrayExpressionImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new BinaryExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new BlockImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new CallExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new ExpressionStatementImpl(node);
      }
      else if (type == FIELD) {
        return new FieldImpl(node);
      }
      else if (type == FIELD_TYPE) {
        return new FieldTypeImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new FunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new FunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new FunctionTypeImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new IfStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new LiteralImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new LoopStatementImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new ModuleBodyImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new ModuleDeclarationImpl(node);
      }
      else if (type == OBJECT_EXPRESSION) {
        return new ObjectExpressionImpl(node);
      }
      else if (type == OBJECT_TYPE) {
        return new ObjectTypeImpl(node);
      }
      else if (type == OPERATOR) {
        return new OperatorImpl(node);
      }
      else if (type == PARAMETER) {
        return new ParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new ParameterListImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new PrimitiveTypeImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new ReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new StatementImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new TypeDeclarationImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new TypeExpressionImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new TypeReferenceImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new VariableDeclarationImpl(node);
      }
      else if (type == VISIBILITY) {
        return new VisibilityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
