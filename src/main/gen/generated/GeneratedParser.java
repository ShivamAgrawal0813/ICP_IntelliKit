// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static generated.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return motokoFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // (function_declaration | variable_declaration | type_declaration)*
  public static boolean actor_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "actor_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACTOR_BODY, "<actor body>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!actor_body_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "actor_body", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // function_declaration | variable_declaration | type_declaration
  private static boolean actor_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "actor_body_0")) return false;
    boolean result_;
    result_ = function_declaration(builder_, level_ + 1);
    if (!result_) result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = type_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // actor id lbrace actor_body rbrace
  public static boolean actor_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "actor_declaration")) return false;
    if (!nextTokenIs(builder_, ACTOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ACTOR, ID, LBRACE);
    result_ = result_ && actor_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, ACTOR_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // lbrack [expression (comma expression)*] rbrack
  public static boolean array_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && array_expression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, ARRAY_EXPRESSION, result_);
    return result_;
  }

  // [expression (comma expression)*]
  private static boolean array_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression_1")) return false;
    array_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // expression (comma expression)*
  private static boolean array_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && array_expression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma expression)*
  private static boolean array_expression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_expression_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_expression_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma expression
  private static boolean array_expression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression operator expression
  public static boolean binary_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_EXPRESSION, "<binary expression>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && operator(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // lbrace statement* rbrace
  public static boolean block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, BLOCK, result_);
    return result_;
  }

  // statement*
  private static boolean block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression lparen [expression (comma expression)*] rparen
  public static boolean call_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL_EXPRESSION, "<call expression>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && call_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [expression (comma expression)*]
  private static boolean call_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_expression_2")) return false;
    call_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // expression (comma expression)*
  private static boolean call_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && call_expression_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma expression)*
  private static boolean call_expression_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_expression_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!call_expression_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "call_expression_2_0_1", pos_)) break;
    }
    return true;
  }

  // comma expression
  private static boolean call_expression_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_expression_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // literal | id | binary_expression | call_expression | object_expression | array_expression
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ID);
    if (!result_) result_ = binary_expression(builder_, level_ + 1);
    if (!result_) result_ = call_expression(builder_, level_ + 1);
    if (!result_) result_ = object_expression(builder_, level_ + 1);
    if (!result_) result_ = array_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expression semicolon
  public static boolean expression_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // id [colon expression] [semicolon]
  public static boolean field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && field_1(builder_, level_ + 1);
    result_ = result_ && field_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, FIELD, result_);
    return result_;
  }

  // [colon expression]
  private static boolean field_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_1")) return false;
    field_1_0(builder_, level_ + 1);
    return true;
  }

  // colon expression
  private static boolean field_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [semicolon]
  private static boolean field_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_2")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // id colon type_expression
  public static boolean field_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_type")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FIELD_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // lbrace statement* rbrace
  public static boolean function_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_body")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && function_body_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, FUNCTION_BODY, result_);
    return result_;
  }

  // statement*
  private static boolean function_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_body_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "function_body_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // visibility? func id lparen [parameter_list] rparen [colon type_expression] function_body
  public static boolean function_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    result_ = function_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FUNC, ID, LPAREN);
    result_ = result_ && function_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && function_declaration_6(builder_, level_ + 1);
    result_ = result_ && function_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean function_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // [parameter_list]
  private static boolean function_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_4")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  // [colon type_expression]
  private static boolean function_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_6")) return false;
    function_declaration_6_0(builder_, level_ + 1);
    return true;
  }

  // colon type_expression
  private static boolean function_declaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lparen [type_expression (comma type_expression)*] rparen arrow type_expression
  public static boolean function_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && function_type_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, ARROW);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_TYPE, result_);
    return result_;
  }

  // [type_expression (comma type_expression)*]
  private static boolean function_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_1")) return false;
    function_type_1_0(builder_, level_ + 1);
    return true;
  }

  // type_expression (comma type_expression)*
  private static boolean function_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_expression(builder_, level_ + 1);
    result_ = result_ && function_type_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma type_expression)*
  private static boolean function_type_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!function_type_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "function_type_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma type_expression
  private static boolean function_type_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // if lparen expression rparen block [else (if_statement | block)]
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IF, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && if_statement_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // [else (if_statement | block)]
  private static boolean if_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5")) return false;
    if_statement_5_0(builder_, level_ + 1);
    return true;
  }

  // else (if_statement | block)
  private static boolean if_statement_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && if_statement_5_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // if_statement | block
  private static boolean if_statement_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5_0_1")) return false;
    boolean result_;
    result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // actor_declaration | module_declaration | type_declaration | function_declaration | variable_declaration | expression | comment
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_;
    result_ = actor_declaration(builder_, level_ + 1);
    if (!result_) result_ = module_declaration(builder_, level_ + 1);
    if (!result_) result_ = type_declaration(builder_, level_ + 1);
    if (!result_) result_ = function_declaration(builder_, level_ + 1);
    if (!result_) result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    return result_;
  }

  /* ********************************************************** */
  // string | number | true | false | null
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, NULL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // loop block
  public static boolean loop_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "loop_statement")) return false;
    if (!nextTokenIs(builder_, LOOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LOOP);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, LOOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (function_declaration | variable_declaration | type_declaration)*
  public static boolean module_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_BODY, "<module body>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_body_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_body", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // function_declaration | variable_declaration | type_declaration
  private static boolean module_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body_0")) return false;
    boolean result_;
    result_ = function_declaration(builder_, level_ + 1);
    if (!result_) result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = type_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // module id lbrace module_body rbrace
  public static boolean module_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_declaration")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MODULE, ID, LBRACE);
    result_ = result_ && module_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, MODULE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // item_*
  static boolean motokoFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "motokoFile")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "motokoFile", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // lbrace [field (comma field)*] rbrace
  public static boolean object_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_expression")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && object_expression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, OBJECT_EXPRESSION, result_);
    return result_;
  }

  // [field (comma field)*]
  private static boolean object_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_expression_1")) return false;
    object_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // field (comma field)*
  private static boolean object_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field(builder_, level_ + 1);
    result_ = result_ && object_expression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma field)*
  private static boolean object_expression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_expression_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!object_expression_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_expression_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma field
  private static boolean object_expression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_expression_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lbrace [field_type (comma field_type)*] rbrace
  public static boolean object_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_type")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && object_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, OBJECT_TYPE, result_);
    return result_;
  }

  // [field_type (comma field_type)*]
  private static boolean object_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_type_1")) return false;
    object_type_1_0(builder_, level_ + 1);
    return true;
  }

  // field_type (comma field_type)*
  private static boolean object_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field_type(builder_, level_ + 1);
    result_ = result_ && object_type_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma field_type)*
  private static boolean object_type_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_type_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!object_type_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_type_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma field_type
  private static boolean object_type_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_type_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // plus | minus | star | slash | eq | neq | lt | lte | gt | gte
  public static boolean operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATOR, "<operator>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, SLASH);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, NEQ);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, LTE);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, GTE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // id colon type_expression
  public static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER, result_);
    return result_;
  }

  /* ********************************************************** */
  // parameter (comma parameter)*
  public static boolean parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && parameter_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER_LIST, result_);
    return result_;
  }

  // (comma parameter)*
  private static boolean parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameter_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_list_1", pos_)) break;
    }
    return true;
  }

  // comma parameter
  private static boolean parameter_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // nat | int | bool | text | float
  public static boolean primitive_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitive_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    result_ = consumeToken(builder_, NAT);
    if (!result_) result_ = consumeToken(builder_, INT);
    if (!result_) result_ = consumeToken(builder_, BOOL);
    if (!result_) result_ = consumeToken(builder_, TEXT);
    if (!result_) result_ = consumeToken(builder_, FLOAT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // return expression? semicolon
  public static boolean return_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement")) return false;
    if (!nextTokenIs(builder_, RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN);
    result_ = result_ && return_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // variable_declaration | expression_statement | return_statement | if_statement | loop_statement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = expression_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = loop_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // type id eq type_expression semicolon
  public static boolean type_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TYPE, ID, EQ);
    result_ = result_ && type_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, TYPE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // primitive_type | object_type | function_type | type_reference
  public static boolean type_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_EXPRESSION, "<type expression>");
    result_ = primitive_type(builder_, level_ + 1);
    if (!result_) result_ = object_type(builder_, level_ + 1);
    if (!result_) result_ = function_type(builder_, level_ + 1);
    if (!result_) result_ = type_reference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // id
  public static boolean type_reference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_reference")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    exit_section_(builder_, marker_, TYPE_REFERENCE, result_);
    return result_;
  }

  /* ********************************************************** */
  // (let | var) id [colon type_expression] eq expression semicolon
  public static boolean variable_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration")) return false;
    if (!nextTokenIs(builder_, "<variable declaration>", LET, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    result_ = variable_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && variable_declaration_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // let | var
  private static boolean variable_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LET);
    if (!result_) result_ = consumeToken(builder_, VAR);
    return result_;
  }

  // [colon type_expression]
  private static boolean variable_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_2")) return false;
    variable_declaration_2_0(builder_, level_ + 1);
    return true;
  }

  // colon type_expression
  private static boolean variable_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // public | private | shared
  public static boolean visibility(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "visibility")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VISIBILITY, "<visibility>");
    result_ = consumeToken(builder_, PUBLIC);
    if (!result_) result_ = consumeToken(builder_, PRIVATE);
    if (!result_) result_ = consumeToken(builder_, SHARED);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
