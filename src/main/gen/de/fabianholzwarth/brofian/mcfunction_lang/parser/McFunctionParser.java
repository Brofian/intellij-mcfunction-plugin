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
  // 'advancement' ('revoke'|'grant') targetSelector ('everything' |
  //                                                                      (('from'|'through'|'until') IDENTIFIER) |
  //                                                                      ('only' IDENTIFIER [ IDENTIFIER ]))
  public static boolean cmdAdvancement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ADVANCEMENT, "<cmd advancement>");
    r = consumeToken(b, "advancement");
    r = r && cmdAdvancement_1(b, l + 1);
    r = r && targetSelector(b, l + 1);
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

  // 'everything' |
  //                                                                      (('from'|'through'|'until') IDENTIFIER) |
  //                                                                      ('only' IDENTIFIER [ IDENTIFIER ])
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
  // 'attribute' targetSelector IDENTIFIER (('get' NUMBER) |
  //                                                          ('base' ('get' [NUMBER] |'set' NUMBER)) |
  //                                                          ('modifier' (
  //                                                             ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                             ('remove' IDENTIFIER) |
  //                                                             ('value' 'get' IDENTIFIER [NUMBER]))))
  public static boolean cmdAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ATTRIBUTE, "<cmd attribute>");
    r = consumeToken(b, "attribute");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdAttribute_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('get' NUMBER) |
  //                                                          ('base' ('get' [NUMBER] |'set' NUMBER)) |
  //                                                          ('modifier' (
  //                                                             ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                             ('remove' IDENTIFIER) |
  //                                                             ('value' 'get' IDENTIFIER [NUMBER])))
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
  //                                                             ('add' IDENTIFIER IDENTIFIER NUMBER ('add'|'multiply'|'multiply_base')) |
  //                                                             ('remove' IDENTIFIER) |
  //                                                             ('value' 'get' IDENTIFIER [NUMBER]))
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
  //                                                             ('remove' IDENTIFIER) |
  //                                                             ('value' 'get' IDENTIFIER [NUMBER])
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
  // 'ban' targetSelector [STRING]
  public static boolean cmdBan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBan")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_BAN, "<cmd ban>");
    r = consumeToken(b, "ban");
    r = r && targetSelector(b, l + 1);
    r = r && cmdBan_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  //                                 ('players' targetSelector) |
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
  //                                 ('players' targetSelector) |
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
  //                                 ('players' targetSelector) |
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
  //                                 ('players' targetSelector) |
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

  // 'players' targetSelector
  private static boolean cmdBossBar_1_4_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "players");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
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
  // 'clear' [SELECTOR [extendedIdentifier [NUMBER]]]
  public static boolean cmdClear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLEAR, "<cmd clear>");
    r = consumeToken(b, "clear");
    r = r && cmdClear_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [SELECTOR [extendedIdentifier [NUMBER]]]
  private static boolean cmdClear_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1")) return false;
    cmdClear_1_0(b, l + 1);
    return true;
  }

  // SELECTOR [extendedIdentifier [NUMBER]]
  private static boolean cmdClear_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECTOR);
    r = r && cmdClear_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [extendedIdentifier [NUMBER]]
  private static boolean cmdClear_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0_1")) return false;
    cmdClear_1_0_1_0(b, l + 1);
    return true;
  }

  // extendedIdentifier [NUMBER]
  private static boolean cmdClear_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extendedIdentifier(b, l + 1);
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
  // 'clone' ['from' IDENTIFIER] coordinateTripe coordinateTripe
  //                       ['to' IDENTIFIER]   coordinateTripe
  //                       [ (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  //                       ]
  public static boolean cmdClone(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLONE, "<cmd clone>");
    r = consumeToken(b, "clone");
    r = r && cmdClone_1(b, l + 1);
    r = r && coordinateTripe(b, l + 1);
    r = r && coordinateTripe(b, l + 1);
    r = r && cmdClone_4(b, l + 1);
    r = r && coordinateTripe(b, l + 1);
    r = r && cmdClone_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['from' IDENTIFIER]
  private static boolean cmdClone_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_1")) return false;
    cmdClone_1_0(b, l + 1);
    return true;
  }

  // 'from' IDENTIFIER
  private static boolean cmdClone_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['to' IDENTIFIER]
  private static boolean cmdClone_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4")) return false;
    cmdClone_4_0(b, l + 1);
    return true;
  }

  // 'to' IDENTIFIER
  private static boolean cmdClone_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "to");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  //                       ]
  private static boolean cmdClone_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6")) return false;
    cmdClone_6_0(b, l + 1);
    return true;
  }

  // (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  private static boolean cmdClone_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdClone_6_0_0(b, l + 1);
    if (!r) r = cmdClone_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('replace'|'masked') ['force'|'move'|'normal']
  private static boolean cmdClone_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdClone_6_0_0_0(b, l + 1);
    r = r && cmdClone_6_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace'|'masked'
  private static boolean cmdClone_6_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "replace");
    if (!r) r = consumeToken(b, "masked");
    return r;
  }

  // ['force'|'move'|'normal']
  private static boolean cmdClone_6_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_0_1")) return false;
    cmdClone_6_0_0_1_0(b, l + 1);
    return true;
  }

  // 'force'|'move'|'normal'
  private static boolean cmdClone_6_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "force");
    if (!r) r = consumeToken(b, "move");
    if (!r) r = consumeToken(b, "normal");
    return r;
  }

  // 'filtered' IDENTIFIER ['force'|'move'|'normal']
  private static boolean cmdClone_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "filtered");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdClone_6_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['force'|'move'|'normal']
  private static boolean cmdClone_6_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_1_2")) return false;
    cmdClone_6_0_1_2_0(b, l + 1);
    return true;
  }

  // 'force'|'move'|'normal'
  private static boolean cmdClone_6_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone_6_0_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "force");
    if (!r) r = consumeToken(b, "move");
    if (!r) r = consumeToken(b, "normal");
    return r;
  }

  /* ********************************************************** */
  // 'damage' targetSelector NUMBER [IDENTIFIER [('at' coordinateTripe) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]]
  public static boolean cmdDamage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DAMAGE, "<cmd damage>");
    r = consumeToken(b, "damage");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    r = r && cmdDamage_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [IDENTIFIER [('at' coordinateTripe) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]]
  private static boolean cmdDamage_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3")) return false;
    cmdDamage_3_0(b, l + 1);
    return true;
  }

  // IDENTIFIER [('at' coordinateTripe) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]
  private static boolean cmdDamage_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && cmdDamage_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('at' coordinateTripe) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]
  private static boolean cmdDamage_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1")) return false;
    cmdDamage_3_0_1_0(b, l + 1);
    return true;
  }

  // ('at' coordinateTripe) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])
  private static boolean cmdDamage_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDamage_3_0_1_0_0(b, l + 1);
    if (!r) r = cmdDamage_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'at' coordinateTripe
  private static boolean cmdDamage_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "at");
    r = r && coordinateTripe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'by' IDENTIFIER ['from' IDENTIFIER]
  private static boolean cmdDamage_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "by");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdDamage_3_0_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['from' IDENTIFIER]
  private static boolean cmdDamage_3_0_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0_1_2")) return false;
    cmdDamage_3_0_1_0_1_2_0(b, l + 1);
    return true;
  }

  // 'from' IDENTIFIER
  private static boolean cmdDamage_3_0_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'data' (('get' cmdData_Target [IDENTIFIER [NUMBER]]) |
  //                      ('merge' cmdData_Target JSON) |
  //                      ('modify' cmdData_Target STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdData_Target STRING) |
  //                         ('string' cmdData_Target STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )) |
  //                      ('remove' cmdData_Target STRING))
  public static boolean cmdData(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA, "<cmd data>");
    r = consumeToken(b, "data");
    r = r && cmdData_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('get' cmdData_Target [IDENTIFIER [NUMBER]]) |
  //                      ('merge' cmdData_Target JSON) |
  //                      ('modify' cmdData_Target STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdData_Target STRING) |
  //                         ('string' cmdData_Target STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )) |
  //                      ('remove' cmdData_Target STRING)
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

  // 'get' cmdData_Target [IDENTIFIER [NUMBER]]
  private static boolean cmdData_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && cmdData_Target(b, l + 1);
    r = r && cmdData_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER [NUMBER]]
  private static boolean cmdData_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0_2")) return false;
    cmdData_1_0_2_0(b, l + 1);
    return true;
  }

  // IDENTIFIER [NUMBER]
  private static boolean cmdData_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
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

  // 'merge' cmdData_Target JSON
  private static boolean cmdData_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "merge");
    r = r && cmdData_Target(b, l + 1);
    r = r && consumeToken(b, JSON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'modify' cmdData_Target STRING ('append'|('insert' NUMBER)|'merge'|'prepend'|'set') (
  //                         ('from' cmdData_Target STRING) |
  //                         ('string' cmdData_Target STRING NUMBER NUMBER) |
  //                         ('value' (NUMBER|STRING|JSON|IDENTIFIER)) |
  //                      )
  private static boolean cmdData_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modify");
    r = r && cmdData_Target(b, l + 1);
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

  // ('from' cmdData_Target STRING) |
  //                         ('string' cmdData_Target STRING NUMBER NUMBER) |
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

  // 'from' cmdData_Target STRING
  private static boolean cmdData_1_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && cmdData_Target(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'string' cmdData_Target STRING NUMBER NUMBER
  private static boolean cmdData_1_2_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_2_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "string");
    r = r && cmdData_Target(b, l + 1);
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

  // 'remove' cmdData_Target STRING
  private static boolean cmdData_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && cmdData_Target(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'datapack' (('disable' IDENTIFIER) |
  //                              ('enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)]) |
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
  //                              ('enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)]) |
  //                              ('list' ['available'|'enabled'])
  private static boolean cmdDataPack_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_0(b, l + 1);
    if (!r) r = cmdDataPack_1_1(b, l + 1);
    if (!r) r = cmdDataPack_1_2(b, l + 1);
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

  // 'enable' IDENTIFIER [('first'|'last') | (('before'|'after') IDENTIFIER)]
  private static boolean cmdDataPack_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enable");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdDataPack_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('first'|'last') | (('before'|'after') IDENTIFIER)]
  private static boolean cmdDataPack_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_2")) return false;
    cmdDataPack_1_1_2_0(b, l + 1);
    return true;
  }

  // ('first'|'last') | (('before'|'after') IDENTIFIER)
  private static boolean cmdDataPack_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_1_2_0_0(b, l + 1);
    if (!r) r = cmdDataPack_1_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'first'|'last'
  private static boolean cmdDataPack_1_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, "first");
    if (!r) r = consumeToken(b, "last");
    return r;
  }

  // ('before'|'after') IDENTIFIER
  private static boolean cmdDataPack_1_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdDataPack_1_1_2_0_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'before'|'after'
  private static boolean cmdDataPack_1_1_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_1_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "before");
    if (!r) r = consumeToken(b, "after");
    return r;
  }

  // 'list' ['available'|'enabled']
  private static boolean cmdDataPack_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    r = r && cmdDataPack_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['available'|'enabled']
  private static boolean cmdDataPack_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_2_1")) return false;
    cmdDataPack_1_2_1_0(b, l + 1);
    return true;
  }

  // 'available'|'enabled'
  private static boolean cmdDataPack_1_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDataPack_1_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, "available");
    if (!r) r = consumeToken(b, "enabled");
    return r;
  }

  /* ********************************************************** */
  // ('block' coordinateTripe) |
  //                        ('entity' targetSelector) |
  //                        ('storage' STRING)
  public static boolean cmdData_Target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_Target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA_TARGET, "<cmd data target>");
    r = cmdData_Target_0(b, l + 1);
    if (!r) r = cmdData_Target_1(b, l + 1);
    if (!r) r = cmdData_Target_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'block' coordinateTripe
  private static boolean cmdData_Target_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_Target_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTripe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'entity' targetSelector
  private static boolean cmdData_Target_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_Target_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'storage' STRING
  private static boolean cmdData_Target_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_Target_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "storage");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'debug' ('start' | 'stop' | ('function' IDENTIFIER))
  public static boolean cmdDebug(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDebug")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DEBUG, "<cmd debug>");
    r = consumeToken(b, "debug");
    r = r && cmdDebug_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'start' | 'stop' | ('function' IDENTIFIER)
  private static boolean cmdDebug_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDebug_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "start");
    if (!r) r = consumeToken(b, "stop");
    if (!r) r = cmdDebug_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'function' IDENTIFIER
  private static boolean cmdDebug_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDebug_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "function");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defaultgamemode' ('survival'|'creative'|'adventure'|'spectator')
  public static boolean cmdDefaultGameMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDefaultGameMode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DEFAULT_GAME_MODE, "<cmd default game mode>");
    r = consumeToken(b, "defaultgamemode");
    r = r && cmdDefaultGameMode_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'survival'|'creative'|'adventure'|'spectator'
  private static boolean cmdDefaultGameMode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDefaultGameMode_1")) return false;
    boolean r;
    r = consumeToken(b, "survival");
    if (!r) r = consumeToken(b, "creative");
    if (!r) r = consumeToken(b, "adventure");
    if (!r) r = consumeToken(b, "spectator");
    return r;
  }

  /* ********************************************************** */
  // 'difficulty' ['peaceful'|'easy'|'normal'|'hard']
  public static boolean cmdDifficulty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDifficulty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_DIFFICULTY, "<cmd difficulty>");
    r = consumeToken(b, "difficulty");
    r = r && cmdDifficulty_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['peaceful'|'easy'|'normal'|'hard']
  private static boolean cmdDifficulty_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDifficulty_1")) return false;
    cmdDifficulty_1_0(b, l + 1);
    return true;
  }

  // 'peaceful'|'easy'|'normal'|'hard'
  private static boolean cmdDifficulty_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDifficulty_1_0")) return false;
    boolean r;
    r = consumeToken(b, "peaceful");
    if (!r) r = consumeToken(b, "easy");
    if (!r) r = consumeToken(b, "normal");
    if (!r) r = consumeToken(b, "hard");
    return r;
  }

  /* ********************************************************** */
  // 'effect' (('clear' [targetSelector [IDENTIFIER]]) |
  //                          ('give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER ['true'|'false']]]))
  public static boolean cmdEffect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_EFFECT, "<cmd effect>");
    r = consumeToken(b, "effect");
    r = r && cmdEffect_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('clear' [targetSelector [IDENTIFIER]]) |
  //                          ('give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER ['true'|'false']]])
  private static boolean cmdEffect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdEffect_1_0(b, l + 1);
    if (!r) r = cmdEffect_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'clear' [targetSelector [IDENTIFIER]]
  private static boolean cmdEffect_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "clear");
    r = r && cmdEffect_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector [IDENTIFIER]]
  private static boolean cmdEffect_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_0_1")) return false;
    cmdEffect_1_0_1_0(b, l + 1);
    return true;
  }

  // targetSelector [IDENTIFIER]
  private static boolean cmdEffect_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetSelector(b, l + 1);
    r = r && cmdEffect_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER]
  private static boolean cmdEffect_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_0_1_0_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // 'give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER ['true'|'false']]]
  private static boolean cmdEffect_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "give");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdEffect_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(NUMBER|'infinite') [NUMBER ['true'|'false']]]
  private static boolean cmdEffect_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3")) return false;
    cmdEffect_1_1_3_0(b, l + 1);
    return true;
  }

  // (NUMBER|'infinite') [NUMBER ['true'|'false']]
  private static boolean cmdEffect_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdEffect_1_1_3_0_0(b, l + 1);
    r = r && cmdEffect_1_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER|'infinite'
  private static boolean cmdEffect_1_1_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, "infinite");
    return r;
  }

  // [NUMBER ['true'|'false']]
  private static boolean cmdEffect_1_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1")) return false;
    cmdEffect_1_1_3_0_1_0(b, l + 1);
    return true;
  }

  // NUMBER ['true'|'false']
  private static boolean cmdEffect_1_1_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && cmdEffect_1_1_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['true'|'false']
  private static boolean cmdEffect_1_1_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1_0_1")) return false;
    cmdEffect_1_1_3_0_1_0_1_0(b, l + 1);
    return true;
  }

  // 'true'|'false'
  private static boolean cmdEffect_1_1_3_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    return r;
  }

  /* ********************************************************** */
  // 'enchant' targetSelector IDENTIFIER [NUMBER]
  public static boolean cmdEnchant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEnchant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ENCHANT, "<cmd enchant>");
    r = consumeToken(b, "enchant");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdEnchant_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [NUMBER]
  private static boolean cmdEnchant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEnchant_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // ('enchant'|'xp') (('query' targetSelector ('levels'|'points')) |
  //                                      (('add'|'set') targetSelector ['levels'|'points']))
  public static boolean cmdExperience(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_EXPERIENCE, "<cmd experience>");
    r = cmdExperience_0(b, l + 1);
    r = r && cmdExperience_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'enchant'|'xp'
  private static boolean cmdExperience_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_0")) return false;
    boolean r;
    r = consumeToken(b, "enchant");
    if (!r) r = consumeToken(b, "xp");
    return r;
  }

  // ('query' targetSelector ('levels'|'points')) |
  //                                      (('add'|'set') targetSelector ['levels'|'points'])
  private static boolean cmdExperience_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExperience_1_0(b, l + 1);
    if (!r) r = cmdExperience_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'query' targetSelector ('levels'|'points')
  private static boolean cmdExperience_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "query");
    r = r && targetSelector(b, l + 1);
    r = r && cmdExperience_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'levels'|'points'
  private static boolean cmdExperience_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_0_2")) return false;
    boolean r;
    r = consumeToken(b, "levels");
    if (!r) r = consumeToken(b, "points");
    return r;
  }

  // ('add'|'set') targetSelector ['levels'|'points']
  private static boolean cmdExperience_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExperience_1_1_0(b, l + 1);
    r = r && targetSelector(b, l + 1);
    r = r && cmdExperience_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add'|'set'
  private static boolean cmdExperience_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "set");
    return r;
  }

  // ['levels'|'points']
  private static boolean cmdExperience_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_1_2")) return false;
    cmdExperience_1_1_2_0(b, l + 1);
    return true;
  }

  // 'levels'|'points'
  private static boolean cmdExperience_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience_1_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "levels");
    if (!r) r = consumeToken(b, "points");
    return r;
  }

  /* ********************************************************** */
  // 'fill' coordinateTripe coordinateTripe extendedIdentifier [ 'destroy'|'hollow'|'keep'|'outline' | ('replace' IDENTIFIER) ]
  public static boolean cmdFill(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_FILL, "<cmd fill>");
    r = consumeToken(b, "fill");
    r = r && coordinateTripe(b, l + 1);
    r = r && coordinateTripe(b, l + 1);
    r = r && extendedIdentifier(b, l + 1);
    r = r && cmdFill_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'destroy'|'hollow'|'keep'|'outline' | ('replace' IDENTIFIER) ]
  private static boolean cmdFill_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_4")) return false;
    cmdFill_4_0(b, l + 1);
    return true;
  }

  // 'destroy'|'hollow'|'keep'|'outline' | ('replace' IDENTIFIER)
  private static boolean cmdFill_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "destroy");
    if (!r) r = consumeToken(b, "hollow");
    if (!r) r = consumeToken(b, "keep");
    if (!r) r = consumeToken(b, "outline");
    if (!r) r = cmdFill_4_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace' IDENTIFIER
  private static boolean cmdFill_4_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill_4_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "replace");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'fillbiome' coordinateTripe coordinateTripe IDENTIFIER ['replace' IDENTIFIER]
  public static boolean cmdFillBiome(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFillBiome")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_FILL_BIOME, "<cmd fill biome>");
    r = consumeToken(b, "fillbiome");
    r = r && coordinateTripe(b, l + 1);
    r = r && coordinateTripe(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdFillBiome_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['replace' IDENTIFIER]
  private static boolean cmdFillBiome_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFillBiome_4")) return false;
    cmdFillBiome_4_0(b, l + 1);
    return true;
  }

  // 'replace' IDENTIFIER
  private static boolean cmdFillBiome_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFillBiome_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "replace");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'forceload' (('add' COORDINATE COORDINATE [COORDINATE COORDINATE]) |
  //                                ('remove' ('all'| (COORDINATE COORDINATE [COORDINATE COORDINATE]))) |
  //                                ('query' COORDINATE COORDINATE))
  public static boolean cmdForceLoad(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_FORCE_LOAD, "<cmd force load>");
    r = consumeToken(b, "forceload");
    r = r && cmdForceLoad_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('add' COORDINATE COORDINATE [COORDINATE COORDINATE]) |
  //                                ('remove' ('all'| (COORDINATE COORDINATE [COORDINATE COORDINATE]))) |
  //                                ('query' COORDINATE COORDINATE)
  private static boolean cmdForceLoad_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdForceLoad_1_0(b, l + 1);
    if (!r) r = cmdForceLoad_1_1(b, l + 1);
    if (!r) r = cmdForceLoad_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' COORDINATE COORDINATE [COORDINATE COORDINATE]
  private static boolean cmdForceLoad_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeTokens(b, 0, COORDINATE, COORDINATE);
    r = r && cmdForceLoad_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COORDINATE COORDINATE]
  private static boolean cmdForceLoad_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_0_3")) return false;
    parseTokens(b, 0, COORDINATE, COORDINATE);
    return true;
  }

  // 'remove' ('all'| (COORDINATE COORDINATE [COORDINATE COORDINATE]))
  private static boolean cmdForceLoad_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && cmdForceLoad_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all'| (COORDINATE COORDINATE [COORDINATE COORDINATE])
  private static boolean cmdForceLoad_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "all");
    if (!r) r = cmdForceLoad_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COORDINATE COORDINATE [COORDINATE COORDINATE]
  private static boolean cmdForceLoad_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COORDINATE, COORDINATE);
    r = r && cmdForceLoad_1_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COORDINATE COORDINATE]
  private static boolean cmdForceLoad_1_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1_1_2")) return false;
    parseTokens(b, 0, COORDINATE, COORDINATE);
    return true;
  }

  // 'query' COORDINATE COORDINATE
  private static boolean cmdForceLoad_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "query");
    r = r && consumeTokens(b, 0, COORDINATE, COORDINATE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'function' IDENTIFIER
  public static boolean cmdFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_FUNCTION, "<cmd function>");
    r = consumeToken(b, "function");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'gamemode' ('survival'|'creative'|'adventure'|'spectator') [targetSelector]
  public static boolean cmdGameMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameMode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_GAME_MODE, "<cmd game mode>");
    r = consumeToken(b, "gamemode");
    r = r && cmdGameMode_1(b, l + 1);
    r = r && cmdGameMode_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'survival'|'creative'|'adventure'|'spectator'
  private static boolean cmdGameMode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameMode_1")) return false;
    boolean r;
    r = consumeToken(b, "survival");
    if (!r) r = consumeToken(b, "creative");
    if (!r) r = consumeToken(b, "adventure");
    if (!r) r = consumeToken(b, "spectator");
    return r;
  }

  // [targetSelector]
  private static boolean cmdGameMode_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameMode_2")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'gamerule' IDENTIFIER [NUMBER|'true'|'false']
  public static boolean cmdGameRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_GAME_RULE, "<cmd game rule>");
    r = consumeToken(b, "gamerule");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdGameRule_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [NUMBER|'true'|'false']
  private static boolean cmdGameRule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule_2")) return false;
    cmdGameRule_2_0(b, l + 1);
    return true;
  }

  // NUMBER|'true'|'false'
  private static boolean cmdGameRule_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule_2_0")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    return r;
  }

  /* ********************************************************** */
  // 'give' targetSelector extendedIdentifier [ NUMBER ]
  public static boolean cmdGive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_GIVE, "<cmd give>");
    r = consumeToken(b, "give");
    r = r && targetSelector(b, l + 1);
    r = r && extendedIdentifier(b, l + 1);
    r = r && cmdGive_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ NUMBER ]
  private static boolean cmdGive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'setblock' coordinateTripe IDENTIFIER
  public static boolean cmdSetBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SET_BLOCK, "<cmd set block>");
    r = consumeToken(b, "setblock");
    r = r && coordinateTripe(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  public static boolean coordinateTripe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTripe")) return false;
    if (!nextTokenIs(b, "<coordinate tripe>", COORDINATE, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COORDINATE_TRIPE, "<coordinate tripe>");
    r = coordinateTripe_0(b, l + 1);
    r = r && coordinateTripe_1(b, l + 1);
    r = r && coordinateTripe_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTripe_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTripe_0")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTripe_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTripe_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTripe_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTripe_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER[JSON]
  public static boolean extendedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extendedIdentifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && extendedIdentifier_1(b, l + 1);
    exit_section_(b, m, EXTENDED_IDENTIFIER, r);
    return r;
  }

  // [JSON]
  private static boolean extendedIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extendedIdentifier_1")) return false;
    consumeToken(b, JSON);
    return true;
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
  // cmdAdvancement | cmdAttribute | cmdBan | cmdBossBar | cmdClear | cmdClone | cmdDamage | cmdData | cmdDataPack | cmdDebug | cmdDefaultGameMode | cmdDifficulty | cmdEffect | cmdEnchant |
  //               cmdExperience | cmdFill | cmdFillBiome | cmdForceLoad | cmdFunction | cmdGameRule | cmdGameMode | cmdGive | cmdSetBlock
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = cmdAdvancement(b, l + 1);
    if (!r) r = cmdAttribute(b, l + 1);
    if (!r) r = cmdBan(b, l + 1);
    if (!r) r = cmdBossBar(b, l + 1);
    if (!r) r = cmdClear(b, l + 1);
    if (!r) r = cmdClone(b, l + 1);
    if (!r) r = cmdDamage(b, l + 1);
    if (!r) r = cmdData(b, l + 1);
    if (!r) r = cmdDataPack(b, l + 1);
    if (!r) r = cmdDebug(b, l + 1);
    if (!r) r = cmdDefaultGameMode(b, l + 1);
    if (!r) r = cmdDifficulty(b, l + 1);
    if (!r) r = cmdEffect(b, l + 1);
    if (!r) r = cmdEnchant(b, l + 1);
    if (!r) r = cmdExperience(b, l + 1);
    if (!r) r = cmdFill(b, l + 1);
    if (!r) r = cmdFillBiome(b, l + 1);
    if (!r) r = cmdForceLoad(b, l + 1);
    if (!r) r = cmdFunction(b, l + 1);
    if (!r) r = cmdGameRule(b, l + 1);
    if (!r) r = cmdGameMode(b, l + 1);
    if (!r) r = cmdGive(b, l + 1);
    if (!r) r = cmdSetBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SELECTOR|IDENTIFIER
  public static boolean targetSelector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetSelector")) return false;
    if (!nextTokenIs(b, "<target selector>", IDENTIFIER, SELECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET_SELECTOR, "<target selector>");
    r = consumeToken(b, SELECTOR);
    if (!r) r = consumeToken(b, IDENTIFIER);
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
