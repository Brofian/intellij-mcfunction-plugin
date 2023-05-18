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

public class McFunctionCmdTeleportImpl extends ASTWrapperPsiElement implements McFunctionCmdTeleport {

  public McFunctionCmdTeleportImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull McFunctionVisitor visitor) {
    visitor.visitCmdTeleport(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof McFunctionVisitor) accept((McFunctionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public McFunctionCoordinateDouble getCoordinateDouble() {
    return findChildByClass(McFunctionCoordinateDouble.class);
  }

  @Override
  @NotNull
  public List<McFunctionCoordinateTriple> getCoordinateTripleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, McFunctionCoordinateTriple.class);
  }

  @Override
  @NotNull
  public List<McFunctionTargetSelector> getTargetSelectorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, McFunctionTargetSelector.class);
  }

}
