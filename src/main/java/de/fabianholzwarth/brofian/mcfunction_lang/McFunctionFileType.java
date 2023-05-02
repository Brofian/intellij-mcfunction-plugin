package de.fabianholzwarth.brofian.mcfunction_lang;


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class McFunctionFileType extends LanguageFileType {

    public static final McFunctionFileType INSTANCE = new McFunctionFileType();

    private McFunctionFileType() {
        super(McFunctionLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "McFunction File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Minecraft command file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mcfunction";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return McFunctionIcons.FILE;
    }

}