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
  public McFunctionCmdExecute getCmdExecute() {
    return findChildByClass(McFunctionCmdExecute.class);
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
  public McFunctionCmdHelp getCmdHelp() {
    return findChildByClass(McFunctionCmdHelp.class);
  }

  @Override
  @Nullable
  public McFunctionCmdItem getCmdItem() {
    return findChildByClass(McFunctionCmdItem.class);
  }

  @Override
  @Nullable
  public McFunctionCmdJfr getCmdJfr() {
    return findChildByClass(McFunctionCmdJfr.class);
  }

  @Override
  @Nullable
  public McFunctionCmdKick getCmdKick() {
    return findChildByClass(McFunctionCmdKick.class);
  }

  @Override
  @Nullable
  public McFunctionCmdKill getCmdKill() {
    return findChildByClass(McFunctionCmdKill.class);
  }

  @Override
  @Nullable
  public McFunctionCmdList getCmdList() {
    return findChildByClass(McFunctionCmdList.class);
  }

  @Override
  @Nullable
  public McFunctionCmdLocate getCmdLocate() {
    return findChildByClass(McFunctionCmdLocate.class);
  }

  @Override
  @Nullable
  public McFunctionCmdLoot getCmdLoot() {
    return findChildByClass(McFunctionCmdLoot.class);
  }

  @Override
  @Nullable
  public McFunctionCmdMe getCmdMe() {
    return findChildByClass(McFunctionCmdMe.class);
  }

  @Override
  @Nullable
  public McFunctionCmdMsg getCmdMsg() {
    return findChildByClass(McFunctionCmdMsg.class);
  }

  @Override
  @Nullable
  public McFunctionCmdOp getCmdOp() {
    return findChildByClass(McFunctionCmdOp.class);
  }

  @Override
  @Nullable
  public McFunctionCmdPardon getCmdPardon() {
    return findChildByClass(McFunctionCmdPardon.class);
  }

  @Override
  @Nullable
  public McFunctionCmdPardonIp getCmdPardonIp() {
    return findChildByClass(McFunctionCmdPardonIp.class);
  }

  @Override
  @Nullable
  public McFunctionCmdParticle getCmdParticle() {
    return findChildByClass(McFunctionCmdParticle.class);
  }

  @Override
  @Nullable
  public McFunctionCmdPlace getCmdPlace() {
    return findChildByClass(McFunctionCmdPlace.class);
  }

  @Override
  @Nullable
  public McFunctionCmdPlaySound getCmdPlaySound() {
    return findChildByClass(McFunctionCmdPlaySound.class);
  }

  @Override
  @Nullable
  public McFunctionCmdPublish getCmdPublish() {
    return findChildByClass(McFunctionCmdPublish.class);
  }

  @Override
  @Nullable
  public McFunctionCmdRecipe getCmdRecipe() {
    return findChildByClass(McFunctionCmdRecipe.class);
  }

  @Override
  @Nullable
  public McFunctionCmdReload getCmdReload() {
    return findChildByClass(McFunctionCmdReload.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSaveAll getCmdSaveAll() {
    return findChildByClass(McFunctionCmdSaveAll.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSaveOff getCmdSaveOff() {
    return findChildByClass(McFunctionCmdSaveOff.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSaveOn getCmdSaveOn() {
    return findChildByClass(McFunctionCmdSaveOn.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSay getCmdSay() {
    return findChildByClass(McFunctionCmdSay.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSchedule getCmdSchedule() {
    return findChildByClass(McFunctionCmdSchedule.class);
  }

  @Override
  @Nullable
  public McFunctionCmdScoreboard getCmdScoreboard() {
    return findChildByClass(McFunctionCmdScoreboard.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSeed getCmdSeed() {
    return findChildByClass(McFunctionCmdSeed.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSetBlock getCmdSetBlock() {
    return findChildByClass(McFunctionCmdSetBlock.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSetIdleTimeout getCmdSetIdleTimeout() {
    return findChildByClass(McFunctionCmdSetIdleTimeout.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSetWorldSpawn getCmdSetWorldSpawn() {
    return findChildByClass(McFunctionCmdSetWorldSpawn.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSpawnPoint getCmdSpawnPoint() {
    return findChildByClass(McFunctionCmdSpawnPoint.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSpectate getCmdSpectate() {
    return findChildByClass(McFunctionCmdSpectate.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSpreadPlayers getCmdSpreadPlayers() {
    return findChildByClass(McFunctionCmdSpreadPlayers.class);
  }

  @Override
  @Nullable
  public McFunctionCmdStop getCmdStop() {
    return findChildByClass(McFunctionCmdStop.class);
  }

  @Override
  @Nullable
  public McFunctionCmdStopSound getCmdStopSound() {
    return findChildByClass(McFunctionCmdStopSound.class);
  }

  @Override
  @Nullable
  public McFunctionCmdSummon getCmdSummon() {
    return findChildByClass(McFunctionCmdSummon.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTag getCmdTag() {
    return findChildByClass(McFunctionCmdTag.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTeam getCmdTeam() {
    return findChildByClass(McFunctionCmdTeam.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTeamMsg getCmdTeamMsg() {
    return findChildByClass(McFunctionCmdTeamMsg.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTeleport getCmdTeleport() {
    return findChildByClass(McFunctionCmdTeleport.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTellRaw getCmdTellRaw() {
    return findChildByClass(McFunctionCmdTellRaw.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTime getCmdTime() {
    return findChildByClass(McFunctionCmdTime.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTitle getCmdTitle() {
    return findChildByClass(McFunctionCmdTitle.class);
  }

  @Override
  @Nullable
  public McFunctionCmdTrigger getCmdTrigger() {
    return findChildByClass(McFunctionCmdTrigger.class);
  }

  @Override
  @Nullable
  public McFunctionCmdWeather getCmdWeather() {
    return findChildByClass(McFunctionCmdWeather.class);
  }

  @Override
  @Nullable
  public McFunctionCmdWhitelist getCmdWhitelist() {
    return findChildByClass(McFunctionCmdWhitelist.class);
  }

  @Override
  @Nullable
  public McFunctionCmdWorldBorder getCmdWorldBorder() {
    return findChildByClass(McFunctionCmdWorldBorder.class);
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
