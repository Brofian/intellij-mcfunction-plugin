package de.fabianholzwarth.brofian.mcfunction_lang.psi;

import com.intellij.psi.tree.TokenSet;

public interface McFunctionTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(McFunctionTypes.IDENTIFIER);

    TokenSet COMMENTS = TokenSet.create(McFunctionTypes.COMMENT);

}
