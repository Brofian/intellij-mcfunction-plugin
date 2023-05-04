// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.impl.*;

public interface McFunctionTypes {

  IElementType LINE_ = new McFunctionElementType("LINE_");
  IElementType PROPERTY = new McFunctionElementType("PROPERTY");

  IElementType COMMAND = new McFunctionTokenType("COMMAND");
  IElementType COMMENT = new McFunctionTokenType("COMMENT");
  IElementType COORDINATE = new McFunctionTokenType("COORDINATE");
  IElementType CRLF = new McFunctionTokenType("CRLF");
  IElementType IDENTIFIER = new McFunctionTokenType("IDENTIFIER");
  IElementType OPERATOR = new McFunctionTokenType("OPERATOR");
  IElementType SELECTOR = new McFunctionTokenType("SELECTOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == LINE_) {
        return new McFunctionLine_Impl(node);
      }
      else if (type == PROPERTY) {
        return new McFunctionPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
