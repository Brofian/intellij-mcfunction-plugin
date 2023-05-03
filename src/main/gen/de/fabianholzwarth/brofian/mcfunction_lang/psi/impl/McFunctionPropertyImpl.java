// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes.*;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.*;

public class McFunctionPropertyImpl extends McFunctionNamedElementImpl implements McFunctionProperty {

  public McFunctionPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull McFunctionVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof McFunctionVisitor) accept((McFunctionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return McFunctionPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return McFunctionPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return McFunctionPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return McFunctionPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return McFunctionPsiImplUtil.getNameIdentifier(this);
  }

}
