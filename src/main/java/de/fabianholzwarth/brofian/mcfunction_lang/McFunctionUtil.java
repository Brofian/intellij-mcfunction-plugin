package de.fabianholzwarth.brofian.mcfunction_lang;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionFile;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class McFunctionUtil {

    /**
     * Searches the entire project for McFunction language files with instances of the McFunction property with the given key.
     *
     * @param project current project
     * @param key     to check
     * @return matching properties
     */
    public static List<McFunctionProperty> findProperties(Project project, String key) {
        List<McFunctionProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(McFunctionFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            McFunctionFile McFunctionFile = (McFunctionFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (McFunctionFile != null) {
                McFunctionProperty[] properties = PsiTreeUtil.getChildrenOfType(McFunctionFile, McFunctionProperty.class);
                if (properties != null) {
                    for (McFunctionProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<McFunctionProperty> findProperties(Project project) {
        List<McFunctionProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(McFunctionFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            McFunctionFile McFunctionFile = (McFunctionFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (McFunctionFile != null) {
                McFunctionProperty[] properties = PsiTreeUtil.getChildrenOfType(McFunctionFile, McFunctionProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    /**
     * Attempts to collect any comment elements above the McFunction key/value pair.
     */
    public static @NotNull String findDocumentationComment(McFunctionProperty property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String commentText = element.getText().replaceFirst("[!# ]+", "");
                result.add(commentText);
            }
            element = element.getPrevSibling();
        }
        return StringUtil.join(Lists.reverse(result),"\n ");
    }



}
