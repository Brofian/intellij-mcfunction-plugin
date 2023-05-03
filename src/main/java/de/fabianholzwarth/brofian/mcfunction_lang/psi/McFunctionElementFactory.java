package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionFileType;

public class McFunctionElementFactory {

    public static McFunctionProperty createProperty(Project project, String name) {
        McFunctionFile file = createFile(project, name);
        return (McFunctionProperty) file.getFirstChild();
    }

    public static McFunctionFile createFile(Project project, String text) {
        String name = "dummy.mcfunction";
        return (McFunctionFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, McFunctionFileType.INSTANCE, text);
    }

    public static McFunctionProperty createProperty(Project project, String name, String value) {
        final McFunctionFile file = createFile(project, name + " = " + value);
        return (McFunctionProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final McFunctionFile file = createFile(project, "\n");
        return file.getFirstChild();
    }
    
}
