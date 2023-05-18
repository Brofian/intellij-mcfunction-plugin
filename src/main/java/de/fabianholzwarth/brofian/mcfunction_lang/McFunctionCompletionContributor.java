package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;
import org.jetbrains.annotations.NotNull;

public class McFunctionCompletionContributor extends CompletionContributor {

    public McFunctionCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(McFunctionTypes.IDENTIFIER),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        System.out.println(parameters.getCompletionType()); // e.g. "Basic"
                        System.out.println(parameters.getOffset()); // e.g. 403
                        System.out.println(parameters.getPosition()); //e.g. PsiElement(McFunctionTokenType.IDENTIFIER)
                        System.out.println(parameters.getOriginalPosition()); // PsiElement(McFunctionTokenType.COMMAND)

                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }

}
