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
  // 'advancement' ('revoke'|'grant') (IDENTIFIER | SELECTOR) (    'everything' |
  //                                                                                         (('from'|'through'|'until') IDENTIFIER) |
  //                                                                                         ('only' IDENTIFIER [ IDENTIFIER ]))
  public static boolean cmdAdvancement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ADVANCEMENT, "<cmd advancement>");
    r = consumeToken(b, "advancement");
    r = r && cmdAdvancement_1(b, l + 1);
    r = r && cmdAdvancement_2(b, l + 1);
    r = r && cmdAdvancement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'revoke'|'grant'
  private static boolean cmdAdvancement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_1")) return false;
    boolean r;
    r = consumeToken(b, "revoke");
    if (!r) r = consumeToken(b, "grant");
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdAdvancement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_2")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // 'everything' |
  //                                                                                         (('from'|'through'|'until') IDENTIFIER) |
  //                                                                                         ('only' IDENTIFIER [ IDENTIFIER ])
  private static boolean cmdAdvancement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "everything");
    if (!r) r = cmdAdvancement_3_1(b, l + 1);
    if (!r) r = cmdAdvancement_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('from'|'through'|'until') IDENTIFIER
  private static boolean cmdAdvancement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdAdvancement_3_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'from'|'through'|'until'
  private static boolean cmdAdvancement_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_3_1_0")) return false;
    boolean r;
    r = consumeToken(b, "from");
    if (!r) r = consumeToken(b, "through");
    if (!r) r = consumeToken(b, "until");
    return r;
  }

  // 'only' IDENTIFIER [ IDENTIFIER ]
  private static boolean cmdAdvancement_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "only");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdAdvancement_3_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ IDENTIFIER ]
  private static boolean cmdAdvancement_3_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement_3_2_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // 'attribute' (IDENTIFIER | SELECTOR) IDENTIFIER (  ('get' NUMBER) |
  //                                                                     ('base' ('get' [NUMBER] |'set' NUMBER)) |
  //                                                                     ('modifier' (
  //                                                                         ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                                         ('remove' IDENTIFIER) |
  //                                                                         ('value' 'get' IDENTIFIER [NUMBER]))))
  public static boolean cmdAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ATTRIBUTE, "<cmd attribute>");
    r = consumeToken(b, "attribute");
    r = r && cmdAttribute_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdAttribute_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // ('get' NUMBER) |
  //                                                                     ('base' ('get' [NUMBER] |'set' NUMBER)) |
  //                                                                     ('modifier' (
  //                                                                         ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                                         ('remove' IDENTIFIER) |
  //                                                                         ('value' 'get' IDENTIFIER [NUMBER])))
  private static boolean cmdAttribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdAttribute_3_0(b, l + 1);
    if (!r) r = cmdAttribute_3_1(b, l + 1);
    if (!r) r = cmdAttribute_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'get' NUMBER
  private static boolean cmdAttribute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'base' ('get' [NUMBER] |'set' NUMBER)
  private static boolean cmdAttribute_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "base");
    r = r && cmdAttribute_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'get' [NUMBER] |'set' NUMBER
  private static boolean cmdAttribute_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdAttribute_3_1_1_0(b, l + 1);
    if (!r) r = cmdAttribute_3_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'get' [NUMBER]
  private static boolean cmdAttribute_3_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && cmdAttribute_3_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdAttribute_3_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_1_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'set' NUMBER
  private static boolean cmdAttribute_3_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'modifier' (
  //                                                                         ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                                         ('remove' IDENTIFIER) |
  //                                                                         ('value' 'get' IDENTIFIER [NUMBER]))
  private static boolean cmdAttribute_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modifier");
    r = r && cmdAttribute_3_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                                         ('remove' IDENTIFIER) |
  //                                                                         ('value' 'get' IDENTIFIER [NUMBER])
  private static boolean cmdAttribute_3_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdAttribute_3_2_1_0(b, l + 1);
    if (!r) r = cmdAttribute_3_2_1_1(b, l + 1);
    if (!r) r = cmdAttribute_3_2_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')
  private static boolean cmdAttribute_3_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeTokens(b, 0, IDENTIFIER, IDENTIFIER, NUMBER);
    r = r && cmdAttribute_3_2_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add'|'multiply'|'multiply_base'
  private static boolean cmdAttribute_3_2_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1_0_4")) return false;
    boolean r;
    r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "multiply");
    if (!r) r = consumeToken(b, "multiply_base");
    return r;
  }

  // 'remove' IDENTIFIER
  private static boolean cmdAttribute_3_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'value' 'get' IDENTIFIER [NUMBER]
  private static boolean cmdAttribute_3_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "value");
    r = r && consumeToken(b, "get");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdAttribute_3_2_1_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdAttribute_3_2_1_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute_3_2_1_2_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'ban' (IDENTIFIER | SELECTOR) [STRING]
  public static boolean cmdBan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBan")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_BAN, "<cmd ban>");
    r = consumeToken(b, "ban");
    r = r && cmdBan_1(b, l + 1);
    r = r && cmdBan_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdBan_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBan_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // [STRING]
  private static boolean cmdBan_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBan_2")) return false;
    consumeToken(b, STRING);
    return true;
  }

  /* ********************************************************** */
  // 'bossbar' (('add' IDENTIFIER STRING) |
  //                            ('get' IDENTIFIER ('max'|'players'|'value'|'visible')) |
  //                            ('list') |
  //                            ('remove' IDENTIFIER) |
  //                            ('set' IDENTIFIER (
  //                                 ('color' COLOR) |
  //                                 ('max' NUMBER) |
  //                                 ('name' STRING) |
  //                                 ('players' (IDENTIFIER | SELECTOR)) |
  //                                 ('style' ('notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress')) |
  //                                 ('value' NUMBER) |
  //                                 ('visible' ('true'|'false'))
  //                            )))
  public static boolean cmdBossBar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_BOSS_BAR, "<cmd boss bar>");
    r = consumeToken(b, "bossbar");
    r = r && cmdBossBar_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('add' IDENTIFIER STRING) |
  //                            ('get' IDENTIFIER ('max'|'players'|'value'|'visible')) |
  //                            ('list') |
  //                            ('remove' IDENTIFIER) |
  //                            ('set' IDENTIFIER (
  //                                 ('color' COLOR) |
  //                                 ('max' NUMBER) |
  //                                 ('name' STRING) |
  //                                 ('players' (IDENTIFIER | SELECTOR)) |
  //                                 ('style' ('notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress')) |
  //                                 ('value' NUMBER) |
  //                                 ('visible' ('true'|'false'))
  //                            ))
  private static boolean cmdBossBar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdBossBar_1_0(b, l + 1);
    if (!r) r = cmdBossBar_1_1(b, l + 1);
    if (!r) r = cmdBossBar_1_2(b, l + 1);
    if (!r) r = cmdBossBar_1_3(b, l + 1);
    if (!r) r = cmdBossBar_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' IDENTIFIER STRING
  private static boolean cmdBossBar_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeTokens(b, 0, IDENTIFIER, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'get' IDENTIFIER ('max'|'players'|'value'|'visible')
  private static boolean cmdBossBar_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdBossBar_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'max'|'players'|'value'|'visible'
  private static boolean cmdBossBar_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_1_2")) return false;
    boolean r;
    r = consumeToken(b, "max");
    if (!r) r = consumeToken(b, "players");
    if (!r) r = consumeToken(b, "value");
    if (!r) r = consumeToken(b, "visible");
    return r;
  }

  // ('list')
  private static boolean cmdBossBar_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'remove' IDENTIFIER
  private static boolean cmdBossBar_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'set' IDENTIFIER (
  //                                 ('color' COLOR) |
  //                                 ('max' NUMBER) |
  //                                 ('name' STRING) |
  //                                 ('players' (IDENTIFIER | SELECTOR)) |
  //                                 ('style' ('notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress')) |
  //                                 ('value' NUMBER) |
  //                                 ('visible' ('true'|'false'))
  //                            )
  private static boolean cmdBossBar_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdBossBar_1_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('color' COLOR) |
  //                                 ('max' NUMBER) |
  //                                 ('name' STRING) |
  //                                 ('players' (IDENTIFIER | SELECTOR)) |
  //                                 ('style' ('notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress')) |
  //                                 ('value' NUMBER) |
  //                                 ('visible' ('true'|'false'))
  private static boolean cmdBossBar_1_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdBossBar_1_4_2_0(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_1(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_2(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_3(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_4(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_5(b, l + 1);
    if (!r) r = cmdBossBar_1_4_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'color' COLOR
  private static boolean cmdBossBar_1_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "color");
    r = r && consumeToken(b, COLOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'max' NUMBER
  private static boolean cmdBossBar_1_4_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "max");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'name' STRING
  private static boolean cmdBossBar_1_4_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "name");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'players' (IDENTIFIER | SELECTOR)
  private static boolean cmdBossBar_1_4_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "players");
    r = r && cmdBossBar_1_4_2_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdBossBar_1_4_2_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_3_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // 'style' ('notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress')
  private static boolean cmdBossBar_1_4_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "style");
    r = r && cmdBossBar_1_4_2_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'notched_6'|'notched_10'|'notched_12'|'notched_20'|'progress'
  private static boolean cmdBossBar_1_4_2_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_4_1")) return false;
    boolean r;
    r = consumeToken(b, "notched_6");
    if (!r) r = consumeToken(b, "notched_10");
    if (!r) r = consumeToken(b, "notched_12");
    if (!r) r = consumeToken(b, "notched_20");
    if (!r) r = consumeToken(b, "progress");
    return r;
  }

  // 'value' NUMBER
  private static boolean cmdBossBar_1_4_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "value");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'visible' ('true'|'false')
  private static boolean cmdBossBar_1_4_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "visible");
    r = r && cmdBossBar_1_4_2_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'true'|'false'
  private static boolean cmdBossBar_1_4_2_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_6_1")) return false;
    boolean r;
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    return r;
  }

  /* ********************************************************** */
  // 'clear' [SELECTOR [IDENTIFIER [NUMBER]]]
  public static boolean cmdClear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLEAR, "<cmd clear>");
    r = consumeToken(b, "clear");
    r = r && cmdClear_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [SELECTOR [IDENTIFIER [NUMBER]]]
  private static boolean cmdClear_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1")) return false;
    cmdClear_1_0(b, l + 1);
    return true;
  }

  // SELECTOR [IDENTIFIER [NUMBER]]
  private static boolean cmdClear_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECTOR);
    r = r && cmdClear_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER [NUMBER]]
  private static boolean cmdClear_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0_1")) return false;
    cmdClear_1_0_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER [NUMBER]
  private static boolean cmdClear_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && cmdClear_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdClear_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // ('clone' ['from' IDENTIFIER] (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  //                                           (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  //                       ['to' IDENTIFIER])  (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  //                       [ (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  //                       ]
  public static boolean cmdClone(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLONE, "<cmd clone>");
    r = cmdClone_0(b, l + 1);
    r = r && cmdClone_1(b, l + 1);
    r = r && cmdClone_2(b, l + 1);
    r = r && cmdClone_3(b, l + 1);
    r = r && cmdClone_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'clone' ['from' IDENTIFIER] (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  //                                           (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  //                       ['to' IDENTIFIER]
  private static boolean cmdClone_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "clone");
    r = r && cmdClone_0_1(b, l + 1);
    r = r && cmdClone_0_2(b, l + 1);
    r = r && cmdClone_0_3(b, l + 1);
    r = r && cmdClone_0_4(b, l + 1);
    r = r && cmdClone_0_5(b, l + 1);
    r = r && cmdClone_0_6(b, l + 1);
    r = r && cmdClone_0_7(b, l + 1);
    r = r && cmdClone_0_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['from' IDENTIFIER]
  private static boolean cmdClone_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_1")) return false;
    cmdClone_0_1_0(b, l + 1);
    return true;
  }

  // 'from' IDENTIFIER
  private static boolean cmdClone_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_4")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_5")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_6")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_7")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // ['to' IDENTIFIER]
  private static boolean cmdClone_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_8")) return false;
    cmdClone_0_8_0(b, l + 1);
    return true;
  }

  // 'to' IDENTIFIER
  private static boolean cmdClone_0_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_0_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "to");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdClone_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // [ (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  //                       ]
  private static boolean cmdClone_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4")) return false;
    cmdClone_4_0(b, l + 1);
    return true;
  }

  // (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  private static boolean cmdClone_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdClone_4_0_0(b, l + 1);
    if (!r) r = cmdClone_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('replace'|'masked') ['force'|'move'|'normal']
  private static boolean cmdClone_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdClone_4_0_0_0(b, l + 1);
    r = r && cmdClone_4_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace'|'masked'
  private static boolean cmdClone_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "replace");
    if (!r) r = consumeToken(b, "masked");
    return r;
  }

  // ['force'|'move'|'normal']
  private static boolean cmdClone_4_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_0_1")) return false;
    cmdClone_4_0_0_1_0(b, l + 1);
    return true;
  }

  // 'force'|'move'|'normal'
  private static boolean cmdClone_4_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "force");
    if (!r) r = consumeToken(b, "move");
    if (!r) r = consumeToken(b, "normal");
    return r;
  }

  // 'filtered' IDENTIFIER ['force'|'move'|'normal']
  private static boolean cmdClone_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "filtered");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdClone_4_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['force'|'move'|'normal']
  private static boolean cmdClone_4_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_1_2")) return false;
    cmdClone_4_0_1_2_0(b, l + 1);
    return true;
  }

  // 'force'|'move'|'normal'
  private static boolean cmdClone_4_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "force");
    if (!r) r = consumeToken(b, "move");
    if (!r) r = consumeToken(b, "normal");
    return r;
  }

  /* ********************************************************** */
  // 'damage' (IDENTIFIER|SELECTOR) [IDENTIFIER] [('at' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)) |
  //                                                             ('by' IDENTIFIER ['from' IDENTIFIER])]
  public static boolean cmdDamage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DAMAGE, "<cmd damage>");
    r = consumeToken(b, "damage");
    r = r && cmdDamage_1(b, l + 1);
    r = r && cmdDamage_2(b, l + 1);
    r = r && cmdDamage_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER|SELECTOR
  private static boolean cmdDamage_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // [IDENTIFIER]
  private static boolean cmdDamage_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // [('at' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)) |
  //                                                             ('by' IDENTIFIER ['from' IDENTIFIER])]
  private static boolean cmdDamage_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3")) return false;
    cmdDamage_3_0(b, l + 1);
    return true;
  }

  // ('at' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)) |
  //                                                             ('by' IDENTIFIER ['from' IDENTIFIER])
  private static boolean cmdDamage_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDamage_3_0_0(b, l + 1);
    if (!r) r = cmdDamage_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'at' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  private static boolean cmdDamage_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "at");
    r = r && cmdDamage_3_0_0_1(b, l + 1);
    r = r && cmdDamage_3_0_0_2(b, l + 1);
    r = r && cmdDamage_3_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDamage_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_0_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDamage_3_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_0_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDamage_3_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_0_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // 'by' IDENTIFIER ['from' IDENTIFIER]
  private static boolean cmdDamage_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "by");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdDamage_3_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['from' IDENTIFIER]
  private static boolean cmdDamage_3_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_2")) return false;
    cmdDamage_3_0_1_2_0(b, l + 1);
    return true;
  }

  // 'from' IDENTIFIER
  private static boolean cmdDamage_3_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'data' (('get' cmdDataTarget [STRING [NUMBER]]) |
  //                      ('merge' cmdDataTarget JSON) |
  //                      ('modify' cmdDataTarget STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdDataTarget STRING) |
  //                         ('string' cmdDataTarget STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )) |
  //                      ('remove' cmdDataTarget STRING))
  public static boolean cmdData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA, "<cmd data>");
    r = consumeToken(b, "data");
    r = r && cmdData_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('get' cmdDataTarget [STRING [NUMBER]]) |
  //                      ('merge' cmdDataTarget JSON) |
  //                      ('modify' cmdDataTarget STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdDataTarget STRING) |
  //                         ('string' cmdDataTarget STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )) |
  //                      ('remove' cmdDataTarget STRING)
  private static boolean cmdData_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdData_1_0(b, l + 1);
    if (!r) r = cmdData_1_1(b, l + 1);
    if (!r) r = cmdData_1_2(b, l + 1);
    if (!r) r = cmdData_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'get' cmdDataTarget [STRING [NUMBER]]
  private static boolean cmdData_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && cmdDataTarget(b, l + 1);
    r = r && cmdData_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [STRING [NUMBER]]
  private static boolean cmdData_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0_2")) return false;
    cmdData_1_0_2_0(b, l + 1);
    return true;
  }

  // STRING [NUMBER]
  private static boolean cmdData_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && cmdData_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdData_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0_2_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'merge' cmdDataTarget JSON
  private static boolean cmdData_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "merge");
    r = r && cmdDataTarget(b, l + 1);
    r = r && consumeToken(b, JSON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'modify' cmdDataTarget STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdDataTarget STRING) |
  //                         ('string' cmdDataTarget STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )
  private static boolean cmdData_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modify");
    r = r && cmdDataTarget(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && cmdData_1_2_3(b, l + 1);
    r = r && cmdData_1_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'append'|('insert' NUMBER)|'merge'|'prepend'|'set'
  private static boolean cmdData_1_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "append");
    if (!r) r = cmdData_1_2_3_1(b, l + 1);
    if (!r) r = consumeToken(b, "merge");
    if (!r) r = consumeToken(b, "prepend");
    if (!r) r = consumeToken(b, "set");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'insert' NUMBER
  private static boolean cmdData_1_2_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "insert");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('from' cmdDataTarget STRING) |
  //                         ('string' cmdDataTarget STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      
  private static boolean cmdData_1_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdData_1_2_4_0(b, l + 1);
    if (!r) r = cmdData_1_2_4_1(b, l + 1);
    if (!r) r = cmdData_1_2_4_2(b, l + 1);
    if (!r) r = consumeToken(b, CMDDATA_1_2_4_3_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'from' cmdDataTarget STRING
  private static boolean cmdData_1_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && cmdDataTarget(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'string' cmdDataTarget STRING NUMBER NUMBER
  private static boolean cmdData_1_2_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "string");
    r = r && cmdDataTarget(b, l + 1);
    r = r && consumeTokens(b, 0, STRING, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'value' (NUMBER|STRING|JSON|IDENTIFIER)
  private static boolean cmdData_1_2_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "value");
    r = r && cmdData_1_2_4_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER|STRING|JSON|IDENTIFIER
  private static boolean cmdData_1_2_4_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_2_1")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, JSON);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // 'remove' cmdDataTarget STRING
  private static boolean cmdData_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && cmdDataTarget(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'datapack' (('disable' IDENTIFIER) |
  //                              ('enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)])
  //                              ('list' ['available'|'enabled']))
  public static boolean cmdDataPack(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA_PACK, "<cmd data pack>");
    r = consumeToken(b, "datapack");
    r = r && cmdDataPack_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('disable' IDENTIFIER) |
  //                              ('enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)])
  //                              ('list' ['available'|'enabled'])
  private static boolean cmdDataPack_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_0(b, l + 1);
    if (!r) r = cmdDataPack_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'disable' IDENTIFIER
  private static boolean cmdDataPack_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "disable");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)])
  //                              ('list' ['available'|'enabled'])
  private static boolean cmdDataPack_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_1_0(b, l + 1);
    r = r && cmdDataPack_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)]
  private static boolean cmdDataPack_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enable");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdDataPack_1_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('first'|'last') | (('before'|'after') IDENTIFIER)]
  private static boolean cmdDataPack_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0_2")) return false;
    cmdDataPack_1_1_0_2_0(b, l + 1);
    return true;
  }

  // ('first'|'last') | (('before'|'after') IDENTIFIER)
  private static boolean cmdDataPack_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_1_0_2_0_0(b, l + 1);
    if (!r) r = cmdDataPack_1_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'first'|'last'
  private static boolean cmdDataPack_1_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, "first");
    if (!r) r = consumeToken(b, "last");
    return r;
  }

  // ('before'|'after') IDENTIFIER
  private static boolean cmdDataPack_1_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_1_0_2_0_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'before'|'after'
  private static boolean cmdDataPack_1_1_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_0_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "before");
    if (!r) r = consumeToken(b, "after");
    return r;
  }

  // 'list' ['available'|'enabled']
  private static boolean cmdDataPack_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    r = r && cmdDataPack_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['available'|'enabled']
  private static boolean cmdDataPack_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_1_1")) return false;
    cmdDataPack_1_1_1_1_0(b, l + 1);
    return true;
  }

  // 'available'|'enabled'
  private static boolean cmdDataPack_1_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, "available");
    if (!r) r = consumeToken(b, "enabled");
    return r;
  }

  /* ********************************************************** */
  // ('block' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)) |
  //                       ('entity' (IDENTIFIER|SELECTOR)) |
  //                       ('storage' STRING)
  public static boolean cmdDataTarget(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA_TARGET, "<cmd data target>");
    r = cmdDataTarget_0(b, l + 1);
    if (!r) r = cmdDataTarget_1(b, l + 1);
    if (!r) r = cmdDataTarget_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'block' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  private static boolean cmdDataTarget_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && cmdDataTarget_0_1(b, l + 1);
    r = r && cmdDataTarget_0_2(b, l + 1);
    r = r && cmdDataTarget_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDataTarget_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_0_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDataTarget_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_0_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdDataTarget_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_0_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // 'entity' (IDENTIFIER|SELECTOR)
  private static boolean cmdDataTarget_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && cmdDataTarget_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|SELECTOR
  private static boolean cmdDataTarget_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_1_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  // 'storage' STRING
  private static boolean cmdDataTarget_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataTarget_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "storage");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'fill' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER) (IDENTIFIER | SELECTOR) [ 'destroy'|'hollow'|'keep'|'outline' | ('replace' (IDENTIFIER | SELECTOR)) ]
  public static boolean cmdFill(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_FILL, "<cmd fill>");
    r = consumeToken(b, "fill");
    r = r && cmdFill_1(b, l + 1);
    r = r && cmdFill_2(b, l + 1);
    r = r && cmdFill_3(b, l + 1);
    r = r && cmdFill_4(b, l + 1);
    r = r && cmdFill_5(b, l + 1);
    r = r && cmdFill_6(b, l + 1);
    r = r && cmdFill_7(b, l + 1);
    r = r && cmdFill_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_4")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_5")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdFill_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_6")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
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

  // [ 'destroy'|'hollow'|'keep'|'outline' | ('replace' (IDENTIFIER | SELECTOR)) ]
  private static boolean cmdFill_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_8")) return false;
    cmdFill_8_0(b, l + 1);
    return true;
  }

  // 'destroy'|'hollow'|'keep'|'outline' | ('replace' (IDENTIFIER | SELECTOR))
  private static boolean cmdFill_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "destroy");
    if (!r) r = consumeToken(b, "hollow");
    if (!r) r = consumeToken(b, "keep");
    if (!r) r = consumeToken(b, "outline");
    if (!r) r = cmdFill_8_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace' (IDENTIFIER | SELECTOR)
  private static boolean cmdFill_8_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_8_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "replace");
    r = r && cmdFill_8_0_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | SELECTOR
  private static boolean cmdFill_8_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_8_0_4_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELECTOR);
    return r;
  }

  /* ********************************************************** */
  // 'give' (IDENTIFIER | SELECTOR) IDENTIFIER [ NUMBER ]
  public static boolean cmdGive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_GIVE, "<cmd give>");
    r = consumeToken(b, "give");
    r = r && cmdGive_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdGive_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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

  // [ NUMBER ]
  private static boolean cmdGive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'setblock' (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER) IDENTIFIER
  public static boolean cmdSetBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SET_BLOCK, "<cmd set block>");
    r = consumeToken(b, "setblock");
    r = r && cmdSetBlock_1(b, l + 1);
    r = r && cmdSetBlock_2(b, l + 1);
    r = r && cmdSetBlock_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdSetBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdSetBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean cmdSetBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock_3")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
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
  // COMMAND_ARGUMENT | COMMAND
  public static boolean placeholder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "placeholder")) return false;
    if (!nextTokenIs(b, "<placeholder>", COMMAND, COMMAND_ARGUMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLACEHOLDER, "<placeholder>");
    r = consumeToken(b, COMMAND_ARGUMENT);
    if (!r) r = consumeToken(b, COMMAND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cmdAdvancement | cmdAttribute | cmdBan | cmdBossBar | cmdClear | cmdSetBlock | cmdGive | cmdFill |
  //               cmdClone | cmdDamage | cmdData | cmdDataPack
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = cmdAdvancement(b, l + 1);
    if (!r) r = cmdAttribute(b, l + 1);
    if (!r) r = cmdBan(b, l + 1);
    if (!r) r = cmdBossBar(b, l + 1);
    if (!r) r = cmdClear(b, l + 1);
    if (!r) r = cmdSetBlock(b, l + 1);
    if (!r) r = cmdGive(b, l + 1);
    if (!r) r = cmdFill(b, l + 1);
    if (!r) r = cmdClone(b, l + 1);
    if (!r) r = cmdDamage(b, l + 1);
    if (!r) r = cmdData(b, l + 1);
    if (!r) r = cmdDataPack(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR
  public static boolean unused(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    exit_section_(b, m, UNUSED, r);
    return r;
  }

}
