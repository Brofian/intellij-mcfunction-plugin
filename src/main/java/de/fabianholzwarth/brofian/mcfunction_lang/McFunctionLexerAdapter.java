package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lexer.FlexAdapter;

public class McFunctionLexerAdapter extends FlexAdapter {

    public McFunctionLexerAdapter() {
        super(new McFunctionLexer(null));
    }

}
