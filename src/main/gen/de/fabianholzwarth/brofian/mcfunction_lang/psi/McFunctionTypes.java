// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.impl.*;

public interface McFunctionTypes {

  IElementType CMD_ADVANCEMENT = new McFunctionElementType("CMD_ADVANCEMENT");
  IElementType CMD_ATTRIBUTE = new McFunctionElementType("CMD_ATTRIBUTE");
  IElementType CMD_BAN = new McFunctionElementType("CMD_BAN");
  IElementType CMD_BOSS_BAR = new McFunctionElementType("CMD_BOSS_BAR");
  IElementType CMD_CLEAR = new McFunctionElementType("CMD_CLEAR");
  IElementType CMD_CLONE = new McFunctionElementType("CMD_CLONE");
  IElementType CMD_DAMAGE = new McFunctionElementType("CMD_DAMAGE");
  IElementType CMD_DATA = new McFunctionElementType("CMD_DATA");
  IElementType CMD_DATA_PACK = new McFunctionElementType("CMD_DATA_PACK");
  IElementType CMD_DATA_TARGET = new McFunctionElementType("CMD_DATA_TARGET");
  IElementType CMD_DEBUG = new McFunctionElementType("CMD_DEBUG");
  IElementType CMD_DEFAULT_GAME_MODE = new McFunctionElementType("CMD_DEFAULT_GAME_MODE");
  IElementType CMD_DIFFICULTY = new McFunctionElementType("CMD_DIFFICULTY");
  IElementType CMD_EFFECT = new McFunctionElementType("CMD_EFFECT");
  IElementType CMD_ENCHANT = new McFunctionElementType("CMD_ENCHANT");
  IElementType CMD_EXPERIENCE = new McFunctionElementType("CMD_EXPERIENCE");
  IElementType CMD_FILL = new McFunctionElementType("CMD_FILL");
  IElementType CMD_FILL_BIOME = new McFunctionElementType("CMD_FILL_BIOME");
  IElementType CMD_FORCE_LOAD = new McFunctionElementType("CMD_FORCE_LOAD");
  IElementType CMD_FUNCTION = new McFunctionElementType("CMD_FUNCTION");
  IElementType CMD_GAME_MODE = new McFunctionElementType("CMD_GAME_MODE");
  IElementType CMD_GAME_RULE = new McFunctionElementType("CMD_GAME_RULE");
  IElementType CMD_GIVE = new McFunctionElementType("CMD_GIVE");
  IElementType CMD_HELP = new McFunctionElementType("CMD_HELP");
  IElementType CMD_ITEM = new McFunctionElementType("CMD_ITEM");
  IElementType CMD_ITEM_TARGET = new McFunctionElementType("CMD_ITEM_TARGET");
  IElementType CMD_JFR = new McFunctionElementType("CMD_JFR");
  IElementType CMD_KICK = new McFunctionElementType("CMD_KICK");
  IElementType CMD_KILL = new McFunctionElementType("CMD_KILL");
  IElementType CMD_LIST = new McFunctionElementType("CMD_LIST");
  IElementType CMD_LOCATE = new McFunctionElementType("CMD_LOCATE");
  IElementType CMD_LOOT = new McFunctionElementType("CMD_LOOT");
  IElementType CMD_LOOT_SOURCE = new McFunctionElementType("CMD_LOOT_SOURCE");
  IElementType CMD_LOOT_TARGET = new McFunctionElementType("CMD_LOOT_TARGET");
  IElementType CMD_ME = new McFunctionElementType("CMD_ME");
  IElementType CMD_MSG = new McFunctionElementType("CMD_MSG");
  IElementType CMD_OP = new McFunctionElementType("CMD_OP");
  IElementType CMD_PARDON = new McFunctionElementType("CMD_PARDON");
  IElementType CMD_PARDON_IP = new McFunctionElementType("CMD_PARDON_IP");
  IElementType CMD_PARTICLE = new McFunctionElementType("CMD_PARTICLE");
  IElementType CMD_PLACE = new McFunctionElementType("CMD_PLACE");
  IElementType CMD_SET_BLOCK = new McFunctionElementType("CMD_SET_BLOCK");
  IElementType COORDINATE_TRIPLE = new McFunctionElementType("COORDINATE_TRIPLE");
  IElementType EXTENDED_IDENTIFIER = new McFunctionElementType("EXTENDED_IDENTIFIER");
  IElementType LINE_ = new McFunctionElementType("LINE_");
  IElementType PLACEHOLDER = new McFunctionElementType("PLACEHOLDER");
  IElementType PROPERTY = new McFunctionElementType("PROPERTY");
  IElementType TARGET_SELECTOR = new McFunctionElementType("TARGET_SELECTOR");
  IElementType UNUSED = new McFunctionElementType("UNUSED");

  IElementType CMDDATA_1_2_4_3_0 = new McFunctionTokenType("cmdData_1_2_4_3_0");
  IElementType COLOR = new McFunctionTokenType("COLOR");
  IElementType COMMAND = new McFunctionTokenType("COMMAND");
  IElementType COMMAND_ARGUMENT = new McFunctionTokenType("COMMAND_ARGUMENT");
  IElementType COMMENT = new McFunctionTokenType("COMMENT");
  IElementType COORDINATE = new McFunctionTokenType("COORDINATE");
  IElementType CRLF = new McFunctionTokenType("CRLF");
  IElementType IDENTIFIER = new McFunctionTokenType("IDENTIFIER");
  IElementType JSON = new McFunctionTokenType("JSON");
  IElementType NUMBER = new McFunctionTokenType("NUMBER");
  IElementType OPERATOR = new McFunctionTokenType("OPERATOR");
  IElementType SELECTOR = new McFunctionTokenType("SELECTOR");
  IElementType STRING = new McFunctionTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CMD_ADVANCEMENT) {
        return new McFunctionCmdAdvancementImpl(node);
      }
      else if (type == CMD_ATTRIBUTE) {
        return new McFunctionCmdAttributeImpl(node);
      }
      else if (type == CMD_BAN) {
        return new McFunctionCmdBanImpl(node);
      }
      else if (type == CMD_BOSS_BAR) {
        return new McFunctionCmdBossBarImpl(node);
      }
      else if (type == CMD_CLEAR) {
        return new McFunctionCmdClearImpl(node);
      }
      else if (type == CMD_CLONE) {
        return new McFunctionCmdCloneImpl(node);
      }
      else if (type == CMD_DAMAGE) {
        return new McFunctionCmdDamageImpl(node);
      }
      else if (type == CMD_DATA) {
        return new McFunctionCmdDataImpl(node);
      }
      else if (type == CMD_DATA_PACK) {
        return new McFunctionCmdDataPackImpl(node);
      }
      else if (type == CMD_DATA_TARGET) {
        return new McFunctionCmdDataTargetImpl(node);
      }
      else if (type == CMD_DEBUG) {
        return new McFunctionCmdDebugImpl(node);
      }
      else if (type == CMD_DEFAULT_GAME_MODE) {
        return new McFunctionCmdDefaultGameModeImpl(node);
      }
      else if (type == CMD_DIFFICULTY) {
        return new McFunctionCmdDifficultyImpl(node);
      }
      else if (type == CMD_EFFECT) {
        return new McFunctionCmdEffectImpl(node);
      }
      else if (type == CMD_ENCHANT) {
        return new McFunctionCmdEnchantImpl(node);
      }
      else if (type == CMD_EXPERIENCE) {
        return new McFunctionCmdExperienceImpl(node);
      }
      else if (type == CMD_FILL) {
        return new McFunctionCmdFillImpl(node);
      }
      else if (type == CMD_FILL_BIOME) {
        return new McFunctionCmdFillBiomeImpl(node);
      }
      else if (type == CMD_FORCE_LOAD) {
        return new McFunctionCmdForceLoadImpl(node);
      }
      else if (type == CMD_FUNCTION) {
        return new McFunctionCmdFunctionImpl(node);
      }
      else if (type == CMD_GAME_MODE) {
        return new McFunctionCmdGameModeImpl(node);
      }
      else if (type == CMD_GAME_RULE) {
        return new McFunctionCmdGameRuleImpl(node);
      }
      else if (type == CMD_GIVE) {
        return new McFunctionCmdGiveImpl(node);
      }
      else if (type == CMD_HELP) {
        return new McFunctionCmdHelpImpl(node);
      }
      else if (type == CMD_ITEM) {
        return new McFunctionCmdItemImpl(node);
      }
      else if (type == CMD_ITEM_TARGET) {
        return new McFunctionCmdItemTargetImpl(node);
      }
      else if (type == CMD_JFR) {
        return new McFunctionCmdJfrImpl(node);
      }
      else if (type == CMD_KICK) {
        return new McFunctionCmdKickImpl(node);
      }
      else if (type == CMD_KILL) {
        return new McFunctionCmdKillImpl(node);
      }
      else if (type == CMD_LIST) {
        return new McFunctionCmdListImpl(node);
      }
      else if (type == CMD_LOCATE) {
        return new McFunctionCmdLocateImpl(node);
      }
      else if (type == CMD_LOOT) {
        return new McFunctionCmdLootImpl(node);
      }
      else if (type == CMD_LOOT_SOURCE) {
        return new McFunctionCmdLootSourceImpl(node);
      }
      else if (type == CMD_LOOT_TARGET) {
        return new McFunctionCmdLootTargetImpl(node);
      }
      else if (type == CMD_ME) {
        return new McFunctionCmdMeImpl(node);
      }
      else if (type == CMD_MSG) {
        return new McFunctionCmdMsgImpl(node);
      }
      else if (type == CMD_OP) {
        return new McFunctionCmdOpImpl(node);
      }
      else if (type == CMD_PARDON) {
        return new McFunctionCmdPardonImpl(node);
      }
      else if (type == CMD_PARDON_IP) {
        return new McFunctionCmdPardonIpImpl(node);
      }
      else if (type == CMD_PARTICLE) {
        return new McFunctionCmdParticleImpl(node);
      }
      else if (type == CMD_PLACE) {
        return new McFunctionCmdPlaceImpl(node);
      }
      else if (type == CMD_SET_BLOCK) {
        return new McFunctionCmdSetBlockImpl(node);
      }
      else if (type == COORDINATE_TRIPLE) {
        return new McFunctionCoordinateTripleImpl(node);
      }
      else if (type == EXTENDED_IDENTIFIER) {
        return new McFunctionExtendedIdentifierImpl(node);
      }
      else if (type == LINE_) {
        return new McFunctionLine_Impl(node);
      }
      else if (type == PLACEHOLDER) {
        return new McFunctionPlaceholderImpl(node);
      }
      else if (type == PROPERTY) {
        return new McFunctionPropertyImpl(node);
      }
      else if (type == TARGET_SELECTOR) {
        return new McFunctionTargetSelectorImpl(node);
      }
      else if (type == UNUSED) {
        return new McFunctionUnusedImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
