// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.impl.*;

public interface McFunctionTypes {

  IElementType CMD_FILL = new McFunctionElementType("CMD_FILL");
  IElementType CMD_GIVE = new McFunctionElementType("CMD_GIVE");
  IElementType CMD_SCOREBOARD = new McFunctionElementType("CMD_SCOREBOARD");
  IElementType CMD_SET_BLOCK = new McFunctionElementType("CMD_SET_BLOCK");
  IElementType LINE_ = new McFunctionElementType("LINE_");
  IElementType PROPERTY = new McFunctionElementType("PROPERTY");

  IElementType COMMAND_FILL = new McFunctionTokenType("COMMAND_FILL");
  IElementType COMMAND_GIVE = new McFunctionTokenType("COMMAND_GIVE");
  IElementType COMMAND_SETBLOCK = new McFunctionTokenType("COMMAND_SETBLOCK");
  IElementType COMMENT = new McFunctionTokenType("COMMENT");
  IElementType COORDINATE = new McFunctionTokenType("COORDINATE");
  IElementType CRLF = new McFunctionTokenType("CRLF");
  IElementType IDENTIFIER = new McFunctionTokenType("IDENTIFIER");
  IElementType NUMBER = new McFunctionTokenType("NUMBER");
  IElementType OPERATOR = new McFunctionTokenType("OPERATOR");
  IElementType SELECTOR = new McFunctionTokenType("SELECTOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CMD_FILL) {
        return new McFunctionCmdFillImpl(node);
      }
      else if (type == CMD_GIVE) {
        return new McFunctionCmdGiveImpl(node);
      }
      else if (type == CMD_SCOREBOARD) {
        return new McFunctionCmdScoreboardImpl(node);
      }
      else if (type == CMD_SET_BLOCK) {
        return new McFunctionCmdSetBlockImpl(node);
      }
      else if (type == LINE_) {
        return new McFunctionLine_Impl(node);
      }
      else if (type == PROPERTY) {
        return new McFunctionPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
