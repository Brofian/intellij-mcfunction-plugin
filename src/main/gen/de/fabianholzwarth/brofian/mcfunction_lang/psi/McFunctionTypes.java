// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.impl.*;

public interface McFunctionTypes {

  IElementType CMD_ADVANCEMENT = new McFunctionElementType("CMD_ADVANCEMENT");
  IElementType CMD_ATTRIBUTE = new McFunctionElementType("CMD_ATTRIBUTE");
  IElementType CMD_BAN = new McFunctionElementType("CMD_BAN");
  IElementType CMD_BOSS_BAR = new McFunctionElementType("CMD_BOSS_BAR");
  IElementType CMD_CLEAR = new McFunctionElementType("CMD_CLEAR");
  IElementType CMD_CLONE = new McFunctionElementType("CMD_CLONE");
  IElementType CMD_DAMAGE = new McFunctionElementType("CMD_DAMAGE");
  IElementType CMD_DATA = new McFunctionElementType("CMD_DATA");
  IElementType CMD_DATA_PACK = new McFunctionElementType("CMD_DATA_PACK");
  IElementType CMD_DATA_TARGET = new McFunctionElementType("CMD_DATA_TARGET");
  IElementType CMD_FILL = new McFunctionElementType("CMD_FILL");
  IElementType CMD_GIVE = new McFunctionElementType("CMD_GIVE");
  IElementType CMD_SET_BLOCK = new McFunctionElementType("CMD_SET_BLOCK");
  IElementType COORDINATE_TRIPE = new McFunctionElementType("COORDINATE_TRIPE");
  IElementType LINE_ = new McFunctionElementType("LINE_");
  IElementType PLACEHOLDER = new McFunctionElementType("PLACEHOLDER");
  IElementType PROPERTY = new McFunctionElementType("PROPERTY");
  IElementType TARGET_SELECTOR = new McFunctionElementType("TARGET_SELECTOR");
  IElementType UNUSED = new McFunctionElementType("UNUSED");

  IElementType CMDDATA_1_2_4_3_0 = new McFunctionTokenType("cmdData_1_2_4_3_0");
  IElementType COLOR = new McFunctionTokenType("COLOR");
  IElementType COMMAND = new McFunctionTokenType("COMMAND");
  IElementType COMMAND_ARGUMENT = new McFunctionTokenType("COMMAND_ARGUMENT");
  IElementType COMMENT = new McFunctionTokenType("COMMENT");
  IElementType COORDINATE = new McFunctionTokenType("COORDINATE");
  IElementType CRLF = new McFunctionTokenType("CRLF");
  IElementType IDENTIFIER = new McFunctionTokenType("IDENTIFIER");
  IElementType JSON = new McFunctionTokenType("JSON");
  IElementType NUMBER = new McFunctionTokenType("NUMBER");
  IElementType OPERATOR = new McFunctionTokenType("OPERATOR");
  IElementType SELECTOR = new McFunctionTokenType("SELECTOR");
  IElementType STRING = new McFunctionTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CMD_ADVANCEMENT) {
        return new McFunctionCmdAdvancementImpl(node);
      }
      else if (type == CMD_ATTRIBUTE) {
        return new McFunctionCmdAttributeImpl(node);
      }
      else if (type == CMD_BAN) {
        return new McFunctionCmdBanImpl(node);
      }
      else if (type == CMD_BOSS_BAR) {
        return new McFunctionCmdBossBarImpl(node);
      }
      else if (type == CMD_CLEAR) {
        return new McFunctionCmdClearImpl(node);
      }
      else if (type == CMD_CLONE) {
        return new McFunctionCmdCloneImpl(node);
      }
      else if (type == CMD_DAMAGE) {
        return new McFunctionCmdDamageImpl(node);
      }
      else if (type == CMD_DATA) {
        return new McFunctionCmdDataImpl(node);
      }
      else if (type == CMD_DATA_PACK) {
        return new McFunctionCmdDataPackImpl(node);
      }
      else if (type == CMD_DATA_TARGET) {
        return new McFunctionCmdDataTargetImpl(node);
      }
      else if (type == CMD_FILL) {
        return new McFunctionCmdFillImpl(node);
      }
      else if (type == CMD_GIVE) {
        return new McFunctionCmdGiveImpl(node);
      }
      else if (type == CMD_SET_BLOCK) {
        return new McFunctionCmdSetBlockImpl(node);
      }
      else if (type == COORDINATE_TRIPE) {
        return new McFunctionCoordinateTripeImpl(node);
      }
      else if (type == LINE_) {
        return new McFunctionLine_Impl(node);
      }
      else if (type == PLACEHOLDER) {
        return new McFunctionPlaceholderImpl(node);
      }
      else if (type == PROPERTY) {
        return new McFunctionPropertyImpl(node);
      }
      else if (type == TARGET_SELECTOR) {
        return new McFunctionTargetSelectorImpl(node);
      }
      else if (type == UNUSED) {
        return new McFunctionUnusedImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
