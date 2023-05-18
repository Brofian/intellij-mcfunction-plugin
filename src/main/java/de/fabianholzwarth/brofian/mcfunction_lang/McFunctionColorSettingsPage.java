package de.fabianholzwarth.brofian.mcfunction_lang;


import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.swing.*;
import java.util.Map;

public class McFunctionColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Command", McFunctionSyntaxHighlighter.COMMAND),
            new AttributesDescriptor("Command argument", McFunctionSyntaxHighlighter.ARGUMENT),
            new AttributesDescriptor("Coordinate", McFunctionSyntaxHighlighter.COORDINATE),
            new AttributesDescriptor("Number", McFunctionSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Duration", McFunctionSyntaxHighlighter.TIME),
            new AttributesDescriptor("Comment", McFunctionSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Operator", McFunctionSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Selector", McFunctionSyntaxHighlighter.SELECTOR),
            new AttributesDescriptor("Identifier", McFunctionSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Swizzle", McFunctionSyntaxHighlighter.SWIZZLE),
            new AttributesDescriptor("Bad value", McFunctionSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return McFunctionIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new McFunctionSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# this is an example of the advancement command\n" +
                "advancement grant @p only something criteria\n" +
                "advancement revoke @a[tag=empty] everything\n" +
                "\n" +
                "# and this is the attribute command\n" +
                "attribute @s minecraft:generic.armor get 1.4\n" +
                "attribute @p minecraft:generic.armor base get 3\n" +
                "attribute @a minecraft:generic.armor base set 5\n" +
                "attribute @r minecraft:generic.armor modifier add afbe30cde3 test-mod 1.03 multiply\n" +
                "\n" +
                "ban playerXYZ \"example message\"\n" +
                "\n" +
                "setblock ~-3 64 ~10 minecraft:dirt\n" +
                "setblock ^ ^ ^3 dirt\n" +
                "\n" +
                "fill ~ ~ ~ ~1 ~2 ~3 minecraft:stone replace minecraft:dirt\n" +
                "\n" +
                "give @p minecraft:stick\n" +
                "give @e[type=player] minecraft:feather 12\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "McFunction";
    }
    
}
