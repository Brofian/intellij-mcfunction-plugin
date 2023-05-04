package de.fabianholzwarth.brofian.mcfunction_lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import de.fabianholzwarth.brofian.mcfunction_lang.McFunctionCompletionContributor;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionElementFactory;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionProperty;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;

public class McFunctionPsiImplUtil {

    public static String getKey(McFunctionProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(McFunctionTypes.IDENTIFIER);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to McFunction spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(McFunctionProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(McFunctionTypes.SELECTOR);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(McFunctionProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(McFunctionProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(McFunctionTypes.IDENTIFIER);
        if (keyNode != null) {
            McFunctionProperty property =
                    McFunctionElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(McFunctionProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(McFunctionTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }
    
}
