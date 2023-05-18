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

public class McFunctionCmdStopSoundImpl extends ASTWrapperPsiElement implements McFunctionCmdStopSound {

  public McFunctionCmdStopSoundImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull McFunctionVisitor visitor) {
    visitor.visitCmdStopSound(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof McFunctionVisitor) accept((McFunctionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public McFunctionCmdPlaySoundSource getCmdPlaySoundSource() {
    return findChildByClass(McFunctionCmdPlaySoundSource.class);
  }

  @Override
  @Nullable
  public McFunctionTargetSelector getTargetSelector() {
    return findChildByClass(McFunctionTargetSelector.class);
  }

}
