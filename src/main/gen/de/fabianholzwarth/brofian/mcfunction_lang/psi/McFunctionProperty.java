// This is a generated file. Not intended for manual editing.
package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface McFunctionProperty extends McFunctionNamedElement {

  @Nullable
  McFunctionCmdFill getCmdFill();

  @Nullable
  McFunctionCmdGive getCmdGive();

  @Nullable
  McFunctionCmdSetBlock getCmdSetBlock();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
