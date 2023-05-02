package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.IElementType;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class McFunctionTokenType extends IElementType {

    public McFunctionTokenType(@NotNull @NonNls String debugName) {
        super(debugName, McFunctionLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "McFunctionTokenType." + super.toString();
    }

}
