package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class McFunctionElementType extends IElementType {

    public McFunctionElementType(@NotNull @NonNls String debugName) {
        super(debugName, McFunctionLanguage.INSTANCE);
    }

}
