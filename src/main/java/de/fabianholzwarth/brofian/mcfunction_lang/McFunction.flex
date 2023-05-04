// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package de.fabianholzwarth.brofian.mcfunction_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.fabianholzwarth.brofian.mcfunction_lang.psi.McFunctionTypes;

%%

%class McFunctionLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
END_OF_LINE_COMMENT=("#")[^\r\n]*

STRING=\"(.*)\"
COORDINATE=(-?\d|\~(-\d)?|\^(-\d)?)(\d+(\.\d)?)?

COMMAND=say|fill|setblock|scoreboard
SELECTOR=([a-zA-Z0-9\-\_]+)|(@[a,e,r,p,s](\[.*\])?)
IDENTIFIER=[a-zA-Z0-9\-\_]+:[a-zA-Z0-9\-\_]+
OPERATOR=<|>|<=|>=|matches|%=|\*=|-=|\+=|\/=

%state WAITING_VALUE

%%

<YYINITIAL>
{
    {END_OF_LINE_COMMENT}     { yybegin(YYINITIAL); return McFunctionTypes.COMMENT; }
    {COORDINATE}              { return McFunctionTypes.COORDINATE; }
    {COMMAND}                 { return McFunctionTypes.COMMAND; }
    {SELECTOR}                { return McFunctionTypes.SELECTOR; }
    {IDENTIFIER}              { return McFunctionTypes.IDENTIFIER; }
    {OPERATOR}                { return McFunctionTypes.OPERATOR; }
}

<YYINITIAL> {WHITE_SPACE}                                   { return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }