// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface McFunctionCmdTeleport extends PsiElement {

  @Nullable
  McFunctionCoordinateDouble getCoordinateDouble();

  @NotNull
  List<McFunctionCoordinateTriple> getCoordinateTripleList();

  @NotNull
  List<McFunctionTargetSelector> getTargetSelectorList();

}
