package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import de.fabianholzwarth.brofian.mcfunction_lang.parser.McFunctionParser;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionFile;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTokenSets;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;
import org.jetbrains.annotations.NotNull;

public class McFunctionParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(McFunctionLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new McFunctionLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return McFunctionTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new McFunctionParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new McFunctionFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return McFunctionTypes.Factory.createElement(node);
    }


}
