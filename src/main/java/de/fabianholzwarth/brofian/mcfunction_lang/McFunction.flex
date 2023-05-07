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
JSON=\{(.*)\}
NUMBER=-?\d+(\.\d+)?
COORDINATE=(-?\d|\~(-\d)?|\^(-\d)?)(\d+(\.\d)?)?
SELECTOR=(@[a,e,r,p,s](\[.*\])?)
IDENTIFIER=([a-zA-Z0-9\-\_#]+:)?[a-zA-Z0-9\-\_\.]+(\[.+\])?
OPERATOR=<|>|<=|>=|matches|%=|\*=|-=|\+=|\/=

COLOR=blue|green|pink|purple|red|white|yellow


COMMANDS = advancement | attribute | ban | bossbar | clear | clone | damage | data | datapack | setblock | fill | give

CONSTANTS=true|false
COMMAND_ADVANCEMENT_ARGS = grant|revoke|everything|from|until|through|only
COMMAND_ATTRIBUTE_ARGS = get|set|base|modifier|remove|add|value|multiply_base|multiply
COMMAND_BOSSBAR_ARGS = add|get|list|remove|max|players|value|visible|set|color|name|style|visible|notched_6|notched_10|notched_12|notched_20|progress
COMMAND_CLONE_ARGS = from|to|replace|masked|force|move|normal|filtered
COMMAND_DAMAGE_ARGS = at|by|from
COMMAND_DATA_ARGS = get|merge|modify|append|prepend|set|remove|insert|block|entity|storage|from|string|value
COMMAND_DATAPACK_ARGS = enable|disable|list|first|last|before|after|available|enabled
COMMAND_FILL_ARGS = destroy|hollow|keep|outline|replace
COMMAND_ARGUMENT =  {CONSTANTS} |
                    {COMMAND_ADVANCEMENT_ARGS} |
                    {COMMAND_ATTRIBUTE_ARGS} |
                    {COMMAND_BOSSBAR_ARGS} |
                    {COMMAND_CLONE_ARGS} |
                    {COMMAND_DAMAGE_ARGS} |
                    {COMMAND_DATA_ARGS} |
                    {COMMAND_DATAPACK_ARGS} |
                    {COMMAND_FILL_ARGS}

%state WAITING_VALUE

%%

<YYINITIAL>
{
    {END_OF_LINE_COMMENT}     { yybegin(YYINITIAL); return McFunctionTypes.COMMENT; }

    {COMMANDS}                { return McFunctionTypes.COMMAND; }
    {COMMAND_ARGUMENT}        {return McFunctionTypes.COMMAND_ARGUMENT; }
    {COLOR}                   {return McFunctionTypes.COLOR; }
    {NUMBER}                  { return McFunctionTypes.NUMBER; }
    {COORDINATE}              { return McFunctionTypes.COORDINATE; }
    {SELECTOR}                { return McFunctionTypes.SELECTOR; }
    {OPERATOR}                { return McFunctionTypes.OPERATOR; }
    {STRING}                  { return McFunctionTypes.STRING; }
    {JSON}                    { return McFunctionTypes.JSON; }
    {IDENTIFIER}              { return McFunctionTypes.IDENTIFIER; }
}

<YYINITIAL> {WHITE_SPACE}                                   { return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }