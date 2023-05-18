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
  // 'true'|'false'
  public static boolean boolValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_VALUE, "<bool value>");
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'advancement' ('revoke'|'grant') targetSelector ('everything' |
  //                                                                      (('from'|'through'|'until') IDENTIFIER) |
  //                                                                      ('only' IDENTIFIER [ IDENTIFIER ]))
  public static boolean cmdAdvancement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdAdvancement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_ADVANCEMENT, "<cmd advancement>");
    r = consumeToken(b, "advancement");
    p = r; // pin = 1
    r = r && report_error_(b, cmdAdvancement_1(b, l + 1));
    r = p && report_error_(b, targetSelector(b, l + 1)) && r;
    r = p && cmdAdvancement_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_ATTRIBUTE, "<cmd attribute>");
    r = consumeToken(b, "attribute");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && cmdAttribute_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_BAN, "<cmd ban>");
    r = consumeToken(b, "ban");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && cmdBan_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  //                                 ('visible' boolValue)
  //                            )))
  public static boolean cmdBossBar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_BOSS_BAR, "<cmd boss bar>");
    r = consumeToken(b, "bossbar");
    p = r; // pin = 1
    r = r && cmdBossBar_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  //                                 ('visible' boolValue)
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
  //                                 ('visible' boolValue)
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
  //                                 ('visible' boolValue)
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

  // 'visible' boolValue
  private static boolean cmdBossBar_1_4_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdBossBar_1_4_2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "visible");
    r = r && boolValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'clear' [SELECTOR [extendedIdentifier [NUMBER]]]
  public static boolean cmdClear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClear")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLEAR, "<cmd clear>");
    r = consumeToken(b, "clear");
    p = r; // pin = 1
    r = r && cmdClear_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'clone' ['from' IDENTIFIER] coordinateTriple coordinateTriple
  //                       ['to' IDENTIFIER]   coordinateTriple
  //                       [ (('replace'|'masked') ['force'|'move'|'normal']) |
  //                         ('filtered' IDENTIFIER ['force'|'move'|'normal'])
  //                       ]
  public static boolean cmdClone(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdClone")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_CLONE, "<cmd clone>");
    r = consumeToken(b, "clone");
    p = r; // pin = 1
    r = r && report_error_(b, cmdClone_1(b, l + 1));
    r = p && report_error_(b, coordinateTriple(b, l + 1)) && r;
    r = p && report_error_(b, coordinateTriple(b, l + 1)) && r;
    r = p && report_error_(b, cmdClone_4(b, l + 1)) && r;
    r = p && report_error_(b, coordinateTriple(b, l + 1)) && r;
    r = p && cmdClone_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'damage' targetSelector NUMBER [IDENTIFIER [('at' coordinateTriple) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]]
  public static boolean cmdDamage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DAMAGE, "<cmd damage>");
    r = consumeToken(b, "damage");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && report_error_(b, consumeToken(b, NUMBER)) && r;
    r = p && cmdDamage_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [IDENTIFIER [('at' coordinateTriple) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]]
  private static boolean cmdDamage_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3")) return false;
    cmdDamage_3_0(b, l + 1);
    return true;
  }

  // IDENTIFIER [('at' coordinateTriple) |
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

  // [('at' coordinateTriple) |
  //                                                            ('by' IDENTIFIER ['from' IDENTIFIER])]
  private static boolean cmdDamage_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1")) return false;
    cmdDamage_3_0_1_0(b, l + 1);
    return true;
  }

  // ('at' coordinateTriple) |
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

  // 'at' coordinateTriple
  private static boolean cmdDamage_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdDamage_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "at");
    r = r && coordinateTriple(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA, "<cmd data>");
    r = consumeToken(b, "data");
    p = r; // pin = 1
    r = r && cmdData_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DATA_PACK, "<cmd data pack>");
    r = consumeToken(b, "datapack");
    p = r; // pin = 1
    r = r && cmdDataPack_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // ('block' coordinateTriple) |
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

  // 'block' coordinateTriple
  private static boolean cmdData_Target_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdData_Target_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DEBUG, "<cmd debug>");
    r = consumeToken(b, "debug");
    p = r; // pin = 1
    r = r && cmdDebug_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DEFAULT_GAME_MODE, "<cmd default game mode>");
    r = consumeToken(b, "defaultgamemode");
    p = r; // pin = 1
    r = r && cmdDefaultGameMode_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_DIFFICULTY, "<cmd difficulty>");
    r = consumeToken(b, "difficulty");
    p = r; // pin = 1
    r = r && cmdDifficulty_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  //                          ('give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER [boolValue]]]))
  public static boolean cmdEffect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_EFFECT, "<cmd effect>");
    r = consumeToken(b, "effect");
    p = r; // pin = 1
    r = r && cmdEffect_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('clear' [targetSelector [IDENTIFIER]]) |
  //                          ('give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER [boolValue]]])
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

  // 'give' targetSelector IDENTIFIER [(NUMBER|'infinite') [NUMBER [boolValue]]]
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

  // [(NUMBER|'infinite') [NUMBER [boolValue]]]
  private static boolean cmdEffect_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3")) return false;
    cmdEffect_1_1_3_0(b, l + 1);
    return true;
  }

  // (NUMBER|'infinite') [NUMBER [boolValue]]
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

  // [NUMBER [boolValue]]
  private static boolean cmdEffect_1_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1")) return false;
    cmdEffect_1_1_3_0_1_0(b, l + 1);
    return true;
  }

  // NUMBER [boolValue]
  private static boolean cmdEffect_1_1_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && cmdEffect_1_1_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [boolValue]
  private static boolean cmdEffect_1_1_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEffect_1_1_3_0_1_0_1")) return false;
    boolValue(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'enchant' targetSelector IDENTIFIER [NUMBER]
  public static boolean cmdEnchant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEnchant")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_ENCHANT, "<cmd enchant>");
    r = consumeToken(b, "enchant");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && cmdEnchant_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [NUMBER]
  private static boolean cmdEnchant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdEnchant_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'execute' (cmdExecute_Modifier|cmdExecute_Condition)* ['run' property]
  public static boolean cmdExecute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_EXECUTE, "<cmd execute>");
    r = consumeToken(b, "execute");
    r = r && cmdExecute_1(b, l + 1);
    r = r && cmdExecute_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (cmdExecute_Modifier|cmdExecute_Condition)*
  private static boolean cmdExecute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmdExecute_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmdExecute_1", c)) break;
    }
    return true;
  }

  // cmdExecute_Modifier|cmdExecute_Condition
  private static boolean cmdExecute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_1_0")) return false;
    boolean r;
    r = cmdExecute_Modifier(b, l + 1);
    if (!r) r = cmdExecute_Condition(b, l + 1);
    return r;
  }

  // ['run' property]
  private static boolean cmdExecute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_2")) return false;
    cmdExecute_2_0(b, l + 1);
    return true;
  }

  // 'run' property
  private static boolean cmdExecute_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "run");
    r = r && property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if'|'unless' (('biome' coordinateTriple IDENTIFIER) |
  //                                                    ('block' coordinateTriple IDENTIFIER) |
  //                                                    ('blocks' coordinateTriple coordinateTriple coordinateTriple ('all'|'masked')) |
  //                                                    ('data' (('block' coordinateTriple) |
  //                                                             ('entity' targetSelector) |
  //                                                             ('storage' IDENTIFIER)
  //                                                            ) IDENTIFIER) |
  //                                                    ('dimension' (defaultDimensionIdentifiers|IDENTIFIER)) |
  //                                                    ('entity' targetSelector) |
  //                                                    ('loaded' coordinateTriple) |
  //                                                    ('predicate' IDENTIFIER) |
  //                                                    ('score' targetSelector IDENTIFIER ((('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER) |
  //                                                                                        ('matches' (NUMBER|INT_RANGE)))) |
  //                                                    ('store' ('result'|'success') (('block' coordinateTriple IDENTIFIER dataType NUMBER) |
  //                                                                                   ('bossbar' IDENTIFIER ('value'|'max')) |
  //                                                                                   ('entity' targetSelector IDENTIFIER dataType NUMBER) |
  //                                                                                   ('score' targetSelector IDENTIFIER) |
  //                                                                                   ('storage' IDENTIFIER IDENTIFIER dataType NUMBER)))
  //                                                     )
  public static boolean cmdExecute_Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_EXECUTE_CONDITION, "<cmd execute condition>");
    r = consumeToken(b, "if");
    if (!r) r = cmdExecute_Condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'unless' (('biome' coordinateTriple IDENTIFIER) |
  //                                                    ('block' coordinateTriple IDENTIFIER) |
  //                                                    ('blocks' coordinateTriple coordinateTriple coordinateTriple ('all'|'masked')) |
  //                                                    ('data' (('block' coordinateTriple) |
  //                                                             ('entity' targetSelector) |
  //                                                             ('storage' IDENTIFIER)
  //                                                            ) IDENTIFIER) |
  //                                                    ('dimension' (defaultDimensionIdentifiers|IDENTIFIER)) |
  //                                                    ('entity' targetSelector) |
  //                                                    ('loaded' coordinateTriple) |
  //                                                    ('predicate' IDENTIFIER) |
  //                                                    ('score' targetSelector IDENTIFIER ((('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER) |
  //                                                                                        ('matches' (NUMBER|INT_RANGE)))) |
  //                                                    ('store' ('result'|'success') (('block' coordinateTriple IDENTIFIER dataType NUMBER) |
  //                                                                                   ('bossbar' IDENTIFIER ('value'|'max')) |
  //                                                                                   ('entity' targetSelector IDENTIFIER dataType NUMBER) |
  //                                                                                   ('score' targetSelector IDENTIFIER) |
  //                                                                                   ('storage' IDENTIFIER IDENTIFIER dataType NUMBER)))
  //                                                     )
  private static boolean cmdExecute_Condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "unless");
    r = r && cmdExecute_Condition_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('biome' coordinateTriple IDENTIFIER) |
  //                                                    ('block' coordinateTriple IDENTIFIER) |
  //                                                    ('blocks' coordinateTriple coordinateTriple coordinateTriple ('all'|'masked')) |
  //                                                    ('data' (('block' coordinateTriple) |
  //                                                             ('entity' targetSelector) |
  //                                                             ('storage' IDENTIFIER)
  //                                                            ) IDENTIFIER) |
  //                                                    ('dimension' (defaultDimensionIdentifiers|IDENTIFIER)) |
  //                                                    ('entity' targetSelector) |
  //                                                    ('loaded' coordinateTriple) |
  //                                                    ('predicate' IDENTIFIER) |
  //                                                    ('score' targetSelector IDENTIFIER ((('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER) |
  //                                                                                        ('matches' (NUMBER|INT_RANGE)))) |
  //                                                    ('store' ('result'|'success') (('block' coordinateTriple IDENTIFIER dataType NUMBER) |
  //                                                                                   ('bossbar' IDENTIFIER ('value'|'max')) |
  //                                                                                   ('entity' targetSelector IDENTIFIER dataType NUMBER) |
  //                                                                                   ('score' targetSelector IDENTIFIER) |
  //                                                                                   ('storage' IDENTIFIER IDENTIFIER dataType NUMBER)))
  private static boolean cmdExecute_Condition_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Condition_1_1_0(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_1(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_2(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_3(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_4(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_5(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_6(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_7(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_8(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'biome' coordinateTriple IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "biome");
    r = r && coordinateTriple(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'block' coordinateTriple IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'blocks' coordinateTriple coordinateTriple coordinateTriple ('all'|'masked')
  private static boolean cmdExecute_Condition_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "blocks");
    r = r && coordinateTriple(b, l + 1);
    r = r && coordinateTriple(b, l + 1);
    r = r && coordinateTriple(b, l + 1);
    r = r && cmdExecute_Condition_1_1_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all'|'masked'
  private static boolean cmdExecute_Condition_1_1_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_2_4")) return false;
    boolean r;
    r = consumeToken(b, "all");
    if (!r) r = consumeToken(b, "masked");
    return r;
  }

  // 'data' (('block' coordinateTriple) |
  //                                                             ('entity' targetSelector) |
  //                                                             ('storage' IDENTIFIER)
  //                                                            ) IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "data");
    r = r && cmdExecute_Condition_1_1_3_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('block' coordinateTriple) |
  //                                                             ('entity' targetSelector) |
  //                                                             ('storage' IDENTIFIER)
  private static boolean cmdExecute_Condition_1_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Condition_1_1_3_1_0(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_3_1_1(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_3_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'block' coordinateTriple
  private static boolean cmdExecute_Condition_1_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'entity' targetSelector
  private static boolean cmdExecute_Condition_1_1_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'storage' IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_3_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "storage");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dimension' (defaultDimensionIdentifiers|IDENTIFIER)
  private static boolean cmdExecute_Condition_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "dimension");
    r = r && cmdExecute_Condition_1_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // defaultDimensionIdentifiers|IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_4_1")) return false;
    boolean r;
    r = defaultDimensionIdentifiers(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // 'entity' targetSelector
  private static boolean cmdExecute_Condition_1_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'loaded' coordinateTriple
  private static boolean cmdExecute_Condition_1_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "loaded");
    r = r && coordinateTriple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'predicate' IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "predicate");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'score' targetSelector IDENTIFIER ((('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER) |
  //                                                                                        ('matches' (NUMBER|INT_RANGE)))
  private static boolean cmdExecute_Condition_1_1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "score");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdExecute_Condition_1_1_8_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER) |
  //                                                                                        ('matches' (NUMBER|INT_RANGE))
  private static boolean cmdExecute_Condition_1_1_8_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Condition_1_1_8_3_0(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_8_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('<'|'<='|'='|'>='|'>') targetSelector IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_8_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Condition_1_1_8_3_0_0(b, l + 1);
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<'|'<='|'='|'>='|'>'
  private static boolean cmdExecute_Condition_1_1_8_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, ">");
    return r;
  }

  // 'matches' (NUMBER|INT_RANGE)
  private static boolean cmdExecute_Condition_1_1_8_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "matches");
    r = r && cmdExecute_Condition_1_1_8_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER|INT_RANGE
  private static boolean cmdExecute_Condition_1_1_8_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_8_3_1_1")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, INT_RANGE);
    return r;
  }

  // 'store' ('result'|'success') (('block' coordinateTriple IDENTIFIER dataType NUMBER) |
  //                                                                                   ('bossbar' IDENTIFIER ('value'|'max')) |
  //                                                                                   ('entity' targetSelector IDENTIFIER dataType NUMBER) |
  //                                                                                   ('score' targetSelector IDENTIFIER) |
  //                                                                                   ('storage' IDENTIFIER IDENTIFIER dataType NUMBER))
  private static boolean cmdExecute_Condition_1_1_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "store");
    r = r && cmdExecute_Condition_1_1_9_1(b, l + 1);
    r = r && cmdExecute_Condition_1_1_9_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'result'|'success'
  private static boolean cmdExecute_Condition_1_1_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_1")) return false;
    boolean r;
    r = consumeToken(b, "result");
    if (!r) r = consumeToken(b, "success");
    return r;
  }

  // ('block' coordinateTriple IDENTIFIER dataType NUMBER) |
  //                                                                                   ('bossbar' IDENTIFIER ('value'|'max')) |
  //                                                                                   ('entity' targetSelector IDENTIFIER dataType NUMBER) |
  //                                                                                   ('score' targetSelector IDENTIFIER) |
  //                                                                                   ('storage' IDENTIFIER IDENTIFIER dataType NUMBER)
  private static boolean cmdExecute_Condition_1_1_9_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Condition_1_1_9_2_0(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_9_2_1(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_9_2_2(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_9_2_3(b, l + 1);
    if (!r) r = cmdExecute_Condition_1_1_9_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'block' coordinateTriple IDENTIFIER dataType NUMBER
  private static boolean cmdExecute_Condition_1_1_9_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'bossbar' IDENTIFIER ('value'|'max')
  private static boolean cmdExecute_Condition_1_1_9_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "bossbar");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdExecute_Condition_1_1_9_2_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'value'|'max'
  private static boolean cmdExecute_Condition_1_1_9_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_1_2")) return false;
    boolean r;
    r = consumeToken(b, "value");
    if (!r) r = consumeToken(b, "max");
    return r;
  }

  // 'entity' targetSelector IDENTIFIER dataType NUMBER
  private static boolean cmdExecute_Condition_1_1_9_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'score' targetSelector IDENTIFIER
  private static boolean cmdExecute_Condition_1_1_9_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "score");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'storage' IDENTIFIER IDENTIFIER dataType NUMBER
  private static boolean cmdExecute_Condition_1_1_9_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Condition_1_1_9_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "storage");
    r = r && consumeTokens(b, 0, IDENTIFIER, IDENTIFIER);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('align' SWIZZLE) |
  //                                  ('anchored' ('eyes'|'feet')) |
  //                                  ('as' targetSelector) |
  //                                  ('at' targetSelector) |
  //                                  ('facing' (coordinateTriple | ('entity' targetSelector ('eyes'|'feet')))) |
  //                                  ('in' (defaultDimensionIdentifiers|IDENTIFIER)) |
  //                                  ('on' ('attacker'|'controller'|'leasher'|'origin'|'owner'|'passengers'|'target'|'vehicle')) |
  //                                  ('positioned' (coordinateTriple | ('as' targetSelector) | ('over' ('world_surface'|'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor')))) |
  //                                  ('rotated' ((NUMBER NUMBER) | ('as' targetSelector))) |
  //                                  ('summon' IDENTIFIER)
  public static boolean cmdExecute_Modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_EXECUTE_MODIFIER, "<cmd execute modifier>");
    r = cmdExecute_Modifier_0(b, l + 1);
    if (!r) r = cmdExecute_Modifier_1(b, l + 1);
    if (!r) r = cmdExecute_Modifier_2(b, l + 1);
    if (!r) r = cmdExecute_Modifier_3(b, l + 1);
    if (!r) r = cmdExecute_Modifier_4(b, l + 1);
    if (!r) r = cmdExecute_Modifier_5(b, l + 1);
    if (!r) r = cmdExecute_Modifier_6(b, l + 1);
    if (!r) r = cmdExecute_Modifier_7(b, l + 1);
    if (!r) r = cmdExecute_Modifier_8(b, l + 1);
    if (!r) r = cmdExecute_Modifier_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'align' SWIZZLE
  private static boolean cmdExecute_Modifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "align");
    r = r && consumeToken(b, SWIZZLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'anchored' ('eyes'|'feet')
  private static boolean cmdExecute_Modifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "anchored");
    r = r && cmdExecute_Modifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'eyes'|'feet'
  private static boolean cmdExecute_Modifier_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_1_1")) return false;
    boolean r;
    r = consumeToken(b, "eyes");
    if (!r) r = consumeToken(b, "feet");
    return r;
  }

  // 'as' targetSelector
  private static boolean cmdExecute_Modifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'at' targetSelector
  private static boolean cmdExecute_Modifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "at");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'facing' (coordinateTriple | ('entity' targetSelector ('eyes'|'feet')))
  private static boolean cmdExecute_Modifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "facing");
    r = r && cmdExecute_Modifier_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // coordinateTriple | ('entity' targetSelector ('eyes'|'feet'))
  private static boolean cmdExecute_Modifier_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    if (!r) r = cmdExecute_Modifier_4_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'entity' targetSelector ('eyes'|'feet')
  private static boolean cmdExecute_Modifier_4_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_4_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    r = r && cmdExecute_Modifier_4_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'eyes'|'feet'
  private static boolean cmdExecute_Modifier_4_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_4_1_1_2")) return false;
    boolean r;
    r = consumeToken(b, "eyes");
    if (!r) r = consumeToken(b, "feet");
    return r;
  }

  // 'in' (defaultDimensionIdentifiers|IDENTIFIER)
  private static boolean cmdExecute_Modifier_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "in");
    r = r && cmdExecute_Modifier_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // defaultDimensionIdentifiers|IDENTIFIER
  private static boolean cmdExecute_Modifier_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_5_1")) return false;
    boolean r;
    r = defaultDimensionIdentifiers(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // 'on' ('attacker'|'controller'|'leasher'|'origin'|'owner'|'passengers'|'target'|'vehicle')
  private static boolean cmdExecute_Modifier_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "on");
    r = r && cmdExecute_Modifier_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'attacker'|'controller'|'leasher'|'origin'|'owner'|'passengers'|'target'|'vehicle'
  private static boolean cmdExecute_Modifier_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_6_1")) return false;
    boolean r;
    r = consumeToken(b, "attacker");
    if (!r) r = consumeToken(b, "controller");
    if (!r) r = consumeToken(b, "leasher");
    if (!r) r = consumeToken(b, "origin");
    if (!r) r = consumeToken(b, "owner");
    if (!r) r = consumeToken(b, "passengers");
    if (!r) r = consumeToken(b, "target");
    if (!r) r = consumeToken(b, "vehicle");
    return r;
  }

  // 'positioned' (coordinateTriple | ('as' targetSelector) | ('over' ('world_surface'|'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor')))
  private static boolean cmdExecute_Modifier_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "positioned");
    r = r && cmdExecute_Modifier_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // coordinateTriple | ('as' targetSelector) | ('over' ('world_surface'|'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor'))
  private static boolean cmdExecute_Modifier_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_7_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    if (!r) r = cmdExecute_Modifier_7_1_1(b, l + 1);
    if (!r) r = cmdExecute_Modifier_7_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'as' targetSelector
  private static boolean cmdExecute_Modifier_7_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_7_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'over' ('world_surface'|'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor')
  private static boolean cmdExecute_Modifier_7_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_7_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "over");
    r = r && cmdExecute_Modifier_7_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'world_surface'|'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor'
  private static boolean cmdExecute_Modifier_7_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_7_1_2_1")) return false;
    boolean r;
    r = consumeToken(b, "world_surface");
    if (!r) r = consumeToken(b, "motion_blocking");
    if (!r) r = consumeToken(b, "motion_blocking_no_leaves");
    if (!r) r = consumeToken(b, "ocean_floor");
    return r;
  }

  // 'rotated' ((NUMBER NUMBER) | ('as' targetSelector))
  private static boolean cmdExecute_Modifier_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "rotated");
    r = r && cmdExecute_Modifier_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NUMBER NUMBER) | ('as' targetSelector)
  private static boolean cmdExecute_Modifier_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdExecute_Modifier_8_1_0(b, l + 1);
    if (!r) r = cmdExecute_Modifier_8_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER NUMBER
  private static boolean cmdExecute_Modifier_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'as' targetSelector
  private static boolean cmdExecute_Modifier_8_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_8_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'summon' IDENTIFIER
  private static boolean cmdExecute_Modifier_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExecute_Modifier_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "summon");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('enchant'|'xp') (('query' targetSelector ('levels'|'points')) |
  //                                      (('add'|'set') targetSelector ['levels'|'points']))
  public static boolean cmdExperience(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdExperience")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_EXPERIENCE, "<cmd experience>");
    r = cmdExperience_0(b, l + 1);
    p = r; // pin = 1
    r = r && cmdExperience_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'fill' coordinateTriple coordinateTriple extendedIdentifier [ 'destroy'|'hollow'|'keep'|'outline' | ('replace' IDENTIFIER) ]
  public static boolean cmdFill(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFill")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_FILL, "<cmd fill>");
    r = consumeToken(b, "fill");
    p = r; // pin = 1
    r = r && report_error_(b, coordinateTriple(b, l + 1));
    r = p && report_error_(b, coordinateTriple(b, l + 1)) && r;
    r = p && report_error_(b, extendedIdentifier(b, l + 1)) && r;
    r = p && cmdFill_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'fillbiome' coordinateTriple coordinateTriple IDENTIFIER ['replace' IDENTIFIER]
  public static boolean cmdFillBiome(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFillBiome")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_FILL_BIOME, "<cmd fill biome>");
    r = consumeToken(b, "fillbiome");
    p = r; // pin = 1
    r = r && report_error_(b, coordinateTriple(b, l + 1));
    r = p && report_error_(b, coordinateTriple(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && cmdFillBiome_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'forceload' (('add' coordinateDouble coordinateDouble) |
  //                                ('remove' ('all'| (coordinateDouble [coordinateDouble]))) |
  //                                ('query' coordinateDouble))
  public static boolean cmdForceLoad(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_FORCE_LOAD, "<cmd force load>");
    r = consumeToken(b, "forceload");
    p = r; // pin = 1
    r = r && cmdForceLoad_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('add' coordinateDouble coordinateDouble) |
  //                                ('remove' ('all'| (coordinateDouble [coordinateDouble]))) |
  //                                ('query' coordinateDouble)
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

  // 'add' coordinateDouble coordinateDouble
  private static boolean cmdForceLoad_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && coordinateDouble(b, l + 1);
    r = r && coordinateDouble(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'remove' ('all'| (coordinateDouble [coordinateDouble]))
  private static boolean cmdForceLoad_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && cmdForceLoad_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all'| (coordinateDouble [coordinateDouble])
  private static boolean cmdForceLoad_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "all");
    if (!r) r = cmdForceLoad_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // coordinateDouble [coordinateDouble]
  private static boolean cmdForceLoad_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateDouble(b, l + 1);
    r = r && cmdForceLoad_1_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateDouble]
  private static boolean cmdForceLoad_1_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_1_1_1_1")) return false;
    coordinateDouble(b, l + 1);
    return true;
  }

  // 'query' coordinateDouble
  private static boolean cmdForceLoad_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdForceLoad_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "query");
    r = r && coordinateDouble(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'function' IDENTIFIER
  public static boolean cmdFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdFunction")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_FUNCTION, "<cmd function>");
    r = consumeToken(b, "function");
    p = r; // pin = 1
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'gamemode' ('survival'|'creative'|'adventure'|'spectator') [targetSelector]
  public static boolean cmdGameMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameMode")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_GAME_MODE, "<cmd game mode>");
    r = consumeToken(b, "gamemode");
    p = r; // pin = 1
    r = r && report_error_(b, cmdGameMode_1(b, l + 1));
    r = p && cmdGameMode_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'gamerule' IDENTIFIER [NUMBER|boolValue]
  public static boolean cmdGameRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_GAME_RULE, "<cmd game rule>");
    r = consumeToken(b, "gamerule");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && cmdGameRule_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [NUMBER|boolValue]
  private static boolean cmdGameRule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule_2")) return false;
    cmdGameRule_2_0(b, l + 1);
    return true;
  }

  // NUMBER|boolValue
  private static boolean cmdGameRule_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGameRule_2_0")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = boolValue(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'give' targetSelector extendedIdentifier [ NUMBER ]
  public static boolean cmdGive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_GIVE, "<cmd give>");
    r = consumeToken(b, "give");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && report_error_(b, extendedIdentifier(b, l + 1)) && r;
    r = p && cmdGive_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ NUMBER ]
  private static boolean cmdGive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdGive_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // ('help')
  public static boolean cmdHelp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdHelp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_HELP, "<cmd help>");
    r = consumeToken(b, "help");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'item' (('modify' cmdItem_Target IDENTIFIER IDENTIFIER) |
  //                      ('replace' cmdItem_Target IDENTIFIER (('with' extendedIdentifier NUMBER) |
  //                                                            ('from' cmdItem_Target IDENTIFIER IDENTIFIER))))
  public static boolean cmdItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_ITEM, "<cmd item>");
    r = consumeToken(b, "item");
    p = r; // pin = 1
    r = r && cmdItem_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('modify' cmdItem_Target IDENTIFIER IDENTIFIER) |
  //                      ('replace' cmdItem_Target IDENTIFIER (('with' extendedIdentifier NUMBER) |
  //                                                            ('from' cmdItem_Target IDENTIFIER IDENTIFIER)))
  private static boolean cmdItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdItem_1_0(b, l + 1);
    if (!r) r = cmdItem_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'modify' cmdItem_Target IDENTIFIER IDENTIFIER
  private static boolean cmdItem_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modify");
    r = r && cmdItem_Target(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace' cmdItem_Target IDENTIFIER (('with' extendedIdentifier NUMBER) |
  //                                                            ('from' cmdItem_Target IDENTIFIER IDENTIFIER))
  private static boolean cmdItem_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "replace");
    r = r && cmdItem_Target(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdItem_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('with' extendedIdentifier NUMBER) |
  //                                                            ('from' cmdItem_Target IDENTIFIER IDENTIFIER)
  private static boolean cmdItem_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdItem_1_1_3_0(b, l + 1);
    if (!r) r = cmdItem_1_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'with' extendedIdentifier NUMBER
  private static boolean cmdItem_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "with");
    r = r && extendedIdentifier(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'from' cmdItem_Target IDENTIFIER IDENTIFIER
  private static boolean cmdItem_1_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_1_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "from");
    r = r && cmdItem_Target(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('block' coordinateTriple) | ('entity' targetSelector)
  public static boolean cmdItem_Target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_Target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_ITEM_TARGET, "<cmd item target>");
    r = cmdItem_Target_0(b, l + 1);
    if (!r) r = cmdItem_Target_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'block' coordinateTriple
  private static boolean cmdItem_Target_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_Target_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'entity' targetSelector
  private static boolean cmdItem_Target_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdItem_Target_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'jfr' ('start'|'stop')
  public static boolean cmdJfr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdJfr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_JFR, "<cmd jfr>");
    r = consumeToken(b, "jfr");
    p = r; // pin = 1
    r = r && cmdJfr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'start'|'stop'
  private static boolean cmdJfr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdJfr_1")) return false;
    boolean r;
    r = consumeToken(b, "start");
    if (!r) r = consumeToken(b, "stop");
    return r;
  }

  /* ********************************************************** */
  // 'kick' targetSelector [freeMessageValues]
  public static boolean cmdKick(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdKick")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_KICK, "<cmd kick>");
    r = consumeToken(b, "kick");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && cmdKick_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [freeMessageValues]
  private static boolean cmdKick_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdKick_2")) return false;
    freeMessageValues(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'kill' targetSelector
  public static boolean cmdKill(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdKill")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_KILL, "<cmd kill>");
    r = consumeToken(b, "kill");
    p = r; // pin = 1
    r = r && targetSelector(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'list' ['uuids']
  public static boolean cmdList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_LIST, "<cmd list>");
    r = consumeToken(b, "list");
    p = r; // pin = 1
    r = r && cmdList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['uuids']
  private static boolean cmdList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdList_1")) return false;
    consumeToken(b, "uuids");
    return true;
  }

  /* ********************************************************** */
  // 'locate' ('structure'|'biome'|'poi') IDENTIFIER
  public static boolean cmdLocate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLocate")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_LOCATE, "<cmd locate>");
    r = consumeToken(b, "locate");
    p = r; // pin = 1
    r = r && report_error_(b, cmdLocate_1(b, l + 1));
    r = p && consumeToken(b, IDENTIFIER) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'structure'|'biome'|'poi'
  private static boolean cmdLocate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLocate_1")) return false;
    boolean r;
    r = consumeToken(b, "structure");
    if (!r) r = consumeToken(b, "biome");
    if (!r) r = consumeToken(b, "poi");
    return r;
  }

  /* ********************************************************** */
  // 'loot' cmdLoot_Target cmdLoot_Source
  public static boolean cmdLoot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_LOOT, "<cmd loot>");
    r = consumeToken(b, "loot");
    p = r; // pin = 1
    r = r && report_error_(b, cmdLoot_Target(b, l + 1));
    r = p && cmdLoot_Source(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('fish' IDENTIFIER coordinateTriple [extendedIdentifier|'mainhand'|'offhand']) |
  //                             ('loot' IDENTIFIER) |
  //                             ('kill' targetSelector) |
  //                             ('mine' coordinateTriple [extendedIdentifier|'mainhand'|'offhand'])
  public static boolean cmdLoot_Source(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_LOOT_SOURCE, "<cmd loot source>");
    r = cmdLoot_Source_0(b, l + 1);
    if (!r) r = cmdLoot_Source_1(b, l + 1);
    if (!r) r = cmdLoot_Source_2(b, l + 1);
    if (!r) r = cmdLoot_Source_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'fish' IDENTIFIER coordinateTriple [extendedIdentifier|'mainhand'|'offhand']
  private static boolean cmdLoot_Source_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "fish");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && coordinateTriple(b, l + 1);
    r = r && cmdLoot_Source_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [extendedIdentifier|'mainhand'|'offhand']
  private static boolean cmdLoot_Source_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_0_3")) return false;
    cmdLoot_Source_0_3_0(b, l + 1);
    return true;
  }

  // extendedIdentifier|'mainhand'|'offhand'
  private static boolean cmdLoot_Source_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_0_3_0")) return false;
    boolean r;
    r = extendedIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, "mainhand");
    if (!r) r = consumeToken(b, "offhand");
    return r;
  }

  // 'loot' IDENTIFIER
  private static boolean cmdLoot_Source_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "loot");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'kill' targetSelector
  private static boolean cmdLoot_Source_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "kill");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'mine' coordinateTriple [extendedIdentifier|'mainhand'|'offhand']
  private static boolean cmdLoot_Source_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "mine");
    r = r && coordinateTriple(b, l + 1);
    r = r && cmdLoot_Source_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [extendedIdentifier|'mainhand'|'offhand']
  private static boolean cmdLoot_Source_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_3_2")) return false;
    cmdLoot_Source_3_2_0(b, l + 1);
    return true;
  }

  // extendedIdentifier|'mainhand'|'offhand'
  private static boolean cmdLoot_Source_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Source_3_2_0")) return false;
    boolean r;
    r = extendedIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, "mainhand");
    if (!r) r = consumeToken(b, "offhand");
    return r;
  }

  /* ********************************************************** */
  // ('give' targetSelector) |
  //                             ('insert' coordinateTriple) |
  //                             ('spawn' coordinateTriple) |
  //                             ('replace' (('block' coordinateTriple IDENTIFIER [NUMBER]) |
  //                                         ('entity' targetSelector IDENTIFIER [NUMBER])))
  public static boolean cmdLoot_Target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_LOOT_TARGET, "<cmd loot target>");
    r = cmdLoot_Target_0(b, l + 1);
    if (!r) r = cmdLoot_Target_1(b, l + 1);
    if (!r) r = cmdLoot_Target_2(b, l + 1);
    if (!r) r = cmdLoot_Target_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'give' targetSelector
  private static boolean cmdLoot_Target_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "give");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'insert' coordinateTriple
  private static boolean cmdLoot_Target_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "insert");
    r = r && coordinateTriple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'spawn' coordinateTriple
  private static boolean cmdLoot_Target_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "spawn");
    r = r && coordinateTriple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'replace' (('block' coordinateTriple IDENTIFIER [NUMBER]) |
  //                                         ('entity' targetSelector IDENTIFIER [NUMBER]))
  private static boolean cmdLoot_Target_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "replace");
    r = r && cmdLoot_Target_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('block' coordinateTriple IDENTIFIER [NUMBER]) |
  //                                         ('entity' targetSelector IDENTIFIER [NUMBER])
  private static boolean cmdLoot_Target_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdLoot_Target_3_1_0(b, l + 1);
    if (!r) r = cmdLoot_Target_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'block' coordinateTriple IDENTIFIER [NUMBER]
  private static boolean cmdLoot_Target_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "block");
    r = r && coordinateTriple(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdLoot_Target_3_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdLoot_Target_3_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3_1_0_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'entity' targetSelector IDENTIFIER [NUMBER]
  private static boolean cmdLoot_Target_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdLoot_Target_3_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdLoot_Target_3_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdLoot_Target_3_1_1_3")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'me' freeMessageValues
  public static boolean cmdMe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdMe")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_ME, "<cmd me>");
    r = consumeToken(b, "me");
    p = r; // pin = 1
    r = r && freeMessageValues(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('msg'|'w'|'tell') targetSelector freeMessageValues
  public static boolean cmdMsg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdMsg")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_MSG, "<cmd msg>");
    r = cmdMsg_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && freeMessageValues(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'msg'|'w'|'tell'
  private static boolean cmdMsg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdMsg_0")) return false;
    boolean r;
    r = consumeToken(b, "msg");
    if (!r) r = consumeToken(b, "w");
    if (!r) r = consumeToken(b, "tell");
    return r;
  }

  /* ********************************************************** */
  // 'op' targetSelector
  public static boolean cmdOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdOp")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_OP, "<cmd op>");
    r = consumeToken(b, "op");
    p = r; // pin = 1
    r = r && targetSelector(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'pardon' targetSelector
  public static boolean cmdPardon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPardon")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PARDON, "<cmd pardon>");
    r = consumeToken(b, "pardon");
    p = r; // pin = 1
    r = r && targetSelector(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'pardon-ip' IDENTIFIER
  public static boolean cmdPardonIp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPardonIp")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PARDON_IP, "<cmd pardon ip>");
    r = consumeToken(b, "pardon-ip");
    p = r; // pin = 1
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'particle' IDENTIFIER [coordinateTriple [coordinateTriple NUMBER NUMBER [('force'|'normal') [targetSelector]]]]
  public static boolean cmdParticle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PARTICLE, "<cmd particle>");
    r = consumeToken(b, "particle");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && cmdParticle_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [coordinateTriple [coordinateTriple NUMBER NUMBER [('force'|'normal') [targetSelector]]]]
  private static boolean cmdParticle_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2")) return false;
    cmdParticle_2_0(b, l + 1);
    return true;
  }

  // coordinateTriple [coordinateTriple NUMBER NUMBER [('force'|'normal') [targetSelector]]]
  private static boolean cmdParticle_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdParticle_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple NUMBER NUMBER [('force'|'normal') [targetSelector]]]
  private static boolean cmdParticle_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1")) return false;
    cmdParticle_2_0_1_0(b, l + 1);
    return true;
  }

  // coordinateTriple NUMBER NUMBER [('force'|'normal') [targetSelector]]
  private static boolean cmdParticle_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && consumeTokens(b, 0, NUMBER, NUMBER);
    r = r && cmdParticle_2_0_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('force'|'normal') [targetSelector]]
  private static boolean cmdParticle_2_0_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1_0_3")) return false;
    cmdParticle_2_0_1_0_3_0(b, l + 1);
    return true;
  }

  // ('force'|'normal') [targetSelector]
  private static boolean cmdParticle_2_0_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdParticle_2_0_1_0_3_0_0(b, l + 1);
    r = r && cmdParticle_2_0_1_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'force'|'normal'
  private static boolean cmdParticle_2_0_1_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1_0_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, "force");
    if (!r) r = consumeToken(b, "normal");
    return r;
  }

  // [targetSelector]
  private static boolean cmdParticle_2_0_1_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdParticle_2_0_1_0_3_0_1")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'place' (('feature' IDENTIFIER [coordinateTriple]) |
  //                        ('jigsaw' IDENTIFIER IDENTIFIER NUMBER [coordinateTriple]) |
  //                        ('structure' IDENTIFIER [coordinateTriple]) |
  //                        ('template' IDENTIFIER [coordinateTriple [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]]))
  public static boolean cmdPlace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PLACE, "<cmd place>");
    r = consumeToken(b, "place");
    p = r; // pin = 1
    r = r && cmdPlace_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('feature' IDENTIFIER [coordinateTriple]) |
  //                        ('jigsaw' IDENTIFIER IDENTIFIER NUMBER [coordinateTriple]) |
  //                        ('structure' IDENTIFIER [coordinateTriple]) |
  //                        ('template' IDENTIFIER [coordinateTriple [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]])
  private static boolean cmdPlace_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdPlace_1_0(b, l + 1);
    if (!r) r = cmdPlace_1_1(b, l + 1);
    if (!r) r = cmdPlace_1_2(b, l + 1);
    if (!r) r = cmdPlace_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'feature' IDENTIFIER [coordinateTriple]
  private static boolean cmdPlace_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "feature");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdPlace_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple]
  private static boolean cmdPlace_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_0_2")) return false;
    coordinateTriple(b, l + 1);
    return true;
  }

  // 'jigsaw' IDENTIFIER IDENTIFIER NUMBER [coordinateTriple]
  private static boolean cmdPlace_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "jigsaw");
    r = r && consumeTokens(b, 0, IDENTIFIER, IDENTIFIER, NUMBER);
    r = r && cmdPlace_1_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple]
  private static boolean cmdPlace_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_1_4")) return false;
    coordinateTriple(b, l + 1);
    return true;
  }

  // 'structure' IDENTIFIER [coordinateTriple]
  private static boolean cmdPlace_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "structure");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdPlace_1_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple]
  private static boolean cmdPlace_1_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_2_2")) return false;
    coordinateTriple(b, l + 1);
    return true;
  }

  // 'template' IDENTIFIER [coordinateTriple [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]]
  private static boolean cmdPlace_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "template");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdPlace_1_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]]
  private static boolean cmdPlace_1_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2")) return false;
    cmdPlace_1_3_2_0(b, l + 1);
    return true;
  }

  // coordinateTriple [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]
  private static boolean cmdPlace_1_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdPlace_1_3_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]]
  private static boolean cmdPlace_1_3_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1")) return false;
    cmdPlace_1_3_2_0_1_0(b, l + 1);
    return true;
  }

  // ('none'|'clockwise_90'|'counterclockwise_90'|'180') [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]
  private static boolean cmdPlace_1_3_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdPlace_1_3_2_0_1_0_0(b, l + 1);
    r = r && cmdPlace_1_3_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'none'|'clockwise_90'|'counterclockwise_90'|'180'
  private static boolean cmdPlace_1_3_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "none");
    if (!r) r = consumeToken(b, "clockwise_90");
    if (!r) r = consumeToken(b, "counterclockwise_90");
    if (!r) r = consumeToken(b, "180");
    return r;
  }

  // [('none'|'front_back'|'left_right') [NUMBER [NUMBER]]]
  private static boolean cmdPlace_1_3_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1")) return false;
    cmdPlace_1_3_2_0_1_0_1_0(b, l + 1);
    return true;
  }

  // ('none'|'front_back'|'left_right') [NUMBER [NUMBER]]
  private static boolean cmdPlace_1_3_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdPlace_1_3_2_0_1_0_1_0_0(b, l + 1);
    r = r && cmdPlace_1_3_2_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'none'|'front_back'|'left_right'
  private static boolean cmdPlace_1_3_2_0_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "none");
    if (!r) r = consumeToken(b, "front_back");
    if (!r) r = consumeToken(b, "left_right");
    return r;
  }

  // [NUMBER [NUMBER]]
  private static boolean cmdPlace_1_3_2_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1_0_1")) return false;
    cmdPlace_1_3_2_0_1_0_1_0_1_0(b, l + 1);
    return true;
  }

  // NUMBER [NUMBER]
  private static boolean cmdPlace_1_3_2_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && cmdPlace_1_3_2_0_1_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdPlace_1_3_2_0_1_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlace_1_3_2_0_1_0_1_0_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'playsound' IDENTIFIER cmdPlaySound_Source targetSelector [coordinateTriple [NUMBER [NUMBER [NUMBER]]]]
  public static boolean cmdPlaySound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PLAY_SOUND, "<cmd play sound>");
    r = consumeToken(b, "playsound");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, cmdPlaySound_Source(b, l + 1)) && r;
    r = p && report_error_(b, targetSelector(b, l + 1)) && r;
    r = p && cmdPlaySound_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [coordinateTriple [NUMBER [NUMBER [NUMBER]]]]
  private static boolean cmdPlaySound_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4")) return false;
    cmdPlaySound_4_0(b, l + 1);
    return true;
  }

  // coordinateTriple [NUMBER [NUMBER [NUMBER]]]
  private static boolean cmdPlaySound_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdPlaySound_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER [NUMBER [NUMBER]]]
  private static boolean cmdPlaySound_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0_1")) return false;
    cmdPlaySound_4_0_1_0(b, l + 1);
    return true;
  }

  // NUMBER [NUMBER [NUMBER]]
  private static boolean cmdPlaySound_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && cmdPlaySound_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER [NUMBER]]
  private static boolean cmdPlaySound_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0_1_0_1")) return false;
    cmdPlaySound_4_0_1_0_1_0(b, l + 1);
    return true;
  }

  // NUMBER [NUMBER]
  private static boolean cmdPlaySound_4_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && cmdPlaySound_4_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdPlaySound_4_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_4_0_1_0_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'master'|'music'|'record'|'weather'|'block'|'hostile'|'neutral'|'player'|'ambient'|'voice'
  public static boolean cmdPlaySound_Source(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPlaySound_Source")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_PLAY_SOUND_SOURCE, "<cmd play sound source>");
    r = consumeToken(b, "master");
    if (!r) r = consumeToken(b, "music");
    if (!r) r = consumeToken(b, "record");
    if (!r) r = consumeToken(b, "weather");
    if (!r) r = consumeToken(b, "block");
    if (!r) r = consumeToken(b, "hostile");
    if (!r) r = consumeToken(b, "neutral");
    if (!r) r = consumeToken(b, "player");
    if (!r) r = consumeToken(b, "ambient");
    if (!r) r = consumeToken(b, "voice");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'publish' [boolValue [('survival'|'creative'|'adventure'|'spectator') [NUMBER]]]
  public static boolean cmdPublish(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_PUBLISH, "<cmd publish>");
    r = consumeToken(b, "publish");
    p = r; // pin = 1
    r = r && cmdPublish_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [boolValue [('survival'|'creative'|'adventure'|'spectator') [NUMBER]]]
  private static boolean cmdPublish_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1")) return false;
    cmdPublish_1_0(b, l + 1);
    return true;
  }

  // boolValue [('survival'|'creative'|'adventure'|'spectator') [NUMBER]]
  private static boolean cmdPublish_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolValue(b, l + 1);
    r = r && cmdPublish_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('survival'|'creative'|'adventure'|'spectator') [NUMBER]]
  private static boolean cmdPublish_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1_0_1")) return false;
    cmdPublish_1_0_1_0(b, l + 1);
    return true;
  }

  // ('survival'|'creative'|'adventure'|'spectator') [NUMBER]
  private static boolean cmdPublish_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdPublish_1_0_1_0_0(b, l + 1);
    r = r && cmdPublish_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'survival'|'creative'|'adventure'|'spectator'
  private static boolean cmdPublish_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "survival");
    if (!r) r = consumeToken(b, "creative");
    if (!r) r = consumeToken(b, "adventure");
    if (!r) r = consumeToken(b, "spectator");
    return r;
  }

  // [NUMBER]
  private static boolean cmdPublish_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdPublish_1_0_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'recipe' ('give'|'take' targetSelector ('*'|IDENTIFIER))
  public static boolean cmdRecipe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdRecipe")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_RECIPE, "<cmd recipe>");
    r = consumeToken(b, "recipe");
    p = r; // pin = 1
    r = r && cmdRecipe_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'give'|'take' targetSelector ('*'|IDENTIFIER)
  private static boolean cmdRecipe_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdRecipe_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "give");
    if (!r) r = cmdRecipe_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'take' targetSelector ('*'|IDENTIFIER)
  private static boolean cmdRecipe_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdRecipe_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "take");
    r = r && targetSelector(b, l + 1);
    r = r && cmdRecipe_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|IDENTIFIER
  private static boolean cmdRecipe_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdRecipe_1_1_2")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // ('reload')
  public static boolean cmdReload(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdReload")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_RELOAD, "<cmd reload>");
    r = consumeToken(b, "reload");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'save-all' ['flush']
  public static boolean cmdSaveAll(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSaveAll")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SAVE_ALL, "<cmd save all>");
    r = consumeToken(b, "save-all");
    p = r; // pin = 1
    r = r && cmdSaveAll_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['flush']
  private static boolean cmdSaveAll_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSaveAll_1")) return false;
    consumeToken(b, "flush");
    return true;
  }

  /* ********************************************************** */
  // ('save-off')
  public static boolean cmdSaveOff(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSaveOff")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SAVE_OFF, "<cmd save off>");
    r = consumeToken(b, "save-off");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('save-on')
  public static boolean cmdSaveOn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSaveOn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SAVE_ON, "<cmd save on>");
    r = consumeToken(b, "save-on");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'say' freeMessageValues
  public static boolean cmdSay(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSay")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SAY, "<cmd say>");
    r = consumeToken(b, "say");
    p = r; // pin = 1
    r = r && freeMessageValues(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'schedule' (('clear' IDENTIFIER) |
  //                              ('function' IDENTIFIER timeValue ['append'|'replace']))
  public static boolean cmdSchedule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SCHEDULE, "<cmd schedule>");
    r = consumeToken(b, "schedule");
    p = r; // pin = 1
    r = r && cmdSchedule_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('clear' IDENTIFIER) |
  //                              ('function' IDENTIFIER timeValue ['append'|'replace'])
  private static boolean cmdSchedule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdSchedule_1_0(b, l + 1);
    if (!r) r = cmdSchedule_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'clear' IDENTIFIER
  private static boolean cmdSchedule_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "clear");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'function' IDENTIFIER timeValue ['append'|'replace']
  private static boolean cmdSchedule_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "function");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && timeValue(b, l + 1);
    r = r && cmdSchedule_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['append'|'replace']
  private static boolean cmdSchedule_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule_1_1_3")) return false;
    cmdSchedule_1_1_3_0(b, l + 1);
    return true;
  }

  // 'append'|'replace'
  private static boolean cmdSchedule_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSchedule_1_1_3_0")) return false;
    boolean r;
    r = consumeToken(b, "append");
    if (!r) r = consumeToken(b, "replace");
    return r;
  }

  /* ********************************************************** */
  // 'scoreboard' (cmdScoreboard_Objectives|cmdScoreboard_Players)
  public static boolean cmdScoreboard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SCOREBOARD, "<cmd scoreboard>");
    r = consumeToken(b, "scoreboard");
    p = r; // pin = 1
    r = r && cmdScoreboard_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // cmdScoreboard_Objectives|cmdScoreboard_Players
  private static boolean cmdScoreboard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_1")) return false;
    boolean r;
    r = cmdScoreboard_Objectives(b, l + 1);
    if (!r) r = cmdScoreboard_Players(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'objectives' ('list' |
  //                                                     ('add' IDENTIFIER ('dummy'|IDENTIFIER) [componentValue]) |
  //                                                     ('remove' ('*'|IDENTIFIER)) |
  //                                                     ('setdisplay' ((('list'|'sidebar') IDENTIFIER ['ascending'|'descending']) |
  //                                                                    (('belowName'|IDENTIFIER) IDENTIFIER)))) |
  //                                                     ('modify' IDENTIFIER (('displayname' componentValue) |
  //                                                                           ('rendertype' ('hearts'|'integer'))))
  public static boolean cmdScoreboard_Objectives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SCOREBOARD_OBJECTIVES, "<cmd scoreboard objectives>");
    r = cmdScoreboard_Objectives_0(b, l + 1);
    if (!r) r = cmdScoreboard_Objectives_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'objectives' ('list' |
  //                                                     ('add' IDENTIFIER ('dummy'|IDENTIFIER) [componentValue]) |
  //                                                     ('remove' ('*'|IDENTIFIER)) |
  //                                                     ('setdisplay' ((('list'|'sidebar') IDENTIFIER ['ascending'|'descending']) |
  //                                                                    (('belowName'|IDENTIFIER) IDENTIFIER))))
  private static boolean cmdScoreboard_Objectives_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "objectives");
    r = r && cmdScoreboard_Objectives_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'list' |
  //                                                     ('add' IDENTIFIER ('dummy'|IDENTIFIER) [componentValue]) |
  //                                                     ('remove' ('*'|IDENTIFIER)) |
  //                                                     ('setdisplay' ((('list'|'sidebar') IDENTIFIER ['ascending'|'descending']) |
  //                                                                    (('belowName'|IDENTIFIER) IDENTIFIER)))
  private static boolean cmdScoreboard_Objectives_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    if (!r) r = cmdScoreboard_Objectives_0_1_1(b, l + 1);
    if (!r) r = cmdScoreboard_Objectives_0_1_2(b, l + 1);
    if (!r) r = cmdScoreboard_Objectives_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' IDENTIFIER ('dummy'|IDENTIFIER) [componentValue]
  private static boolean cmdScoreboard_Objectives_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdScoreboard_Objectives_0_1_1_2(b, l + 1);
    r = r && cmdScoreboard_Objectives_0_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dummy'|IDENTIFIER
  private static boolean cmdScoreboard_Objectives_0_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_1_2")) return false;
    boolean r;
    r = consumeToken(b, "dummy");
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // [componentValue]
  private static boolean cmdScoreboard_Objectives_0_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_1_3")) return false;
    componentValue(b, l + 1);
    return true;
  }

  // 'remove' ('*'|IDENTIFIER)
  private static boolean cmdScoreboard_Objectives_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && cmdScoreboard_Objectives_0_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|IDENTIFIER
  private static boolean cmdScoreboard_Objectives_0_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_2_1")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // 'setdisplay' ((('list'|'sidebar') IDENTIFIER ['ascending'|'descending']) |
  //                                                                    (('belowName'|IDENTIFIER) IDENTIFIER))
  private static boolean cmdScoreboard_Objectives_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "setdisplay");
    r = r && cmdScoreboard_Objectives_0_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('list'|'sidebar') IDENTIFIER ['ascending'|'descending']) |
  //                                                                    (('belowName'|IDENTIFIER) IDENTIFIER)
  private static boolean cmdScoreboard_Objectives_0_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdScoreboard_Objectives_0_1_3_1_0(b, l + 1);
    if (!r) r = cmdScoreboard_Objectives_0_1_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('list'|'sidebar') IDENTIFIER ['ascending'|'descending']
  private static boolean cmdScoreboard_Objectives_0_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdScoreboard_Objectives_0_1_3_1_0_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdScoreboard_Objectives_0_1_3_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'list'|'sidebar'
  private static boolean cmdScoreboard_Objectives_0_1_3_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "list");
    if (!r) r = consumeToken(b, "sidebar");
    return r;
  }

  // ['ascending'|'descending']
  private static boolean cmdScoreboard_Objectives_0_1_3_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_0_2")) return false;
    cmdScoreboard_Objectives_0_1_3_1_0_2_0(b, l + 1);
    return true;
  }

  // 'ascending'|'descending'
  private static boolean cmdScoreboard_Objectives_0_1_3_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_0_2_0")) return false;
    boolean r;
    r = consumeToken(b, "ascending");
    if (!r) r = consumeToken(b, "descending");
    return r;
  }

  // ('belowName'|IDENTIFIER) IDENTIFIER
  private static boolean cmdScoreboard_Objectives_0_1_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdScoreboard_Objectives_0_1_3_1_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'belowName'|IDENTIFIER
  private static boolean cmdScoreboard_Objectives_0_1_3_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_0_1_3_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, "belowName");
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // 'modify' IDENTIFIER (('displayname' componentValue) |
  //                                                                           ('rendertype' ('hearts'|'integer')))
  private static boolean cmdScoreboard_Objectives_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modify");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdScoreboard_Objectives_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('displayname' componentValue) |
  //                                                                           ('rendertype' ('hearts'|'integer'))
  private static boolean cmdScoreboard_Objectives_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdScoreboard_Objectives_1_2_0(b, l + 1);
    if (!r) r = cmdScoreboard_Objectives_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'displayname' componentValue
  private static boolean cmdScoreboard_Objectives_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "displayname");
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'rendertype' ('hearts'|'integer')
  private static boolean cmdScoreboard_Objectives_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_1_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "rendertype");
    r = r && cmdScoreboard_Objectives_1_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'hearts'|'integer'
  private static boolean cmdScoreboard_Objectives_1_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Objectives_1_2_1_1")) return false;
    boolean r;
    r = consumeToken(b, "hearts");
    if (!r) r = consumeToken(b, "integer");
    return r;
  }

  /* ********************************************************** */
  // 'players' (('list' [targetSelector]) |
  //                                               ('get' targetSelector IDENTIFIER) |
  //                                               ('set' targetSelector IDENTIFIER NUMBER) |
  //                                               ('add' targetSelector IDENTIFIER NUMBER) |
  //                                               ('remove' targetSelector IDENTIFIER NUMBER) |
  //                                               ('reset' targetSelector [IDENTIFIER]) |
  //                                               ('enable' targetSelector IDENTIFIER) |
  //                                               ('operation' targetSelector IDENTIFIER OPERATOR targetSelector IDENTIFIER))
  public static boolean cmdScoreboard_Players(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SCOREBOARD_PLAYERS, "<cmd scoreboard players>");
    r = consumeToken(b, "players");
    r = r && cmdScoreboard_Players_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('list' [targetSelector]) |
  //                                               ('get' targetSelector IDENTIFIER) |
  //                                               ('set' targetSelector IDENTIFIER NUMBER) |
  //                                               ('add' targetSelector IDENTIFIER NUMBER) |
  //                                               ('remove' targetSelector IDENTIFIER NUMBER) |
  //                                               ('reset' targetSelector [IDENTIFIER]) |
  //                                               ('enable' targetSelector IDENTIFIER) |
  //                                               ('operation' targetSelector IDENTIFIER OPERATOR targetSelector IDENTIFIER)
  private static boolean cmdScoreboard_Players_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdScoreboard_Players_1_0(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_1(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_2(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_3(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_4(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_5(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_6(b, l + 1);
    if (!r) r = cmdScoreboard_Players_1_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'list' [targetSelector]
  private static boolean cmdScoreboard_Players_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    r = r && cmdScoreboard_Players_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector]
  private static boolean cmdScoreboard_Players_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_0_1")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  // 'get' targetSelector IDENTIFIER
  private static boolean cmdScoreboard_Players_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'set' targetSelector IDENTIFIER NUMBER
  private static boolean cmdScoreboard_Players_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && targetSelector(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' targetSelector IDENTIFIER NUMBER
  private static boolean cmdScoreboard_Players_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && targetSelector(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'remove' targetSelector IDENTIFIER NUMBER
  private static boolean cmdScoreboard_Players_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "remove");
    r = r && targetSelector(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'reset' targetSelector [IDENTIFIER]
  private static boolean cmdScoreboard_Players_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "reset");
    r = r && targetSelector(b, l + 1);
    r = r && cmdScoreboard_Players_1_5_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER]
  private static boolean cmdScoreboard_Players_1_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_5_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // 'enable' targetSelector IDENTIFIER
  private static boolean cmdScoreboard_Players_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enable");
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'operation' targetSelector IDENTIFIER OPERATOR targetSelector IDENTIFIER
  private static boolean cmdScoreboard_Players_1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdScoreboard_Players_1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "operation");
    r = r && targetSelector(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, OPERATOR);
    r = r && targetSelector(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('seed')
  public static boolean cmdSeed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSeed")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_SEED, "<cmd seed>");
    r = consumeToken(b, "seed");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'setblock' coordinateTriple IDENTIFIER ['destroy'|'keep'|'replace']
  public static boolean cmdSetBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SET_BLOCK, "<cmd set block>");
    r = consumeToken(b, "setblock");
    p = r; // pin = 1
    r = r && report_error_(b, coordinateTriple(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && cmdSetBlock_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['destroy'|'keep'|'replace']
  private static boolean cmdSetBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock_3")) return false;
    cmdSetBlock_3_0(b, l + 1);
    return true;
  }

  // 'destroy'|'keep'|'replace'
  private static boolean cmdSetBlock_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetBlock_3_0")) return false;
    boolean r;
    r = consumeToken(b, "destroy");
    if (!r) r = consumeToken(b, "keep");
    if (!r) r = consumeToken(b, "replace");
    return r;
  }

  /* ********************************************************** */
  // 'setidletimeout' NUMBER
  public static boolean cmdSetIdleTimeout(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetIdleTimeout")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SET_IDLE_TIMEOUT, "<cmd set idle timeout>");
    r = consumeToken(b, "setidletimeout");
    p = r; // pin = 1
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'setworldspawn' [coordinateTriple [NUMBER]]
  public static boolean cmdSetWorldSpawn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetWorldSpawn")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SET_WORLD_SPAWN, "<cmd set world spawn>");
    r = consumeToken(b, "setworldspawn");
    p = r; // pin = 1
    r = r && cmdSetWorldSpawn_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [coordinateTriple [NUMBER]]
  private static boolean cmdSetWorldSpawn_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetWorldSpawn_1")) return false;
    cmdSetWorldSpawn_1_0(b, l + 1);
    return true;
  }

  // coordinateTriple [NUMBER]
  private static boolean cmdSetWorldSpawn_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetWorldSpawn_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdSetWorldSpawn_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdSetWorldSpawn_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSetWorldSpawn_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'spawnpoint' [targetSelector [coordinateTriple [NUMBER]]]
  public static boolean cmdSpawnPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SPAWN_POINT, "<cmd spawn point>");
    r = consumeToken(b, "spawnpoint");
    p = r; // pin = 1
    r = r && cmdSpawnPoint_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [targetSelector [coordinateTriple [NUMBER]]]
  private static boolean cmdSpawnPoint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint_1")) return false;
    cmdSpawnPoint_1_0(b, l + 1);
    return true;
  }

  // targetSelector [coordinateTriple [NUMBER]]
  private static boolean cmdSpawnPoint_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetSelector(b, l + 1);
    r = r && cmdSpawnPoint_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [coordinateTriple [NUMBER]]
  private static boolean cmdSpawnPoint_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint_1_0_1")) return false;
    cmdSpawnPoint_1_0_1_0(b, l + 1);
    return true;
  }

  // coordinateTriple [NUMBER]
  private static boolean cmdSpawnPoint_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdSpawnPoint_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdSpawnPoint_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpawnPoint_1_0_1_0_1")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'spectate' [targetSelector [targetSelector]]
  public static boolean cmdSpectate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpectate")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SPECTATE, "<cmd spectate>");
    r = consumeToken(b, "spectate");
    p = r; // pin = 1
    r = r && cmdSpectate_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [targetSelector [targetSelector]]
  private static boolean cmdSpectate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpectate_1")) return false;
    cmdSpectate_1_0(b, l + 1);
    return true;
  }

  // targetSelector [targetSelector]
  private static boolean cmdSpectate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpectate_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetSelector(b, l + 1);
    r = r && cmdSpectate_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector]
  private static boolean cmdSpectate_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpectate_1_0_1")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'spreadplayers' coordinateDouble NUMBER NUMBER [('under' NUMBER)] boolValue targetSelector
  public static boolean cmdSpreadPlayers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpreadPlayers")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SPREAD_PLAYERS, "<cmd spread players>");
    r = consumeToken(b, "spreadplayers");
    p = r; // pin = 1
    r = r && report_error_(b, coordinateDouble(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, NUMBER, NUMBER)) && r;
    r = p && report_error_(b, cmdSpreadPlayers_4(b, l + 1)) && r;
    r = p && report_error_(b, boolValue(b, l + 1)) && r;
    r = p && targetSelector(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [('under' NUMBER)]
  private static boolean cmdSpreadPlayers_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpreadPlayers_4")) return false;
    cmdSpreadPlayers_4_0(b, l + 1);
    return true;
  }

  // 'under' NUMBER
  private static boolean cmdSpreadPlayers_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSpreadPlayers_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "under");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('stop')
  public static boolean cmdStop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdStop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_STOP, "<cmd stop>");
    r = consumeToken(b, "stop");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'stopsound' targetSelector [cmdPlaySound_Source [IDENTIFIER]]
  public static boolean cmdStopSound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdStopSound")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_STOP_SOUND, "<cmd stop sound>");
    r = consumeToken(b, "stopsound");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && cmdStopSound_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [cmdPlaySound_Source [IDENTIFIER]]
  private static boolean cmdStopSound_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdStopSound_2")) return false;
    cmdStopSound_2_0(b, l + 1);
    return true;
  }

  // cmdPlaySound_Source [IDENTIFIER]
  private static boolean cmdStopSound_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdStopSound_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdPlaySound_Source(b, l + 1);
    r = r && cmdStopSound_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENTIFIER]
  private static boolean cmdStopSound_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdStopSound_2_0_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // 'summon' IDENTIFIER [coordinateTriple [JSON]]
  public static boolean cmdSummon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSummon")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_SUMMON, "<cmd summon>");
    r = consumeToken(b, "summon");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && cmdSummon_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [coordinateTriple [JSON]]
  private static boolean cmdSummon_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSummon_2")) return false;
    cmdSummon_2_0(b, l + 1);
    return true;
  }

  // coordinateTriple [JSON]
  private static boolean cmdSummon_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSummon_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    r = r && cmdSummon_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [JSON]
  private static boolean cmdSummon_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdSummon_2_0_1")) return false;
    consumeToken(b, JSON);
    return true;
  }

  /* ********************************************************** */
  // 'tag' targetSelector ('list' | (('add'|'remove') IDENTIFIER))
  public static boolean cmdTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTag")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TAG, "<cmd tag>");
    r = consumeToken(b, "tag");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && cmdTag_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'list' | (('add'|'remove') IDENTIFIER)
  private static boolean cmdTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTag_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "list");
    if (!r) r = cmdTag_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('add'|'remove') IDENTIFIER
  private static boolean cmdTag_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTag_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTag_2_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add'|'remove'
  private static boolean cmdTag_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTag_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "remove");
    return r;
  }

  /* ********************************************************** */
  // 'team' (('add' IDENTIFIER componentValue) |
  //                      (('list'|'remove'|'empty') IDENTIFIER) |
  //                      ('join' IDENTIFIER [targetSelector]) |
  //                      ('leave' targetSelector) |
  //                      ('modify' IDENTIFIER cmdTeam_ModOptions))
  public static boolean cmdTeam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TEAM, "<cmd team>");
    r = consumeToken(b, "team");
    p = r; // pin = 1
    r = r && cmdTeam_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('add' IDENTIFIER componentValue) |
  //                      (('list'|'remove'|'empty') IDENTIFIER) |
  //                      ('join' IDENTIFIER [targetSelector]) |
  //                      ('leave' targetSelector) |
  //                      ('modify' IDENTIFIER cmdTeam_ModOptions)
  private static boolean cmdTeam_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTeam_1_0(b, l + 1);
    if (!r) r = cmdTeam_1_1(b, l + 1);
    if (!r) r = cmdTeam_1_2(b, l + 1);
    if (!r) r = cmdTeam_1_3(b, l + 1);
    if (!r) r = cmdTeam_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' IDENTIFIER componentValue
  private static boolean cmdTeam_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('list'|'remove'|'empty') IDENTIFIER
  private static boolean cmdTeam_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTeam_1_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'list'|'remove'|'empty'
  private static boolean cmdTeam_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, "list");
    if (!r) r = consumeToken(b, "remove");
    if (!r) r = consumeToken(b, "empty");
    return r;
  }

  // 'join' IDENTIFIER [targetSelector]
  private static boolean cmdTeam_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "join");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdTeam_1_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector]
  private static boolean cmdTeam_1_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_2_2")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  // 'leave' targetSelector
  private static boolean cmdTeam_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "leave");
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'modify' IDENTIFIER cmdTeam_ModOptions
  private static boolean cmdTeam_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modify");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && cmdTeam_ModOptions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('teammsg'|'tm') freeMessageValues
  public static boolean cmdTeamMsg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeamMsg")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TEAM_MSG, "<cmd team msg>");
    r = cmdTeamMsg_0(b, l + 1);
    p = r; // pin = 1
    r = r && freeMessageValues(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'teammsg'|'tm'
  private static boolean cmdTeamMsg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeamMsg_0")) return false;
    boolean r;
    r = consumeToken(b, "teammsg");
    if (!r) r = consumeToken(b, "tm");
    return r;
  }

  /* ********************************************************** */
  // ('displayName' componentValue) |
  //                                 ('color' COLOR) |
  //                                 ('friendlyFire' boolValue) |
  //                                 ('seeFriendlyInvisibles' boolValue) |
  //                                 ('nametagVisibility' ('never'|'hideForOtherTeams'|'hideForOwnTeam'|'always')) |
  //                                 ('deathMessageVisibility' ('never'|'hideForOtherTeams'|'hideForOwnTeam'|'always')) |
  //                                 ('collisionRule' ('always'|'never'|'pushOtherTeams'|'pushOwnTeam')) |
  //                                 ('prefix' componentValue) |
  //                                 ('suffix' componentValue)
  public static boolean cmdTeam_ModOptions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMD_TEAM_MOD_OPTIONS, "<cmd team mod options>");
    r = cmdTeam_ModOptions_0(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_1(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_2(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_3(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_4(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_5(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_6(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_7(b, l + 1);
    if (!r) r = cmdTeam_ModOptions_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'displayName' componentValue
  private static boolean cmdTeam_ModOptions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "displayName");
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'color' COLOR
  private static boolean cmdTeam_ModOptions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "color");
    r = r && consumeToken(b, COLOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'friendlyFire' boolValue
  private static boolean cmdTeam_ModOptions_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "friendlyFire");
    r = r && boolValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'seeFriendlyInvisibles' boolValue
  private static boolean cmdTeam_ModOptions_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "seeFriendlyInvisibles");
    r = r && boolValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'nametagVisibility' ('never'|'hideForOtherTeams'|'hideForOwnTeam'|'always')
  private static boolean cmdTeam_ModOptions_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "nametagVisibility");
    r = r && cmdTeam_ModOptions_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'never'|'hideForOtherTeams'|'hideForOwnTeam'|'always'
  private static boolean cmdTeam_ModOptions_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_4_1")) return false;
    boolean r;
    r = consumeToken(b, "never");
    if (!r) r = consumeToken(b, "hideForOtherTeams");
    if (!r) r = consumeToken(b, "hideForOwnTeam");
    if (!r) r = consumeToken(b, "always");
    return r;
  }

  // 'deathMessageVisibility' ('never'|'hideForOtherTeams'|'hideForOwnTeam'|'always')
  private static boolean cmdTeam_ModOptions_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "deathMessageVisibility");
    r = r && cmdTeam_ModOptions_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'never'|'hideForOtherTeams'|'hideForOwnTeam'|'always'
  private static boolean cmdTeam_ModOptions_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_5_1")) return false;
    boolean r;
    r = consumeToken(b, "never");
    if (!r) r = consumeToken(b, "hideForOtherTeams");
    if (!r) r = consumeToken(b, "hideForOwnTeam");
    if (!r) r = consumeToken(b, "always");
    return r;
  }

  // 'collisionRule' ('always'|'never'|'pushOtherTeams'|'pushOwnTeam')
  private static boolean cmdTeam_ModOptions_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "collisionRule");
    r = r && cmdTeam_ModOptions_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'always'|'never'|'pushOtherTeams'|'pushOwnTeam'
  private static boolean cmdTeam_ModOptions_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_6_1")) return false;
    boolean r;
    r = consumeToken(b, "always");
    if (!r) r = consumeToken(b, "never");
    if (!r) r = consumeToken(b, "pushOtherTeams");
    if (!r) r = consumeToken(b, "pushOwnTeam");
    return r;
  }

  // 'prefix' componentValue
  private static boolean cmdTeam_ModOptions_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "prefix");
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'suffix' componentValue
  private static boolean cmdTeam_ModOptions_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeam_ModOptions_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "suffix");
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('teleport'|'tp') (([targetSelector] (coordinateTriple|targetSelector)) |
  //                              (targetSelector coordinateTriple (coordinateDouble |
  //                                                                ('facing' (coordinateTriple | ('entity' targetSelector ['eyes'|'feet']))))))
  public static boolean cmdTeleport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TELEPORT, "<cmd teleport>");
    r = cmdTeleport_0(b, l + 1);
    p = r; // pin = 1
    r = r && cmdTeleport_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'teleport'|'tp'
  private static boolean cmdTeleport_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_0")) return false;
    boolean r;
    r = consumeToken(b, "teleport");
    if (!r) r = consumeToken(b, "tp");
    return r;
  }

  // ([targetSelector] (coordinateTriple|targetSelector)) |
  //                              (targetSelector coordinateTriple (coordinateDouble |
  //                                                                ('facing' (coordinateTriple | ('entity' targetSelector ['eyes'|'feet'])))))
  private static boolean cmdTeleport_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTeleport_1_0(b, l + 1);
    if (!r) r = cmdTeleport_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector] (coordinateTriple|targetSelector)
  private static boolean cmdTeleport_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTeleport_1_0_0(b, l + 1);
    r = r && cmdTeleport_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [targetSelector]
  private static boolean cmdTeleport_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_0_0")) return false;
    targetSelector(b, l + 1);
    return true;
  }

  // coordinateTriple|targetSelector
  private static boolean cmdTeleport_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_0_1")) return false;
    boolean r;
    r = coordinateTriple(b, l + 1);
    if (!r) r = targetSelector(b, l + 1);
    return r;
  }

  // targetSelector coordinateTriple (coordinateDouble |
  //                                                                ('facing' (coordinateTriple | ('entity' targetSelector ['eyes'|'feet']))))
  private static boolean cmdTeleport_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetSelector(b, l + 1);
    r = r && coordinateTriple(b, l + 1);
    r = r && cmdTeleport_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // coordinateDouble |
  //                                                                ('facing' (coordinateTriple | ('entity' targetSelector ['eyes'|'feet'])))
  private static boolean cmdTeleport_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateDouble(b, l + 1);
    if (!r) r = cmdTeleport_1_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'facing' (coordinateTriple | ('entity' targetSelector ['eyes'|'feet']))
  private static boolean cmdTeleport_1_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "facing");
    r = r && cmdTeleport_1_1_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // coordinateTriple | ('entity' targetSelector ['eyes'|'feet'])
  private static boolean cmdTeleport_1_1_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = coordinateTriple(b, l + 1);
    if (!r) r = cmdTeleport_1_1_2_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'entity' targetSelector ['eyes'|'feet']
  private static boolean cmdTeleport_1_1_2_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "entity");
    r = r && targetSelector(b, l + 1);
    r = r && cmdTeleport_1_1_2_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['eyes'|'feet']
  private static boolean cmdTeleport_1_1_2_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2_1_1_1_2")) return false;
    cmdTeleport_1_1_2_1_1_1_2_0(b, l + 1);
    return true;
  }

  // 'eyes'|'feet'
  private static boolean cmdTeleport_1_1_2_1_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTeleport_1_1_2_1_1_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "eyes");
    if (!r) r = consumeToken(b, "feet");
    return r;
  }

  /* ********************************************************** */
  // 'tellraw' targetSelector freeMessageValues
  public static boolean cmdTellRaw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTellRaw")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TELL_RAW, "<cmd tell raw>");
    r = consumeToken(b, "tellraw");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && freeMessageValues(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'time' (('add' timeValue) |
  //                      ('set' (timeValue|'day'|'night'|'noon'|'midnight')) |
  //                      ('query' ('daytime'|'gametime'|'day')))
  public static boolean cmdTime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TIME, "<cmd time>");
    r = consumeToken(b, "time");
    p = r; // pin = 1
    r = r && cmdTime_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('add' timeValue) |
  //                      ('set' (timeValue|'day'|'night'|'noon'|'midnight')) |
  //                      ('query' ('daytime'|'gametime'|'day'))
  private static boolean cmdTime_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTime_1_0(b, l + 1);
    if (!r) r = cmdTime_1_1(b, l + 1);
    if (!r) r = cmdTime_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' timeValue
  private static boolean cmdTime_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && timeValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'set' (timeValue|'day'|'night'|'noon'|'midnight')
  private static boolean cmdTime_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && cmdTime_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // timeValue|'day'|'night'|'noon'|'midnight'
  private static boolean cmdTime_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1_1_1")) return false;
    boolean r;
    r = timeValue(b, l + 1);
    if (!r) r = consumeToken(b, "day");
    if (!r) r = consumeToken(b, "night");
    if (!r) r = consumeToken(b, "noon");
    if (!r) r = consumeToken(b, "midnight");
    return r;
  }

  // 'query' ('daytime'|'gametime'|'day')
  private static boolean cmdTime_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "query");
    r = r && cmdTime_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'daytime'|'gametime'|'day'
  private static boolean cmdTime_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTime_1_2_1")) return false;
    boolean r;
    r = consumeToken(b, "daytime");
    if (!r) r = consumeToken(b, "gametime");
    if (!r) r = consumeToken(b, "day");
    return r;
  }

  /* ********************************************************** */
  // 'title' targetSelector (('clear'|'reset') |
  //                                       (('title'|'subtitle'|'actionbar') componentValue) |
  //                                       ('times' timeValue timeValue timeValue))
  public static boolean cmdTitle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TITLE, "<cmd title>");
    r = consumeToken(b, "title");
    p = r; // pin = 1
    r = r && report_error_(b, targetSelector(b, l + 1));
    r = p && cmdTitle_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('clear'|'reset') |
  //                                       (('title'|'subtitle'|'actionbar') componentValue) |
  //                                       ('times' timeValue timeValue timeValue)
  private static boolean cmdTitle_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTitle_2_0(b, l + 1);
    if (!r) r = cmdTitle_2_1(b, l + 1);
    if (!r) r = cmdTitle_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'clear'|'reset'
  private static boolean cmdTitle_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle_2_0")) return false;
    boolean r;
    r = consumeToken(b, "clear");
    if (!r) r = consumeToken(b, "reset");
    return r;
  }

  // ('title'|'subtitle'|'actionbar') componentValue
  private static boolean cmdTitle_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTitle_2_1_0(b, l + 1);
    r = r && componentValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'title'|'subtitle'|'actionbar'
  private static boolean cmdTitle_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, "title");
    if (!r) r = consumeToken(b, "subtitle");
    if (!r) r = consumeToken(b, "actionbar");
    return r;
  }

  // 'times' timeValue timeValue timeValue
  private static boolean cmdTitle_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTitle_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "times");
    r = r && timeValue(b, l + 1);
    r = r && timeValue(b, l + 1);
    r = r && timeValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'trigger' IDENTIFIER [('set'|'add') NUMBER]
  public static boolean cmdTrigger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTrigger")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_TRIGGER, "<cmd trigger>");
    r = consumeToken(b, "trigger");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && cmdTrigger_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [('set'|'add') NUMBER]
  private static boolean cmdTrigger_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTrigger_2")) return false;
    cmdTrigger_2_0(b, l + 1);
    return true;
  }

  // ('set'|'add') NUMBER
  private static boolean cmdTrigger_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTrigger_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdTrigger_2_0_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'set'|'add'
  private static boolean cmdTrigger_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdTrigger_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, "set");
    if (!r) r = consumeToken(b, "add");
    return r;
  }

  /* ********************************************************** */
  // 'weather' ('clear'|'rain'|'thunder') [timeValue]
  public static boolean cmdWeather(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWeather")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_WEATHER, "<cmd weather>");
    r = consumeToken(b, "weather");
    p = r; // pin = 1
    r = r && report_error_(b, cmdWeather_1(b, l + 1));
    r = p && cmdWeather_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'clear'|'rain'|'thunder'
  private static boolean cmdWeather_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWeather_1")) return false;
    boolean r;
    r = consumeToken(b, "clear");
    if (!r) r = consumeToken(b, "rain");
    if (!r) r = consumeToken(b, "thunder");
    return r;
  }

  // [timeValue]
  private static boolean cmdWeather_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWeather_2")) return false;
    timeValue(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'whitelist' (('list'|'off'|'on'|'reload') |
  //                                (('add'|'remove') targetSelector))
  public static boolean cmdWhitelist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWhitelist")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_WHITELIST, "<cmd whitelist>");
    r = consumeToken(b, "whitelist");
    p = r; // pin = 1
    r = r && cmdWhitelist_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('list'|'off'|'on'|'reload') |
  //                                (('add'|'remove') targetSelector)
  private static boolean cmdWhitelist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWhitelist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdWhitelist_1_0(b, l + 1);
    if (!r) r = cmdWhitelist_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'list'|'off'|'on'|'reload'
  private static boolean cmdWhitelist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWhitelist_1_0")) return false;
    boolean r;
    r = consumeToken(b, "list");
    if (!r) r = consumeToken(b, "off");
    if (!r) r = consumeToken(b, "on");
    if (!r) r = consumeToken(b, "reload");
    return r;
  }

  // ('add'|'remove') targetSelector
  private static boolean cmdWhitelist_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWhitelist_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdWhitelist_1_1_0(b, l + 1);
    r = r && targetSelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add'|'remove'
  private static boolean cmdWhitelist_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWhitelist_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "remove");
    return r;
  }

  /* ********************************************************** */
  // 'worldborder' ('get' |
  //                                    ('add' NUMBER [NUMBER]) |
  //                                    ('center' coordinateDouble) |
  //                                    ('damage' (('amount' NUMBER) | ('buffer' NUMBER))) |
  //                                    ('set' NUMBER [NUMBER]) |
  //                                    ('warning' (('distance' NUMBER) | ('time' NUMBER))))
  public static boolean cmdWorldBorder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CMD_WORLD_BORDER, "<cmd world border>");
    r = consumeToken(b, "worldborder");
    p = r; // pin = 1
    r = r && cmdWorldBorder_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'get' |
  //                                    ('add' NUMBER [NUMBER]) |
  //                                    ('center' coordinateDouble) |
  //                                    ('damage' (('amount' NUMBER) | ('buffer' NUMBER))) |
  //                                    ('set' NUMBER [NUMBER]) |
  //                                    ('warning' (('distance' NUMBER) | ('time' NUMBER)))
  private static boolean cmdWorldBorder_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "get");
    if (!r) r = cmdWorldBorder_1_1(b, l + 1);
    if (!r) r = cmdWorldBorder_1_2(b, l + 1);
    if (!r) r = cmdWorldBorder_1_3(b, l + 1);
    if (!r) r = cmdWorldBorder_1_4(b, l + 1);
    if (!r) r = cmdWorldBorder_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'add' NUMBER [NUMBER]
  private static boolean cmdWorldBorder_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    r = r && consumeToken(b, NUMBER);
    r = r && cmdWorldBorder_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdWorldBorder_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_1_2")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'center' coordinateDouble
  private static boolean cmdWorldBorder_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "center");
    r = r && coordinateDouble(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'damage' (('amount' NUMBER) | ('buffer' NUMBER))
  private static boolean cmdWorldBorder_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "damage");
    r = r && cmdWorldBorder_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('amount' NUMBER) | ('buffer' NUMBER)
  private static boolean cmdWorldBorder_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdWorldBorder_1_3_1_0(b, l + 1);
    if (!r) r = cmdWorldBorder_1_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'amount' NUMBER
  private static boolean cmdWorldBorder_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "amount");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'buffer' NUMBER
  private static boolean cmdWorldBorder_1_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "buffer");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'set' NUMBER [NUMBER]
  private static boolean cmdWorldBorder_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && consumeToken(b, NUMBER);
    r = r && cmdWorldBorder_1_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [NUMBER]
  private static boolean cmdWorldBorder_1_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_4_2")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'warning' (('distance' NUMBER) | ('time' NUMBER))
  private static boolean cmdWorldBorder_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "warning");
    r = r && cmdWorldBorder_1_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('distance' NUMBER) | ('time' NUMBER)
  private static boolean cmdWorldBorder_1_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmdWorldBorder_1_5_1_0(b, l + 1);
    if (!r) r = cmdWorldBorder_1_5_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'distance' NUMBER
  private static boolean cmdWorldBorder_1_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "distance");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'time' NUMBER
  private static boolean cmdWorldBorder_1_5_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmdWorldBorder_1_5_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "time");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING|JSON
  public static boolean componentValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "componentValue")) return false;
    if (!nextTokenIs(b, "<component value>", JSON, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_VALUE, "<component value>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, JSON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  public static boolean coordinateDouble(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateDouble")) return false;
    if (!nextTokenIs(b, "<coordinate double>", COORDINATE, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COORDINATE_DOUBLE, "<coordinate double>");
    r = coordinateDouble_0(b, l + 1);
    r = r && coordinateDouble_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateDouble_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateDouble_0")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateDouble_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateDouble_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // (COORDINATE|NUMBER) (COORDINATE|NUMBER) (COORDINATE|NUMBER)
  public static boolean coordinateTriple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTriple")) return false;
    if (!nextTokenIs(b, "<coordinate triple>", COORDINATE, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COORDINATE_TRIPLE, "<coordinate triple>");
    r = coordinateTriple_0(b, l + 1);
    r = r && coordinateTriple_1(b, l + 1);
    r = r && coordinateTriple_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTriple_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTriple_0")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTriple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTriple_1")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // COORDINATE|NUMBER
  private static boolean coordinateTriple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coordinateTriple_2")) return false;
    boolean r;
    r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // 'byte'|'short'|'int'|'long'|'float'|'double'
  public static boolean dataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = consumeToken(b, "byte");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "double");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'minecraft:overworld'|'minecraft:the_end'|'minecraft:the_nether'
  public static boolean defaultDimensionIdentifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defaultDimensionIdentifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_DIMENSION_IDENTIFIERS, "<default dimension identifiers>");
    r = consumeToken(b, "minecraft:overworld");
    if (!r) r = consumeToken(b, "minecraft:the_end");
    if (!r) r = consumeToken(b, "minecraft:the_nether");
    exit_section_(b, l, m, r, false, null);
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
  // (STRING|SELECTOR|NUMBER|COORDINATE|JSON|IDENTIFIER)*
  public static boolean freeMessageValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "freeMessageValues")) return false;
    Marker m = enter_section_(b, l, _NONE_, FREE_MESSAGE_VALUES, "<free message values>");
    while (true) {
      int c = current_position_(b);
      if (!freeMessageValues_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "freeMessageValues", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // STRING|SELECTOR|NUMBER|COORDINATE|JSON|IDENTIFIER
  private static boolean freeMessageValues_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "freeMessageValues_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, SELECTOR);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, COORDINATE);
    if (!r) r = consumeToken(b, JSON);
    if (!r) r = consumeToken(b, IDENTIFIER);
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
    exit_section_(b, l, m, r, false, McFunctionParser::statement_recover);
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
  // cmdAdvancement | cmdAttribute | cmdBan | cmdBossBar | cmdClear | cmdClone | cmdDamage | cmdData | cmdDataPack | cmdDebug | cmdDefaultGameMode |
  //               cmdDifficulty | cmdEffect | cmdEnchant | cmdExecute | cmdExperience | cmdFill | cmdFillBiome | cmdForceLoad | cmdFunction | cmdGameRule | cmdGameMode |
  //               cmdGive | cmdHelp | cmdItem | cmdJfr | cmdKick | cmdKill | cmdList | cmdLocate | cmdLoot | cmdMe | cmdMsg | cmdOp | cmdPardon | cmdPardonIp | cmdParticle |
  //               cmdPlace | cmdPlaySound | cmdPublish | cmdRecipe | cmdReload | cmdSaveAll | cmdSaveOff | cmdSaveOn | cmdSay | cmdSchedule | cmdScoreboard | cmdSeed |
  //               cmdSetBlock | cmdSetIdleTimeout | cmdSetWorldSpawn | cmdSpawnPoint | cmdSpectate | cmdSpreadPlayers | cmdStop | cmdStopSound | cmdSummon | cmdTag |
  //               cmdTeam | cmdTeamMsg | cmdTeleport | cmdTellRaw | cmdTime | cmdTitle | cmdTrigger | cmdWeather | cmdWhitelist | cmdWorldBorder
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
    if (!r) r = cmdExecute(b, l + 1);
    if (!r) r = cmdExperience(b, l + 1);
    if (!r) r = cmdFill(b, l + 1);
    if (!r) r = cmdFillBiome(b, l + 1);
    if (!r) r = cmdForceLoad(b, l + 1);
    if (!r) r = cmdFunction(b, l + 1);
    if (!r) r = cmdGameRule(b, l + 1);
    if (!r) r = cmdGameMode(b, l + 1);
    if (!r) r = cmdGive(b, l + 1);
    if (!r) r = cmdHelp(b, l + 1);
    if (!r) r = cmdItem(b, l + 1);
    if (!r) r = cmdJfr(b, l + 1);
    if (!r) r = cmdKick(b, l + 1);
    if (!r) r = cmdKill(b, l + 1);
    if (!r) r = cmdList(b, l + 1);
    if (!r) r = cmdLocate(b, l + 1);
    if (!r) r = cmdLoot(b, l + 1);
    if (!r) r = cmdMe(b, l + 1);
    if (!r) r = cmdMsg(b, l + 1);
    if (!r) r = cmdOp(b, l + 1);
    if (!r) r = cmdPardon(b, l + 1);
    if (!r) r = cmdPardonIp(b, l + 1);
    if (!r) r = cmdParticle(b, l + 1);
    if (!r) r = cmdPlace(b, l + 1);
    if (!r) r = cmdPlaySound(b, l + 1);
    if (!r) r = cmdPublish(b, l + 1);
    if (!r) r = cmdRecipe(b, l + 1);
    if (!r) r = cmdReload(b, l + 1);
    if (!r) r = cmdSaveAll(b, l + 1);
    if (!r) r = cmdSaveOff(b, l + 1);
    if (!r) r = cmdSaveOn(b, l + 1);
    if (!r) r = cmdSay(b, l + 1);
    if (!r) r = cmdSchedule(b, l + 1);
    if (!r) r = cmdScoreboard(b, l + 1);
    if (!r) r = cmdSeed(b, l + 1);
    if (!r) r = cmdSetBlock(b, l + 1);
    if (!r) r = cmdSetIdleTimeout(b, l + 1);
    if (!r) r = cmdSetWorldSpawn(b, l + 1);
    if (!r) r = cmdSpawnPoint(b, l + 1);
    if (!r) r = cmdSpectate(b, l + 1);
    if (!r) r = cmdSpreadPlayers(b, l + 1);
    if (!r) r = cmdStop(b, l + 1);
    if (!r) r = cmdStopSound(b, l + 1);
    if (!r) r = cmdSummon(b, l + 1);
    if (!r) r = cmdTag(b, l + 1);
    if (!r) r = cmdTeam(b, l + 1);
    if (!r) r = cmdTeamMsg(b, l + 1);
    if (!r) r = cmdTeleport(b, l + 1);
    if (!r) r = cmdTellRaw(b, l + 1);
    if (!r) r = cmdTime(b, l + 1);
    if (!r) r = cmdTitle(b, l + 1);
    if (!r) r = cmdTrigger(b, l + 1);
    if (!r) r = cmdWeather(b, l + 1);
    if (!r) r = cmdWhitelist(b, l + 1);
    if (!r) r = cmdWorldBorder(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(CRLF|COMMENT|COMMAND)
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CRLF|COMMENT|COMMAND
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, COMMAND);
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
  // NUMBER|TIME
  public static boolean timeValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "timeValue")) return false;
    if (!nextTokenIs(b, "<time value>", NUMBER, TIME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TIME_VALUE, "<time value>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, TIME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
