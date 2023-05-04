// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class McFunctionParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return mcFunctionFile(b, l + 1);
  }

  /* ********************************************************** */
  // COMMAND_FILL COORDINATE COORDINATE COORDINATE COORDINATE COORDINATE COORDINATE (IDENTIFIER | SELECTOR) [ IDENTIFIER ]
  public static boolean cmdFill(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill")) return false;
    if (!nextTokenIs(b, COMMAND_FILL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMAND_FILL, COORDINATE, COORDINATE, COORDINATE, COORDINATE, COORDINATE, COORDINATE);
    r = r && cmdFill_7(b, l + 1);
    r = r && cmdFill_8(b, l + 1);
    exit_section_(b, m, CMD_FILL, r);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdFill_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_7")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // [ IDENTIFIER ]
  private static boolean cmdFill_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_8")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // COMMAND_GIVE (IDENTIFIER | SELECTOR) IDENTIFIER [NUMBER]
  public static boolean cmdGive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive")) return false;
    if (!nextTokenIs(b, COMMAND_GIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_GIVE);
    r = r && cmdGive_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdGive_3(b, l + 1);
    exit_section_(b, m, CMD_GIVE, r);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdGive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // [NUMBER]
  private static boolean cmdGive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // OPERATOR
  public static boolean cmdScoreboard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    exit_section_(b, m, CMD_SCOREBOARD, r);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_SETBLOCK COORDINATE COORDINATE COORDINATE IDENTIFIER
  public static boolean cmdSetBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock")) return false;
    if (!nextTokenIs(b, COMMAND_SETBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMAND_SETBLOCK, COORDINATE, COORDINATE, COORDINATE, IDENTIFIER);
    exit_section_(b, m, CMD_SET_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  public static boolean line_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINE_, "<line>");
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // line_*
  static boolean mcFunctionFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mcFunctionFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!line_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mcFunctionFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // cmdSetBlock | cmdGive | cmdFill
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = cmdSetBlock(b, l + 1);
    if (!r) r = cmdGive(b, l + 1);
    if (!r) r = cmdFill(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
