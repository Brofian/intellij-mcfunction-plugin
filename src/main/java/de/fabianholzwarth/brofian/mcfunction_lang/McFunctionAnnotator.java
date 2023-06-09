package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionProperty;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class McFunctionAnnotator implements Annotator {

    // Define strings for the McFunction language prefix - used for annotations, line markers, etc.
    public static final String McFunction_PREFIX_STR = "McFunction";
    public static final String McFunction_SEPARATOR_STR = ":";

    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        // Ensure the Psi Element is an expression
        if (!(element instanceof PsiLiteralExpression)) {
            return;
        }

        // Ensure the Psi element contains a string that starts with the prefix and separator
        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
        String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
        if ((value == null) || !value.startsWith(McFunction_PREFIX_STR + McFunction_SEPARATOR_STR)) {
            return;
        }

        // Define the text ranges (start is inclusive, end is exclusive)
        // "McFunction:key"
        //  01234567890
        TextRange prefixRange = TextRange.from(element.getTextRange().getStartOffset(), McFunction_PREFIX_STR.length() + 1);
        TextRange separatorRange = TextRange.from(prefixRange.getEndOffset(), McFunction_SEPARATOR_STR.length());
        TextRange keyRange = new TextRange(separatorRange.getEndOffset(), element.getTextRange().getEndOffset() - 1);

        // highlight "McFunction" prefix and ":" separator
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(prefixRange).textAttributes(DefaultLanguageHighlighterColors.KEYWORD).create();
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(separatorRange).textAttributes(McFunctionSyntaxHighlighter.COMMAND).create();


        // Get the list of properties for given key
        String key = value.substring(McFunction_PREFIX_STR.length() + McFunction_SEPARATOR_STR.length());
        List<McFunctionProperty> properties = McFunctionUtil.findProperties(element.getProject(), key);
        if (properties.isEmpty()) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved property")
                    .range(keyRange)
                    .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                    // ** Tutorial step 18.3 - Add a quick fix for the string containing possible properties
                    .withFix(new McFunctionCreatePropertyQuickFix(key))
                    .create();
        } else {
            // Found at least one property, force the text attributes to McFunction syntax value character
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(keyRange).textAttributes(McFunctionSyntaxHighlighter.COMMAND).create();
        }
    }
    
}
