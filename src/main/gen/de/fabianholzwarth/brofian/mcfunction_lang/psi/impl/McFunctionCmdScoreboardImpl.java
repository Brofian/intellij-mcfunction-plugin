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

public class McFunctionCmdScoreboardImpl extends ASTWrapperPsiElement implements McFunctionCmdScoreboard {

  public McFunctionCmdScoreboardImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull McFunctionVisitor visitor) {
    visitor.visitCmdScoreboard(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof McFunctionVisitor) accept((McFunctionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public McFunctionCmdScoreboardObjectives getCmdScoreboardObjectives() {
    return findChildByClass(McFunctionCmdScoreboardObjectives.class);
  }

  @Override
  @Nullable
  public McFunctionCmdScoreboardPlayers getCmdScoreboardPlayers() {
    return findChildByClass(McFunctionCmdScoreboardPlayers.class);
  }

}
