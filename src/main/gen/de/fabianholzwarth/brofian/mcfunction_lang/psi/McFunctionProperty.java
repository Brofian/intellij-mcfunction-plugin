// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface McFunctionProperty extends McFunctionNamedElement {

  @Nullable
  McFunctionCmdAdvancement getCmdAdvancement();

  @Nullable
  McFunctionCmdAttribute getCmdAttribute();

  @Nullable
  McFunctionCmdBan getCmdBan();

  @Nullable
  McFunctionCmdBossBar getCmdBossBar();

  @Nullable
  McFunctionCmdClear getCmdClear();

  @Nullable
  McFunctionCmdClone getCmdClone();

  @Nullable
  McFunctionCmdDamage getCmdDamage();

  @Nullable
  McFunctionCmdData getCmdData();

  @Nullable
  McFunctionCmdDataPack getCmdDataPack();

  @Nullable
  McFunctionCmdDebug getCmdDebug();

  @Nullable
  McFunctionCmdDefaultGameMode getCmdDefaultGameMode();

  @Nullable
  McFunctionCmdDifficulty getCmdDifficulty();

  @Nullable
  McFunctionCmdEffect getCmdEffect();

  @Nullable
  McFunctionCmdEnchant getCmdEnchant();

  @Nullable
  McFunctionCmdExperience getCmdExperience();

  @Nullable
  McFunctionCmdFill getCmdFill();

  @Nullable
  McFunctionCmdFillBiome getCmdFillBiome();

  @Nullable
  McFunctionCmdForceLoad getCmdForceLoad();

  @Nullable
  McFunctionCmdFunction getCmdFunction();

  @Nullable
  McFunctionCmdGameMode getCmdGameMode();

  @Nullable
  McFunctionCmdGameRule getCmdGameRule();

  @Nullable
  McFunctionCmdGive getCmdGive();

  @Nullable
  McFunctionCmdHelp getCmdHelp();

  @Nullable
  McFunctionCmdItem getCmdItem();

  @Nullable
  McFunctionCmdJfr getCmdJfr();

  @Nullable
  McFunctionCmdKick getCmdKick();

  @Nullable
  McFunctionCmdKill getCmdKill();

  @Nullable
  McFunctionCmdList getCmdList();

  @Nullable
  McFunctionCmdLocate getCmdLocate();

  @Nullable
  McFunctionCmdLoot getCmdLoot();

  @Nullable
  McFunctionCmdMe getCmdMe();

  @Nullable
  McFunctionCmdSetBlock getCmdSetBlock();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
