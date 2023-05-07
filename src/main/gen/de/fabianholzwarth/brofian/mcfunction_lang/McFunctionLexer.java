// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: src/main/java/de/fabianholzwarth/brofian/mcfunction_lang/McFunction.flex

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;


class McFunctionLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\5\u0100\1\u0200\1\u0300\1\u0100\5\u0400\1\u0500\1\u0600"+
    "\1\u0700\6\u0100\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00"+
    "\3\u0100\1\u0e00\205\u0100\1\u0600\1\u0100\1\u0f00\1\u1000\1\u1100"+
    "\1\u1200\54\u0100\10\u1300\37\u0100\1\u0900\4\u0100\1\u1400\10\u0100"+
    "\1\u1500\2\u0100\1\u1600\1\u1700\1\u1200\1\u0100\1\u0500\1\u0100"+
    "\1\u1800\1\u1500\1\u0800\3\u0100\1\u1100\1\u1900\114\u0100\1\u1a00"+
    "\1\u1100\153\u0100\1\u1b00\11\u0100\1\u1c00\1\u1200\6\u0100\1\u1100"+
    "\u0f16\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\0\1\6\1\7\1\0\1\10\4\0\2\10\1\11"+
    "\1\12\1\13\1\10\1\14\1\15\1\16\3\17\1\20"+
    "\3\17\1\21\1\0\1\22\1\23\1\22\1\0\1\24"+
    "\32\25\1\26\1\0\1\27\1\30\1\31\1\0\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\25\1\43\1\44\1\45\1\46\1\47\1\50\1\25"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\25\1\61\1\0\1\62\1\30\6\0\1\3\u01da\0"+
    "\12\63\206\0\12\63\306\0\12\63\234\0\12\63\166\0"+
    "\12\63\140\0\12\63\166\0\12\63\106\0\12\63\u0116\0"+
    "\12\63\106\0\12\63\u0146\0\12\63\46\0\12\63\u012c\0"+
    "\12\63\200\0\12\63\246\0\12\63\6\0\12\63\266\0"+
    "\12\63\126\0\12\63\206\0\12\63\6\0\12\63\316\0"+
    "\2\3\u01a6\0\12\63\46\0\12\63\306\0\12\63\26\0"+
    "\12\63\126\0\12\63\u0196\0\12\63\6\0\u0100\64\240\0"+
    "\12\63\206\0\12\63\u012c\0\12\63\200\0\12\63\74\0"+
    "\12\63\220\0\12\63\166\0\12\63\146\0\12\63\206\0"+
    "\12\63\106\0\12\63\266\0\12\63\u0164\0\62\63\100\0"+
    "\12\63\266\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[7424];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\1\1\4\1\1\2\5"+
    "\1\6\1\7\1\1\1\5\1\10\26\5\1\1\1\6"+
    "\2\11\1\0\1\12\1\7\3\0\1\5\1\13\1\0"+
    "\1\10\3\5\1\14\5\5\1\14\50\5\1\0\1\15"+
    "\2\0\2\6\1\0\1\10\1\0\5\5\1\16\46\5"+
    "\1\17\3\5\1\14\11\5\1\13\1\10\12\5\1\16"+
    "\63\5\1\14\12\5\1\7\3\5\1\14\7\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\237\0\324\0\u0109\0\u013e"+
    "\0\u0173\0\u01a8\0\u01dd\0\u013e\0\u0212\0\u0247\0\u027c\0\u02b1"+
    "\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459"+
    "\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc\0\u0601"+
    "\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9"+
    "\0\237\0\324\0\324\0\152\0\u07de\0\u0813\0\u0848\0\u087d"+
    "\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0\0\u0a25"+
    "\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0247\0\u0b2e\0\u0b63\0\u0b98"+
    "\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40"+
    "\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\u0f1d\0\u0f52\0\u0f87\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090"+
    "\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u1199\0\u11ce\0\u1203\0\u1238"+
    "\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u1341\0\u073f\0\u073f\0\u1376"+
    "\0\u13ab\0\u087d\0\u1376\0\u13e0\0\u1415\0\u144a\0\u147f\0\u14b4"+
    "\0\u14e9\0\u151e\0\u1553\0\u0247\0\u1588\0\u15bd\0\u15f2\0\u1627"+
    "\0\u165c\0\u1691\0\u16c6\0\u16fb\0\u1730\0\u1765\0\u179a\0\u17cf"+
    "\0\u1804\0\u1839\0\u186e\0\u18a3\0\u18d8\0\u190d\0\u1942\0\u1977"+
    "\0\u19ac\0\u19e1\0\u1a16\0\u1a4b\0\u1a80\0\u1ab5\0\u1aea\0\u1b1f"+
    "\0\u1b54\0\u1b89\0\u1bbe\0\u1bf3\0\u1c28\0\u1c5d\0\u1c92\0\u1cc7"+
    "\0\u1cfc\0\u1d31\0\u0247\0\u1d66\0\u1d9b\0\u1dd0\0\u1e05\0\u1e3a"+
    "\0\u1e6f\0\u1ea4\0\u1ed9\0\u1f0e\0\u1f43\0\u1f78\0\u1fad\0\u13ab"+
    "\0\u13e0\0\152\0\u1fe2\0\u2017\0\u204c\0\u2081\0\u20b6\0\u20eb"+
    "\0\u2120\0\u2155\0\u218a\0\u21bf\0\u21f4\0\u2229\0\u225e\0\u2293"+
    "\0\u22c8\0\u22fd\0\u2332\0\u2367\0\u239c\0\u23d1\0\u2406\0\u243b"+
    "\0\u2470\0\u24a5\0\u24da\0\u250f\0\u2544\0\u2579\0\u25ae\0\u25e3"+
    "\0\u2618\0\u264d\0\u2682\0\u26b7\0\u26ec\0\u2721\0\u2756\0\u278b"+
    "\0\u27c0\0\u27f5\0\u282a\0\u285f\0\u2894\0\u28c9\0\u28fe\0\u2933"+
    "\0\u2968\0\u299d\0\u29d2\0\u2a07\0\u2a3c\0\u2a71\0\u2aa6\0\u2adb"+
    "\0\u2b10\0\u2b45\0\u2b7a\0\u2baf\0\u2be4\0\u2c19\0\u2c4e\0\u2c83"+
    "\0\u282a\0\u2cb8\0\u2ced\0\u2d22\0\u2d57\0\u2d8c\0\u2dc1\0\u2df6"+
    "\0\u2e2b\0\u2e60\0\u2e95\0\u0247\0\u2eca\0\u2eff\0\u2f34\0\u2f69"+
    "\0\u2f9e\0\u2fd3\0\u3008\0\u303d\0\u3072\0\u30a7\0\u30dc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\4\1\5\1\6\1\7\1\10"+
    "\1\3\1\11\1\12\5\13\1\3\1\14\1\3\1\15"+
    "\1\16\2\3\1\17\1\16\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\16\1\45\1\46\1\3\1\47\2\3\1\50"+
    "\1\51\1\5\1\51\1\5\57\3\66\0\5\5\57\0"+
    "\2\52\4\0\1\53\55\52\1\0\2\7\1\0\2\7"+
    "\1\0\57\7\23\0\1\54\50\0\1\55\2\0\1\16"+
    "\1\12\5\13\1\56\1\0\1\54\1\0\1\16\1\57"+
    "\2\0\30\16\2\0\1\47\13\0\7\12\4\0\1\12"+
    "\1\57\2\0\30\12\13\0\1\55\2\0\1\16\1\60"+
    "\5\13\1\56\3\0\1\16\1\57\2\0\30\16\2\0"+
    "\1\47\12\0\1\61\20\0\1\61\3\0\1\61\11\0"+
    "\3\61\21\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\30\16\16\0\1\62\1\0"+
    "\5\63\42\0\1\63\10\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\4\16\1\64"+
    "\1\16\1\65\10\16\1\66\2\16\1\67\1\16\1\70"+
    "\3\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\1\16\1\71\3\16\1\72"+
    "\5\16\1\73\2\16\1\74\10\16\1\75\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\76\2\16\1\77\11\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\1\16\1\100\3\16\1\101\3\16\1\102\16\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\15\16\1\103\6\16\1\104\3\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\1\16\1\105\7\16\1\106\4\16"+
    "\1\107\1\16\1\110\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\5\16"+
    "\1\111\3\16\1\112\6\16\1\113\7\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\16\16\1\114\11\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\15\16"+
    "\1\115\12\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\116\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\1\16\1\117\7\16\1\117\16\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\1\16\1\120\3\16\1\121\10\16"+
    "\1\122\4\16\1\123\4\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\1\16"+
    "\1\124\14\16\1\125\11\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\15\16"+
    "\1\126\5\16\1\127\4\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\11\16"+
    "\1\130\1\16\1\131\4\16\1\132\2\16\1\133\4\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\134\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\5\16\1\135\14\16\1\136\5\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\10\16\1\137\5\16\1\75\1\16\1\140\7\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\15\16\1\141\12\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\1\16\1\142\7\16\1\143\16\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\10\16\1\144\17\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\5\16"+
    "\1\145\22\16\4\0\2\146\4\0\54\146\1\147\1\146"+
    "\14\0\1\150\5\47\42\0\1\47\2\0\2\50\1\5"+
    "\1\50\1\5\66\0\1\55\2\0\1\55\1\0\5\55"+
    "\1\56\3\0\1\55\3\0\30\55\16\0\7\12\4\0"+
    "\1\12\3\0\30\12\4\0\2\151\4\0\56\151\13\0"+
    "\2\12\5\152\4\0\1\12\1\57\2\0\30\12\2\0"+
    "\1\153\27\0\1\154\52\0\5\155\42\0\1\155\14\0"+
    "\1\156\5\63\42\0\1\63\10\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\4\16"+
    "\1\75\17\16\1\157\3\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\22\16"+
    "\1\160\5\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\17\16\1\161\10\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\22\16\1\162\5\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\1\16\1\163\26\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\15\16"+
    "\1\164\3\16\1\165\6\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\6\16"+
    "\1\166\21\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\16\16\1\167\4\16"+
    "\1\170\4\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\21\16\1\171\6\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\172\10\16\1\173\11\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\13\16\1\174\14\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\14\16\1\175\5\16\1\176\5\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\21\16\1\177\6\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\21\16"+
    "\1\200\6\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\1\16\1\201\20\16"+
    "\1\202\5\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\203\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\13\16\1\204\14\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\205\4\16\1\117\7\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\20\16\1\206\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\16\16"+
    "\1\207\11\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\22\16\1\75\5\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\24\16\1\210\3\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\1\16\1\211\3\16\1\212\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\213\14\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\21\16"+
    "\1\214\6\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\215\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\21\16\1\111\6\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\21\16\1\216\1\217\3\16\1\75\1\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\20\16\1\220\7\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\4\16\1\221\17\16\1\165\3\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\13\16\1\222\14\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\14\16\1\165"+
    "\13\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\20\16\1\223\1\16\1\224"+
    "\5\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\13\16\1\225\14\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\22\16\1\226\5\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\15\16\1\227\12\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\1\16\1\230"+
    "\26\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\5\16\1\66\10\16\1\231"+
    "\11\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\20\16\1\232\7\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\4\16\1\233\7\16\1\234\2\16\1\235"+
    "\4\16\1\236\3\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\22\16\1\237"+
    "\5\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\16\16\1\240\1\16\1\241"+
    "\6\16\1\242\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\20\16\1\243\7\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\23\16\1\165\4\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\22\16\1\244\5\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\13\16"+
    "\1\140\14\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\21\16\1\245\6\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\11\16\1\246\16\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\247\14\16\20\0\5\153\42\0\1\153"+
    "\1\0\2\151\4\0\21\151\1\250\34\151\1\0\2\154"+
    "\4\0\21\154\1\251\34\154\15\0\5\63\42\0\1\63"+
    "\15\0\5\252\42\0\1\252\10\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\1\16"+
    "\1\253\26\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\254\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\255\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\20\16\1\256\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\11\16"+
    "\1\257\16\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\75\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\16\16\1\260\11\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\3\16\1\261\24\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\5\16"+
    "\1\233\22\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\21\16\1\262\6\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\1\16\1\263\26\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\15\16\1\210\12\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\16\16"+
    "\1\254\11\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\1\16\1\264\26\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\1\16\1\265\26\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\22\16\1\266\5\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\1\16"+
    "\1\267\26\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\2\16\1\270\25\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\11\16\1\271\16\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\20\16\1\272\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\21\16"+
    "\1\165\6\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\13\16\1\164\6\16"+
    "\1\273\5\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\3\16\1\165\24\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\14\16\1\75\13\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\5\16\1\164\22\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\15\16"+
    "\1\111\12\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\274\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\13\16\1\275\14\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\5\16\1\276\22\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\17\16"+
    "\1\75\10\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\12\16\1\277\15\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\3\16\1\300\24\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\7\16\1\165\20\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\11\16"+
    "\1\301\16\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\22\16\1\302\5\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\14\16\1\303\13\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\3\16\1\304\24\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\27\16"+
    "\1\75\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\13\16\1\305\14\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\12\16\1\233\15\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\27\16\1\306\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\7\16\1\307\20\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\17\16\1\310\10\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\16\16\1\311\11\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\13\16"+
    "\1\312\14\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\16\16\1\313\11\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\2\16\1\314\25\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\20\16\1\315\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\11\16"+
    "\1\316\16\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\13\16\1\165\14\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\16\16\1\317\11\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\11\16\1\320\16\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\11\16"+
    "\1\267\16\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\22\16\1\170\5\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\13\16\1\321\14\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\15\16\1\322\12\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\20\16"+
    "\1\75\7\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\15\16\1\323\12\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\11\16\1\324\16\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\200\14\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\20\16"+
    "\1\165\7\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\12\16\1\75\15\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\2\16\1\172\25\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\20\16\1\164\7\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\7\16"+
    "\1\210\20\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\17\16\1\325\10\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\20\16\1\326\7\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\2\16\1\242\25\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\13\16"+
    "\1\327\14\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\22\16\1\225\5\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\27\16\1\330\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\5\16\1\331\22\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\15\16\1\233"+
    "\12\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\16\16\1\332\11\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\20\16\1\111\7\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\5\16\1\323\22\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\10\16\1\333"+
    "\17\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\6\16\1\334\21\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\11\16\1\335\16\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\1\16\1\320\26\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\10\16\1\336"+
    "\17\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\11\16\1\337\16\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\5\16\1\340\22\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\20\16\1\341\7\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\13\16\1\170"+
    "\14\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\24\16\1\165\3\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\1\16\1\206\26\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\12\16\1\165\15\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\13\16\1\342"+
    "\14\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\1\16\1\220\26\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\15\16\1\343\12\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\23\16\1\344\4\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\13\16\1\75"+
    "\14\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\16\16\1\345\11\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\3\16\1\346\24\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\4\16\1\75\23\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\2\16\1\347"+
    "\25\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\1\16\1\350\26\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\16\16\1\225\11\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\5\16\1\351\22\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\22\16\1\352"+
    "\5\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\20\16\1\277\7\16\13\0"+
    "\1\55\2\0\1\16\1\12\5\16\1\56\3\0\1\16"+
    "\1\57\2\0\25\16\1\75\2\16\13\0\1\55\2\0"+
    "\1\16\1\12\5\16\1\56\3\0\1\16\1\57\2\0"+
    "\5\16\1\353\22\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\11\16\1\160"+
    "\15\16\1\75\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\17\16\1\354\10\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\355\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\15\16\1\165\12\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\20\16"+
    "\1\356\7\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\5\16\1\357\22\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\16\16\1\350\11\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\7\16\1\75\20\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\7\16"+
    "\1\360\20\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\25\16\1\233\2\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\361\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\23\16\1\362\4\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\3\16"+
    "\1\363\24\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\10\16\1\241\17\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\21\16\1\364\6\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\13\16\1\365\14\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\4\16"+
    "\1\366\23\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\21\16\1\75\6\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\21\16\1\356\6\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\10\16\1\75\17\16\13\0\1\55\2\0\1\16"+
    "\1\12\5\16\1\56\3\0\1\16\1\57\2\0\14\16"+
    "\1\367\13\16\13\0\1\55\2\0\1\16\1\12\5\16"+
    "\1\56\3\0\1\16\1\57\2\0\22\16\1\210\5\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\12\16\1\164\15\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\27\16\1\370\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\1\371\27\16"+
    "\13\0\1\55\2\0\1\16\1\12\5\16\1\56\3\0"+
    "\1\16\1\57\2\0\5\16\1\372\22\16\13\0\1\55"+
    "\2\0\1\16\1\12\5\16\1\56\3\0\1\16\1\57"+
    "\2\0\1\373\27\16\13\0\1\55\2\0\1\16\1\12"+
    "\1\16\1\374\1\375\1\16\1\75\1\56\3\0\1\16"+
    "\1\57\2\0\30\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\15\16\1\376"+
    "\12\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\2\16\1\377\25\16\13\0"+
    "\1\55\2\0\1\16\1\12\1\75\1\16\1\75\2\16"+
    "\1\56\3\0\1\16\1\57\2\0\30\16\13\0\1\55"+
    "\2\0\1\16\1\12\1\75\4\16\1\56\3\0\1\16"+
    "\1\57\2\0\30\16\13\0\1\55\2\0\1\16\1\12"+
    "\5\16\1\56\3\0\1\16\1\57\2\0\22\16\1\164"+
    "\5\16\13\0\1\55\2\0\1\16\1\12\5\16\1\56"+
    "\3\0\1\16\1\57\2\0\1\16\1\204\26\16\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[12561];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\46\1\1\0\1\1\1\11\3\0\2\1"+
    "\1\0\63\1\1\0\1\1\2\0\2\1\1\0\1\1"+
    "\1\0\73\1\1\11\125\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  McFunctionLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 16: break;
          case 2:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 17: break;
          case 3:
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 18: break;
          case 4:
            { yybegin(YYINITIAL); return McFunctionTypes.COMMENT;
            }
          // fall through
          case 19: break;
          case 5:
            { return McFunctionTypes.IDENTIFIER;
            }
          // fall through
          case 20: break;
          case 6:
            { return McFunctionTypes.NUMBER;
            }
          // fall through
          case 21: break;
          case 7:
            { return McFunctionTypes.OPERATOR;
            }
          // fall through
          case 22: break;
          case 8:
            { return McFunctionTypes.COORDINATE;
            }
          // fall through
          case 23: break;
          case 9:
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 24: break;
          case 10:
            { return McFunctionTypes.STRING;
            }
          // fall through
          case 25: break;
          case 11:
            { return McFunctionTypes.SELECTOR;
            }
          // fall through
          case 26: break;
          case 12:
            { return McFunctionTypes.COMMAND_ARGUMENT;
            }
          // fall through
          case 27: break;
          case 13:
            { return McFunctionTypes.JSON;
            }
          // fall through
          case 28: break;
          case 14:
            { return McFunctionTypes.COMMAND;
            }
          // fall through
          case 29: break;
          case 15:
            { return McFunctionTypes.COLOR;
            }
          // fall through
          case 30: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
