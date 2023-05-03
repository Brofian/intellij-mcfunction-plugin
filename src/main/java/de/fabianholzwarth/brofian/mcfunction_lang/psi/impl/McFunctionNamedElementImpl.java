package de.fabianholzwarth.brofian.mcfunction_lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class McFunctionNamedElementImpl extends ASTWrapperPsiElement implements McFunctionNamedElement {

    public McFunctionNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
