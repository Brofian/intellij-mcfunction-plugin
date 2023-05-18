// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface McFunctionCmdExecute extends PsiElement {

  @NotNull
  List<McFunctionCmdExecuteCondition> getCmdExecuteConditionList();

  @NotNull
  List<McFunctionCmdExecuteModifier> getCmdExecuteModifierList();

  @Nullable
  McFunctionProperty getProperty();

}
