// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface McFunctionCmdTitle extends PsiElement {

  @Nullable
  McFunctionComponentValue getComponentValue();

  @Nullable
  McFunctionTargetSelector getTargetSelector();

  @NotNull
  List<McFunctionTimeValue> getTimeValueList();

}
