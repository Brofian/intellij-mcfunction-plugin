package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lang.Language;

public class McFunctionLanguage extends Language {

    public static final McFunctionLanguage INSTANCE = new McFunctionLanguage();

    private McFunctionLanguage() {
        super("McFunction");
    }

}