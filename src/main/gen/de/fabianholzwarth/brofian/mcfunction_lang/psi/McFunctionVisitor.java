// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class McFunctionVisitor extends PsiElementVisitor {

  public void visitLine_(@NotNull McFunctionLine_ o) {
    visitPsiElement(o);
  }

  public void visitProperty(@NotNull McFunctionProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull McFunctionNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
