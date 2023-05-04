package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class McFunctionSyntaxHighlighter extends SyntaxHighlighterBase {

    /*
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("MCFUNCTION_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("MCFUNCTION_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("MCFUNCTION_VALUE", DefaultLanguageHighlighterColors.STRING);

     */


    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("MCFUNCTION_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MCFUNCTION_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    /*
     * custom attributes for mcfunction
     */


    // setblock, scoreboard, fill, say, ...
    public static final TextAttributesKey COMMAND =
            createTextAttributesKey("MCFUNCTION_COMMAND", DefaultLanguageHighlighterColors.KEYWORD);

    // 1 2 3 or ~ ~ ~ or 3 ~ ~-1 or ^ ^ ^
    public static final TextAttributesKey COORDINATE =
            createTextAttributesKey("MCFUNCTION_COORDINATE", DefaultLanguageHighlighterColors.NUMBER);



    // @p or @s or @a or @e or @r
    public static final TextAttributesKey SELECTOR =
            createTextAttributesKey("MCFUNCTION_SELECTOR", DefaultLanguageHighlighterColors.CLASS_NAME);


    // stone, grass_block, ender_pearl, ...
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("MCFUNCTION_IDENTIFIER", DefaultLanguageHighlighterColors.STRING);

    // < > <= >= matches %= += -= *= /= ^=
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("MCFUNCTION_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    // execute parts
    public static final TextAttributesKey EXECUTE =
            createTextAttributesKey("MCFUNCTION_EXECUTE", DefaultLanguageHighlighterColors.KEYWORD);



    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] COMMAND_KEYS = new TextAttributesKey[]{COMMAND};
    private static final TextAttributesKey[] COORDINATE_KEYS = new TextAttributesKey[]{COORDINATE};
    private static final TextAttributesKey[] SELECTOR_KEYS = new TextAttributesKey[]{SELECTOR};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new McFunctionLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(McFunctionTypes.COMMAND)) {
            return COMMAND_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.SELECTOR)) {
            return SELECTOR_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.COORDINATE)) {
            return COORDINATE_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}
