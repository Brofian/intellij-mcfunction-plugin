package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionProperty;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTokenSets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class McFunctionFindUsagesProvider implements FindUsagesProvider {

    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new McFunctionLexerAdapter(),
                McFunctionTokenSets.IDENTIFIERS,
                McFunctionTokenSets.COMMENTS,
                TokenSet.EMPTY);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof McFunctionProperty) {
            return "McFunction property";
        }
        return "";
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof McFunctionProperty) {
            return ((McFunctionProperty) element).getKey();
        }
        return "";
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof McFunctionProperty) {
            return ((McFunctionProperty) element).getKey() +
                    McFunctionAnnotator.McFunction_SEPARATOR_STR +
                    ((McFunctionProperty) element).getValue();
        }
        return "";
    }
}
