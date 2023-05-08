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
  @Nullable
  public McFunctionCmdAdvancement getCmdAdvancement() {
    return findChildByClass(McFunctionCmdAdvancement.class);
  }

  @Override
  @Nullable
  public McFunctionCmdAttribute getCmdAttribute() {
    return findChildByClass(McFunctionCmdAttribute.class);
  }

  @Override
  @Nullable
  public McFunctionCmdBan getCmdBan() {
    return findChildByClass(McFunctionCmdBan.class);
  }

  @Override
  @Nullable
  public McFunctionCmdBossBar getCmdBossBar() {
    return findChildByClass(McFunctionCmdBossBar.class);
  }

  @Override
  @Nullable
  public McFunctionCmdClear getCmdClear() {
    return findChildByClass(McFunctionCmdClear.class);
  }

  @Override
  @Nullable
  public McFunctionCmdClone getCmdClone() {
    return findChildByClass(McFunctionCmdClone.class);
  }

  @Override
  @Nullable
  public McFunctionCmdDamage getCmdDamage() {
    return findChildByClass(McFunctionCmdDamage.class);
  }

  @Override
  @Nullable
  public McFunctionCmdData getCmdData() {
    return findChildByClass(McFunctionCmdData.class);
  }

  @Override
  @Nullable
  public McFunctionCmdDataPack getCmdDataPack() {
    return findChildByClass(McFunctionCmdDataPack.class);
  }

  @Override
  @Nullable
  public McFunctionCmdDebug getCmdDebug() {
    return findChildByClass(McFunctionCmdDebug.class);
  }

  @Override
  @Nullable
  public McFunctionCmdDefaultGameMode getCmdDefaultGameMode() {
    return findChildByClass(McFunctionCmdDefaultGameMode.class);
  }

  @Override
  @Nullable
  public McFunctionCmdDifficulty getCmdDifficulty() {
    return findChildByClass(McFunctionCmdDifficulty.class);
  }

  @Override
  @Nullable
  public McFunctionCmdEffect getCmdEffect() {
    return findChildByClass(McFunctionCmdEffect.class);
  }

  @Override
  @Nullable
  public McFunctionCmdEnchant getCmdEnchant() {
    return findChildByClass(McFunctionCmdEnchant.class);
  }

  @Override
  @Nullable
  public McFunctionCmdExperience getCmdExperience() {
    return findChildByClass(McFunctionCmdExperience.class);
  }

  @Override
  @Nullable
  public McFunctionCmdFill getCmdFill() {
    return findChildByClass(McFunctionCmdFill.class);
  }

  @Override
  @Nullable
  public McFunctionCmdFillBiome getCmdFillBiome() {
    return findChildByClass(McFunctionCmdFillBiome.class);
  }

  @Override
  @Nullable
  public McFunctionCmdForceLoad getCmdForceLoad() {
    return findChildByClass(McFunctionCmdForceLoad.class);
  }

  @Override
  @Nullable
  public McFunctionCmdFunction getCmdFunction() {
    return findChildByClass(McFunctionCmdFunction.class);
  }

  @Override
  @Nullable
  public McFunctionCmdGameMode getCmdGameMode() {
    return findChildByClass(McFunctionCmdGameMode.class);
  }

  @Override
  @Nullable
  public McFunctionCmdGameRule getCmdGameRule() {
    return findChildByClass(McFunctionCmdGameRule.class);
  }

  @Override
  @Nullable
  public McFunctionCmdGive getCmdGive() {
    return findChildByClass(McFunctionCmdGive.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSetBlock getCmdSetBlock() {
    return findChildByClass(McFunctionCmdSetBlock.class);
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
