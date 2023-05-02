// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.impl.*;

public interface McFunctionTypes {

  IElementType PROPERTY = new McFunctionElementType("PROPERTY");

  IElementType COMMENT = new McFunctionTokenType("COMMENT");
  IElementType CRLF = new McFunctionTokenType("CRLF");
  IElementType KEY = new McFunctionTokenType("KEY");
  IElementType SEPARATOR = new McFunctionTokenType("SEPARATOR");
  IElementType VALUE = new McFunctionTokenType("VALUE");
  IElementType BAD_CHARACTER = new McFunctionTokenType("BAD_CHARACTER");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new McFunctionPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
