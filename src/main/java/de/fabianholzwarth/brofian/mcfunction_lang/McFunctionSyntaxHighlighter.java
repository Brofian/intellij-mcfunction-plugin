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


    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("MCFUNCTION_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MCFUNCTION_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    /*
     * custom attributes for mcfunction
     */

    // 1, 2, 4, ..., 64
    public static final TextAttributesKey NUMBER = createTextAttributesKey("MCFUNCTION_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    // 1 2 3 or ~ ~ ~ or 3 ~ ~-1 or ^ ^ ^
    public static final TextAttributesKey COORDINATE = createTextAttributesKey("MCFUNCTION_COORDINATE", DefaultLanguageHighlighterColors.NUMBER);
    // @p or @s or @a or @e or @r
    public static final TextAttributesKey SELECTOR = createTextAttributesKey("MCFUNCTION_SELECTOR", DefaultLanguageHighlighterColors.CLASS_NAME);
    // stone, grass_block, ender_pearl, ...
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("MCFUNCTION_IDENTIFIER", DefaultLanguageHighlighterColors.STRING);
    // < > <= >= matches %= += -= *= /= ^=
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("MCFUNCTION_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);



    /*
     * List of command to build structures on
     */

    public static final TextAttributesKey COMMAND_SETBLOCK = createTextAttributesKey("MCFUNCTION_COMMAND_SETBLOCK", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey COMMAND_FILL = createTextAttributesKey("MCFUNCTION_COMMAND_FILL", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMAND_GIVE = createTextAttributesKey("MCFUNCTION_COMMAND_GIVE", DefaultLanguageHighlighterColors.KEYWORD);


    // execute parts
    public static final TextAttributesKey EXECUTE = createTextAttributesKey("MCFUNCTION_EXECUTE", DefaultLanguageHighlighterColors.KEYWORD);



    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] COORDINATE_KEYS = new TextAttributesKey[]{COORDINATE};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] SELECTOR_KEYS = new TextAttributesKey[]{SELECTOR};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final TextAttributesKey[] COMMAND_SETBLOCK_KEYS = new TextAttributesKey[]{COMMAND_SETBLOCK};
    private static final TextAttributesKey[] COMMAND_FILL_KEYS = new TextAttributesKey[]{COMMAND_FILL};
    private static final TextAttributesKey[] COMMAND_GIVE_KEYS = new TextAttributesKey[]{COMMAND_GIVE};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new McFunctionLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {

        if (tokenType.equals(McFunctionTypes.COMMAND_SETBLOCK)) {
            return COMMAND_SETBLOCK_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.COMMAND_FILL)) {
            return COMMAND_FILL_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.COMMAND_GIVE)) {
            return COMMAND_GIVE_KEYS;
        }


        if (tokenType.equals(McFunctionTypes.SELECTOR)) {
            return SELECTOR_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.COORDINATE)) {
            return COORDINATE_KEYS;
        }
        if (tokenType.equals(McFunctionTypes.NUMBER)) {
            return NUMBER_KEYS;
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
