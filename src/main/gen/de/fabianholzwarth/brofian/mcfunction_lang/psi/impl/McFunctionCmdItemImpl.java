// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.*;

public class McFunctionCmdItemImpl extends ASTWrapperPsiElement implements McFunctionCmdItem {

  public McFunctionCmdItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull McFunctionVisitor visitor) {
    visitor.visitCmdItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof McFunctionVisitor) accept((McFunctionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<McFunctionCmdItemTarget> getCmdItemTargetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, McFunctionCmdItemTarget.class);
  }

  @Override
  @Nullable
  public McFunctionExtendedIdentifier getExtendedIdentifier() {
    return findChildByClass(McFunctionExtendedIdentifier.class);
  }

}
