// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.icp.intellikit.psi.RustTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RustParser implements PsiParser, LightPsiParser {

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
    return rustFile(builder_, level_ + 1);
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
  // lbrack type_expression semicolon expression rbrack
  public static boolean array_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && type_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, ARRAY_TYPE, result_);
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
  // literal | id | binary_expression | call_expression | field_expression | method_call_expression | array_expression | tuple_expression | struct_expression
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ID);
    if (!result_) result_ = binary_expression(builder_, level_ + 1);
    if (!result_) result_ = call_expression(builder_, level_ + 1);
    if (!result_) result_ = field_expression(builder_, level_ + 1);
    if (!result_) result_ = method_call_expression(builder_, level_ + 1);
    if (!result_) result_ = array_expression(builder_, level_ + 1);
    if (!result_) result_ = tuple_expression(builder_, level_ + 1);
    if (!result_) result_ = struct_expression(builder_, level_ + 1);
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
  // pub? id colon type_expression
  public static boolean field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field")) return false;
    if (!nextTokenIs(builder_, "<field>", ID, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD, "<field>");
    result_ = field_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, ID, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean field_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  /* ********************************************************** */
  // expression dot id
  public static boolean field_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_EXPRESSION, "<field expression>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, ID);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // id colon expression
  public static boolean field_initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_initializer")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FIELD_INITIALIZER, result_);
    return result_;
  }

  /* ********************************************************** */
  // field (comma field)*
  public static boolean field_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_list")) return false;
    if (!nextTokenIs(builder_, "<field list>", ID, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_LIST, "<field list>");
    result_ = field(builder_, level_ + 1);
    result_ = result_ && field_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (comma field)*
  private static boolean field_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!field_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "field_list_1", pos_)) break;
    }
    return true;
  }

  // comma field
  private static boolean field_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // for id in expression block
  public static boolean for_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOR, ID, IN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
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
  // pub? fn id lparen [parameter_list] rparen [arrow type_expression] function_body
  public static boolean function_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration")) return false;
    if (!nextTokenIs(builder_, "<function declaration>", FN, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    result_ = function_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FN, ID, LPAREN);
    result_ = result_ && function_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && function_declaration_6(builder_, level_ + 1);
    result_ = result_ && function_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean function_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  // [parameter_list]
  private static boolean function_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_4")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  // [arrow type_expression]
  private static boolean function_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_6")) return false;
    function_declaration_6_0(builder_, level_ + 1);
    return true;
  }

  // arrow type_expression
  private static boolean function_declaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARROW);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fn lparen [type_expression (comma type_expression)*] rparen arrow type_expression
  public static boolean function_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type")) return false;
    if (!nextTokenIs(builder_, FN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FN, LPAREN);
    result_ = result_ && function_type_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, ARROW);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_TYPE, result_);
    return result_;
  }

  // [type_expression (comma type_expression)*]
  private static boolean function_type_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2")) return false;
    function_type_2_0(builder_, level_ + 1);
    return true;
  }

  // type_expression (comma type_expression)*
  private static boolean function_type_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_expression(builder_, level_ + 1);
    result_ = result_ && function_type_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma type_expression)*
  private static boolean function_type_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!function_type_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "function_type_2_0_1", pos_)) break;
    }
    return true;
  }

  // comma type_expression
  private static boolean function_type_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // if expression block [else (if_statement | block)]
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && if_statement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // [else (if_statement | block)]
  private static boolean if_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_3")) return false;
    if_statement_3_0(builder_, level_ + 1);
    return true;
  }

  // else (if_statement | block)
  private static boolean if_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && if_statement_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // if_statement | block
  private static boolean if_statement_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_3_0_1")) return false;
    boolean result_;
    result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  public static boolean impl_body(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, IMPL_BODY, true);
    return true;
  }

  /* ********************************************************** */
  // impl [type_parameters] type_expression lbrace impl_item* rbrace
  public static boolean impl_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_declaration")) return false;
    if (!nextTokenIs(builder_, IMPL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPL);
    result_ = result_ && impl_declaration_1(builder_, level_ + 1);
    result_ = result_ && type_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && impl_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, IMPL_DECLARATION, result_);
    return result_;
  }

  // [type_parameters]
  private static boolean impl_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_declaration_1")) return false;
    type_parameters(builder_, level_ + 1);
    return true;
  }

  // impl_item*
  private static boolean impl_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_declaration_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!impl_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "impl_declaration_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // pub? fn id lparen [parameter_list] rparen [arrow type_expression] function_body
  public static boolean impl_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item")) return false;
    if (!nextTokenIs(builder_, "<impl item>", FN, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPL_ITEM, "<impl item>");
    result_ = impl_item_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FN, ID, LPAREN);
    result_ = result_ && impl_item_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && impl_item_6(builder_, level_ + 1);
    result_ = result_ && function_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean impl_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  // [parameter_list]
  private static boolean impl_item_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_4")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  // [arrow type_expression]
  private static boolean impl_item_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_6")) return false;
    impl_item_6_0(builder_, level_ + 1);
    return true;
  }

  // arrow type_expression
  private static boolean impl_item_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARROW);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_declaration | function_declaration | struct_declaration | impl_declaration | trait_declaration | use_declaration | type_declaration
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_;
    result_ = module_declaration(builder_, level_ + 1);
    if (!result_) result_ = function_declaration(builder_, level_ + 1);
    if (!result_) result_ = struct_declaration(builder_, level_ + 1);
    if (!result_) result_ = impl_declaration(builder_, level_ + 1);
    if (!result_) result_ = trait_declaration(builder_, level_ + 1);
    if (!result_) result_ = use_declaration(builder_, level_ + 1);
    if (!result_) result_ = type_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // let mut? id [colon type_expression] eq expression semicolon
  public static boolean let_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_statement")) return false;
    if (!nextTokenIs(builder_, LET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LET);
    result_ = result_ && let_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && let_statement_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, LET_STATEMENT, result_);
    return result_;
  }

  // mut?
  private static boolean let_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_statement_1")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  // [colon type_expression]
  private static boolean let_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_statement_3")) return false;
    let_statement_3_0(builder_, level_ + 1);
    return true;
  }

  // colon type_expression
  private static boolean let_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_statement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string | number | true | false
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
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
  // pattern arrow (block | expression) comma?
  public static boolean match_arm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm")) return false;
    if (!nextTokenIs(builder_, PATTERN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PATTERN, ARROW);
    result_ = result_ && match_arm_2(builder_, level_ + 1);
    result_ = result_ && match_arm_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, MATCH_ARM, result_);
    return result_;
  }

  // block | expression
  private static boolean match_arm_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_2")) return false;
    boolean result_;
    result_ = block(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    return result_;
  }

  // comma?
  private static boolean match_arm_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_3")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // match expression lbrace match_arm* rbrace
  public static boolean match_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_statement")) return false;
    if (!nextTokenIs(builder_, MATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MATCH);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && match_statement_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, MATCH_STATEMENT, result_);
    return result_;
  }

  // match_arm*
  private static boolean match_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_statement_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!match_arm(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "match_statement_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression dot id lparen [expression (comma expression)*] rparen
  public static boolean method_call_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_CALL_EXPRESSION, "<method call expression>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, ID, LPAREN);
    result_ = result_ && method_call_expression_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [expression (comma expression)*]
  private static boolean method_call_expression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expression_4")) return false;
    method_call_expression_4_0(builder_, level_ + 1);
    return true;
  }

  // expression (comma expression)*
  private static boolean method_call_expression_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expression_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && method_call_expression_4_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma expression)*
  private static boolean method_call_expression_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expression_4_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!method_call_expression_4_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "method_call_expression_4_0_1", pos_)) break;
    }
    return true;
  }

  // comma expression
  private static boolean method_call_expression_4_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expression_4_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // item_*
  public static boolean module_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_BODY, "<module body>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_body", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // pub? mod id lbrace module_body rbrace
  public static boolean module_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_declaration")) return false;
    if (!nextTokenIs(builder_, "<module declaration>", MOD, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_DECLARATION, "<module declaration>");
    result_ = module_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, MOD, ID, LBRACE);
    result_ = result_ && module_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean module_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
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
  public static boolean parameters(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, PARAMETERS, true);
    return true;
  }

  /* ********************************************************** */
  public static boolean path(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, PATH, true);
    return true;
  }

  /* ********************************************************** */
  // i32 | i64 | u32 | u64 | f32 | f64 | bool | str | String
  public static boolean primitive_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitive_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    result_ = consumeToken(builder_, I32);
    if (!result_) result_ = consumeToken(builder_, I64);
    if (!result_) result_ = consumeToken(builder_, U32);
    if (!result_) result_ = consumeToken(builder_, U64);
    if (!result_) result_ = consumeToken(builder_, F32);
    if (!result_) result_ = consumeToken(builder_, F64);
    if (!result_) result_ = consumeToken(builder_, BOOL);
    if (!result_) result_ = consumeToken(builder_, STR);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ampersand mut? type_expression
  public static boolean reference_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_type")) return false;
    if (!nextTokenIs(builder_, AMPERSAND)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AMPERSAND);
    result_ = result_ && reference_type_1(builder_, level_ + 1);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, REFERENCE_TYPE, result_);
    return result_;
  }

  // mut?
  private static boolean reference_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_type_1")) return false;
    consumeToken(builder_, MUT);
    return true;
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
  // item_*
  static boolean rustFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rustFile")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rustFile", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression_statement | let_statement | return_statement | if_statement | loop_statement | while_statement | for_statement | match_statement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = expression_statement(builder_, level_ + 1);
    if (!result_) result_ = let_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = loop_statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement(builder_, level_ + 1);
    if (!result_) result_ = match_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  public static boolean struct_body(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, STRUCT_BODY, true);
    return true;
  }

  /* ********************************************************** */
  // pub? struct id lbrace [field_list] rbrace
  public static boolean struct_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration")) return false;
    if (!nextTokenIs(builder_, "<struct declaration>", PUB, STRUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    result_ = struct_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, STRUCT, ID, LBRACE);
    result_ = result_ && struct_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean struct_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  // [field_list]
  private static boolean struct_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_4")) return false;
    field_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // id lbrace [field_initializer (comma field_initializer)*] rbrace
  public static boolean struct_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, LBRACE);
    result_ = result_ && struct_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, STRUCT_EXPRESSION, result_);
    return result_;
  }

  // [field_initializer (comma field_initializer)*]
  private static boolean struct_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression_2")) return false;
    struct_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // field_initializer (comma field_initializer)*
  private static boolean struct_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field_initializer(builder_, level_ + 1);
    result_ = result_ && struct_expression_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma field_initializer)*
  private static boolean struct_expression_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_expression_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_expression_2_0_1", pos_)) break;
    }
    return true;
  }

  // comma field_initializer
  private static boolean struct_expression_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field_initializer(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // id [type_arguments]
  public static boolean struct_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && struct_type_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, STRUCT_TYPE, result_);
    return result_;
  }

  // [type_arguments]
  private static boolean struct_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_1")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  public static boolean trait_body(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, TRAIT_BODY, true);
    return true;
  }

  /* ********************************************************** */
  // id (plus id)*
  public static boolean trait_bound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bound")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && trait_bound_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRAIT_BOUND, result_);
    return result_;
  }

  // (plus id)*
  private static boolean trait_bound_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bound_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!trait_bound_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_bound_1", pos_)) break;
    }
    return true;
  }

  // plus id
  private static boolean trait_bound_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bound_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PLUS, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // pub? trait id [type_parameters] lbrace trait_item* rbrace
  public static boolean trait_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration")) return false;
    if (!nextTokenIs(builder_, "<trait declaration>", PUB, TRAIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRAIT_DECLARATION, "<trait declaration>");
    result_ = trait_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TRAIT, ID);
    result_ = result_ && trait_declaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && trait_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean trait_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  // [type_parameters]
  private static boolean trait_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_3")) return false;
    type_parameters(builder_, level_ + 1);
    return true;
  }

  // trait_item*
  private static boolean trait_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!trait_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_declaration_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // fn id lparen [parameter_list] rparen [arrow type_expression] semicolon
  public static boolean trait_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item")) return false;
    if (!nextTokenIs(builder_, FN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FN, ID, LPAREN);
    result_ = result_ && trait_item_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && trait_item_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, TRAIT_ITEM, result_);
    return result_;
  }

  // [parameter_list]
  private static boolean trait_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_3")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  // [arrow type_expression]
  private static boolean trait_item_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_5")) return false;
    trait_item_5_0(builder_, level_ + 1);
    return true;
  }

  // arrow type_expression
  private static boolean trait_item_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARROW);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lparen [expression (comma expression)*] rparen
  public static boolean tuple_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_expression")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && tuple_expression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, TUPLE_EXPRESSION, result_);
    return result_;
  }

  // [expression (comma expression)*]
  private static boolean tuple_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_expression_1")) return false;
    tuple_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // expression (comma expression)*
  private static boolean tuple_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && tuple_expression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma expression)*
  private static boolean tuple_expression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_expression_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!tuple_expression_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tuple_expression_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma expression
  private static boolean tuple_expression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_expression_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lparen [type_expression (comma type_expression)*] rparen
  public static boolean tuple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && tuple_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, TUPLE_TYPE, result_);
    return result_;
  }

  // [type_expression (comma type_expression)*]
  private static boolean tuple_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type_1")) return false;
    tuple_type_1_0(builder_, level_ + 1);
    return true;
  }

  // type_expression (comma type_expression)*
  private static boolean tuple_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_expression(builder_, level_ + 1);
    result_ = result_ && tuple_type_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma type_expression)*
  private static boolean tuple_type_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!tuple_type_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tuple_type_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma type_expression
  private static boolean tuple_type_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lt [type_expression (comma type_expression)*] gt
  public static boolean type_arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && type_arguments_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, TYPE_ARGUMENTS, result_);
    return result_;
  }

  // [type_expression (comma type_expression)*]
  private static boolean type_arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_1")) return false;
    type_arguments_1_0(builder_, level_ + 1);
    return true;
  }

  // type_expression (comma type_expression)*
  private static boolean type_arguments_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_expression(builder_, level_ + 1);
    result_ = result_ && type_arguments_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma type_expression)*
  private static boolean type_arguments_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_arguments_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_arguments_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma type_expression
  private static boolean type_arguments_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // pub? type id eq type_expression semicolon
  public static boolean type_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration")) return false;
    if (!nextTokenIs(builder_, "<type declaration>", PUB, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECLARATION, "<type declaration>");
    result_ = type_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TYPE, ID, EQ);
    result_ = result_ && type_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean type_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  /* ********************************************************** */
  // primitive_type | struct_type | tuple_type | array_type | reference_type | function_type
  public static boolean type_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_EXPRESSION, "<type expression>");
    result_ = primitive_type(builder_, level_ + 1);
    if (!result_) result_ = struct_type(builder_, level_ + 1);
    if (!result_) result_ = tuple_type(builder_, level_ + 1);
    if (!result_) result_ = array_type(builder_, level_ + 1);
    if (!result_) result_ = reference_type(builder_, level_ + 1);
    if (!result_) result_ = function_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // id [colon trait_bound]
  public static boolean type_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && type_parameter_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_PARAMETER, result_);
    return result_;
  }

  // [colon trait_bound]
  private static boolean type_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter_1")) return false;
    type_parameter_1_0(builder_, level_ + 1);
    return true;
  }

  // colon trait_bound
  private static boolean type_parameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && trait_bound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lt [type_parameter (comma type_parameter)*] gt
  public static boolean type_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && type_parameters_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, TYPE_PARAMETERS, result_);
    return result_;
  }

  // [type_parameter (comma type_parameter)*]
  private static boolean type_parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_1")) return false;
    type_parameters_1_0(builder_, level_ + 1);
    return true;
  }

  // type_parameter (comma type_parameter)*
  private static boolean type_parameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_parameter(builder_, level_ + 1);
    result_ = result_ && type_parameters_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comma type_parameter)*
  private static boolean type_parameters_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_parameters_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_parameters_1_0_1", pos_)) break;
    }
    return true;
  }

  // comma type_parameter
  private static boolean type_parameters_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // pub? use use_path semicolon
  public static boolean use_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration")) return false;
    if (!nextTokenIs(builder_, "<use declaration>", PUB, USE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USE_DECLARATION, "<use declaration>");
    result_ = use_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, USE);
    result_ = result_ && use_path(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub?
  private static boolean use_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_0")) return false;
    consumeToken(builder_, PUB);
    return true;
  }

  /* ********************************************************** */
  // id (double_colon id)*
  public static boolean use_path(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_path")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && use_path_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, USE_PATH, result_);
    return result_;
  }

  // (double_colon id)*
  private static boolean use_path_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_path_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!use_path_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_path_1", pos_)) break;
    }
    return true;
  }

  // double_colon id
  private static boolean use_path_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_path_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOUBLE_COLON, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // while expression block
  public static boolean while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement")) return false;
    if (!nextTokenIs(builder_, WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WHILE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE_STATEMENT, result_);
    return result_;
  }

}
