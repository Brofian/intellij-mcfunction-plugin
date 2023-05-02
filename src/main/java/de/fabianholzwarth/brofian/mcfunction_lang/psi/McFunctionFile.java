package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionFileType;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionLanguage;
import org.jetbrains.annotations.NotNull;

public class McFunctionFile extends PsiFileBase {

    public McFunctionFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, McFunctionLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return McFunctionFileType.INSTANCE;
    }

    @Override
    @NotNull
    public String toString() {
        return "McFunction File";
    }
}
