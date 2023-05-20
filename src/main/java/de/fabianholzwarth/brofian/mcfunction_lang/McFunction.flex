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
WHITE_SPACE=[\ \t\f]
END_OF_LINE_COMMENT=("#")[^\r\n]*

STRING=\"(.*)\"
JSON=\{(.*)\}|\[(.*)\]
TIME=-?\d+[dst]
INT_RANGE=(\d+\.\.)|(\d+\.\.\d+)|(\.\.\d+)
NUMBER=-?\d+(\.\d+)?
SWIZZLE=(x((yz?)?|(zy?)?)) | (y((xz?)?|(zx?)?)) | (z((xy?)?|(yx?)?)) // any subset of {x,y,z} in any order
COORDINATE=(-?\d|\~(-\d)?|\^(-\d)?)(\d+(\.\d)?)?
SELECTOR=(@[a,e,r,p,s](\[.*\])?)
IDENTIFIER=([a-zA-Z0-9\-\_#]+:)?[a-zA-Z0-9\-\_\.]+(\[.+\])?
OPERATOR=<|>|<=|>=|matches|%=|\*=|-=|\+=|\/=

COLOR=black|dark_blue|dark_green|dark_aqua|dark_red|dark_purple|gold|gray|dark_gray|blue|green|aqua|red|light_purple|yellow|white

COMMANDS = advancement | attribute | ban | bossbar | clear | clone | damage | data | datapack | debug | defaultgamemode |
           difficulty | effect | enchant | experience | fill | fillbiome | forceload | function | gamemode | gamerule |
           give | help | item | jfr | kick | kill | list | locate | loot | me | msg | op | pardon | pardon-ip | particle |
           place | playsound | publish | recipe | reload | ride | save-all | save-off | save-on | say | schedule |
           scoreboard | seed | setblock | setidletimeout | setworldspawn | spawnpoint | spectate | spreadplayers | stop |
           stopsound | summon | tag | team | teammsg | teleport | tell | tellraw | time | title | tm | tp |
           trigger | w | weather | whitelist | worldborder | xp

CONSTANTS=true|false
COMMAND_ADVANCEMENT_ARGS = grant|revoke|everything|from|until|through|only
COMMAND_ATTRIBUTE_ARGS = get|set|base|modifier|remove|add|value|multiply_base|multiply
COMMAND_BOSSBAR_ARGS = add|get|list|remove|max|players|value|visible|set|color|name|style|visible|notched_6|notched_10|notched_12|notched_20|progress
COMMAND_CLONE_ARGS = from|to|replace|masked|force|move|normal|filtered
COMMAND_DAMAGE_ARGS = at|by|from
COMMAND_DATA_ARGS = get|merge|modify|append|prepend|set|remove|insert|block|entity|storage|from|string|value
COMMAND_DATAPACK_ARGS = enable|disable|list|first|last|before|after|available|enabled
COMMAND_DEBUG_ARGS = start|stop|function
COMMAND_DEFAULTGAMEMODE_ARGS = survival|creative|adventure|spectator
COMMAND_DIFFICULTY_ARGS = peaceful|easy|normal|hard
COMMAND_EFFECT_ARGS = clear|give|infinite
COMMAND_EXPERIENCE_ARGS = add|set|query|levels|points
COMMAND_FILL_ARGS = destroy|hollow|keep|outline|replace
COMMAND_FILLBIOME_ARGS = replace
COMMAND_FORCELOAD_ARGS = add|remove|all|query
COMMAND_GAMEMODE_ARGS = survival|creative|adventure|spectator
COMMAND_ITEM_ARGS = modify|replace|entity|block|with|from
COMMAND_JFR_ARGS = start|stop
COMMAND_LIST_ARGS = uuids
COMMAND_LOCATE_ARGS = structure|biome|poi
COMMAND_LOOT_ARGS = give|insert|spawn|replace|block|entity|fish|loot|kill|mine|mainhand|offhand
COMMAND_PARTICLE_ARGS = force|normal
COMMAND_PLACE_ARGS = feature|jigsaw|structure|template|none|clockwise_90|counterclockwise_90|180|front_back|left_right
COMMAND_PLAYSOUND_ARGS = master|music|record|weather|block|hostile|neutral|player|ambient|voice
COMMAND_PUBLISH_ARGS = true|false|survival|creative|adventure|spectator
COMMAND_RECIPE_ARGS = give|take|\*
COMMAND_SAVE_ALL_ARGS = flush
COMMAND_SETBLOCK_ARGS = destroy|keep|replace
COMMAND_SPREADPLAYERS_ARGS = under
COMMAND_TAG_ARGS = list|add|remove
COMMAND_TEAM_ARGS = list|add|remove|empty|join|leave|modify|displayName|color|friendlyFire|seeFriendlyInvisibles|nametagVisibility|deathMessageVisibility|
                    collisionRule|prefix|suffix|never|always|hideForOtherTeams|hideForOwnTeam|pushOtherTeams|pushOwnTeam
COMMAND_TELEPORT_ARGS = facing|entity|eyes|feet
COMMAND_TIME_ARGS = add|set|day|night|noon|midnight|query|daytime|gametime|day
COMMAND_TRIGGER_ARGS = add|set
COMMAND_WEATHER_ARGS = clear|rain|thunder
COMMAND_WHITELIST_ARGS = add|remove|list|off|on|reload



// **BEGIN** these will be used separately in another states
COMMAND_SCHEDULE_ARGS = function|clear|append|replace
COMMAND_SCOREBOARD_ARGS = objectives|players|list|add|remove|setdisplay|modify|get|set|reset|enable|operation|ascending|descending|
                            list|sidebar|dummy|belowName|displayname|rendertype|hearts|integer
COMMAND_TITLE_ARGS = clear|reset|title|subtitle|actionbar|times
COMMAND_WORLDBORDER_ARGS = get|add|center|damage|amount|buffer|set|warning|distance|time

COMMAND_EXECUTE_DATA_TYPES = byte|short|int|long|float|double
COMMAND_EXECUTE_MODIFIER_ARGS = align|anchored|as|at|facing|in|on|positioned|rotated|summon|eyes|feet|entity|attacker|controller|leasher|origin|owner|
                                passengers|target|vehicle|over|world_surface|motion_blocking|motion_blocking_no_leaves|ocean_floor
COMMAND_EXECUTE_CONDITION_ARGS = if|unless|biome|block|blocks|data|entity|storage|dimension|loaded|predicate|score|matches|store|result|success|bossbar|storage
// **END** these will be used separately in another states


COMMAND_ARGUMENT =  {COMMAND_ADVANCEMENT_ARGS} |
                    {COMMAND_ATTRIBUTE_ARGS} |
                    {COMMAND_BOSSBAR_ARGS} |
                    {COMMAND_CLONE_ARGS} |
                    {COMMAND_DAMAGE_ARGS} |
                    {COMMAND_DATA_ARGS} |
                    {COMMAND_DATAPACK_ARGS} |
                    {COMMAND_DEBUG_ARGS} |
                    {COMMAND_DEFAULTGAMEMODE_ARGS} |
                    {COMMAND_DIFFICULTY_ARGS} |
                    {COMMAND_EFFECT_ARGS} |
                    {COMMAND_EXPERIENCE_ARGS} |
                    {COMMAND_FILL_ARGS} |
                    {COMMAND_FILLBIOME_ARGS} |
                    {COMMAND_FORCELOAD_ARGS} |
                    {COMMAND_GAMEMODE_ARGS} |
                    {COMMAND_ITEM_ARGS} |
                    {COMMAND_JFR_ARGS} |
                    {COMMAND_LIST_ARGS} |
                    {COMMAND_LOCATE_ARGS} |
                    {COMMAND_LOOT_ARGS} |
                    {COMMAND_PARTICLE_ARGS} |
                    {COMMAND_PLACE_ARGS} |
                    {COMMAND_PLAYSOUND_ARGS} |
                    {COMMAND_PUBLISH_ARGS} |
                    {COMMAND_RECIPE_ARGS} |
                    {COMMAND_SAVE_ALL_ARGS} |
                    {COMMAND_SETBLOCK_ARGS} |
                    {COMMAND_SPREADPLAYERS_ARGS} |
                    {COMMAND_TAG_ARGS} |
                    {COMMAND_TEAM_ARGS} |
                    {COMMAND_TIME_ARGS} |
                    {COMMAND_TRIGGER_ARGS} |
                    {COMMAND_WEATHER_ARGS} |
                    {COMMAND_WHITELIST_ARGS} |
                    {CONSTANTS}

%state EXECUTE_CONTEXT

%state SCHEDULE_CONTEXT
%state SCOREBOARD_CONTEXT
%state TITLE_CONTEXT
%state WORLDBORDER_CONTEXT

%%


<YYINITIAL>
{
    {END_OF_LINE_COMMENT}     { yybegin(YYINITIAL); return McFunctionTypes.COMMENT; }

    schedule                  { yybegin(SCHEDULE_CONTEXT); return McFunctionTypes.COMMAND; }
    scoreboard                { yybegin(SCOREBOARD_CONTEXT); return McFunctionTypes.COMMAND; }
    title                     { yybegin(TITLE_CONTEXT); return McFunctionTypes.COMMAND; }
    worldborder               { yybegin(WORLDBORDER_CONTEXT); return McFunctionTypes.COMMAND; }
    execute                   { yybegin(EXECUTE_CONTEXT); return McFunctionTypes.COMMAND; }
    {COMMANDS}                { return McFunctionTypes.COMMAND; }
    {COMMAND_ARGUMENT}        { return McFunctionTypes.COMMAND_ARGUMENT; }
    {COLOR}                   { return McFunctionTypes.COLOR; }
    {TIME}                    { return McFunctionTypes.TIME; }
    {NUMBER}                  { return McFunctionTypes.NUMBER; }
    {INT_RANGE}               { return McFunctionTypes.INT_RANGE; }
    {COORDINATE}              { return McFunctionTypes.COORDINATE; }
    {SWIZZLE}                 { return McFunctionTypes.SWIZZLE; }
    {SELECTOR}                { return McFunctionTypes.SELECTOR; }
    {OPERATOR}                { return McFunctionTypes.OPERATOR; }
    {STRING}                  { return McFunctionTypes.STRING; }
    {JSON}                    { return McFunctionTypes.JSON; }
    {IDENTIFIER}              { return McFunctionTypes.IDENTIFIER; }

    {WHITE_SPACE}+            { return TokenType.WHITE_SPACE; }
    {CRLF}                    { return TokenType.WHITE_SPACE; }
}

// execute uses the command word "summon" as an argument, so we have to split this into a separate context
<EXECUTE_CONTEXT>
{
    run                       { yybegin(YYINITIAL); return McFunctionTypes.COMMAND_ARGUMENT; }
    {COMMAND_EXECUTE_CONDITION_ARGS}   { return McFunctionTypes.COMMAND_ARGUMENT; }
    {COMMAND_EXECUTE_MODIFIER_ARGS}    { return McFunctionTypes.COMMAND_ARGUMENT; }
    {COMMAND_EXECUTE_DATA_TYPES}       { return McFunctionTypes.COMMAND_ARGUMENT; }
    {TIME}                    { return McFunctionTypes.TIME; }
    {COORDINATE}              { return McFunctionTypes.COORDINATE; }
    {SWIZZLE}                 { return McFunctionTypes.SWIZZLE; }
    {SELECTOR}                { return McFunctionTypes.SELECTOR; }
    {INT_RANGE}               { return McFunctionTypes.INT_RANGE; }
    {OPERATOR}                { return McFunctionTypes.OPERATOR; }
    {NUMBER}                  { return McFunctionTypes.NUMBER; }
    {STRING}                  { return McFunctionTypes.STRING; }
    {JSON}                    { return McFunctionTypes.JSON; }
    {IDENTIFIER}              { return McFunctionTypes.IDENTIFIER; }
    {WHITE_SPACE}+            { return TokenType.WHITE_SPACE; }
    {CRLF}+                   { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}


// schedules use the command words "function" and "clear" as arguments, so we have to split this into a separate context
<SCHEDULE_CONTEXT>
{
    {COMMAND_SCHEDULE_ARGS}   { return McFunctionTypes.COMMAND_ARGUMENT; }
    {TIME}                    { return McFunctionTypes.TIME; }
    {NUMBER}                  { return McFunctionTypes.NUMBER; }
    {IDENTIFIER}              { return McFunctionTypes.IDENTIFIER; }
    {WHITE_SPACE}+            { return TokenType.WHITE_SPACE; }
    {CRLF}+                   { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

// scoreboards use the command word "list" as an argument, so we have to split this into a separate context
<SCOREBOARD_CONTEXT>
{
    {COMMAND_SCOREBOARD_ARGS}   { return McFunctionTypes.COMMAND_ARGUMENT; }
    {SELECTOR}                  { return McFunctionTypes.SELECTOR; }
    {NUMBER}                    { return McFunctionTypes.NUMBER; }
    {OPERATOR}                  { return McFunctionTypes.OPERATOR; }
    {STRING}                    { return McFunctionTypes.STRING; }
    {JSON}                      { return McFunctionTypes.JSON; }
    {IDENTIFIER}                { return McFunctionTypes.IDENTIFIER; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    {CRLF}+                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

// title use the command word "title" as an argument, so we have to split this into a separate context
<TITLE_CONTEXT>
{
    {COMMAND_TITLE_ARGS}        { return McFunctionTypes.COMMAND_ARGUMENT; }
    {SELECTOR}                  { return McFunctionTypes.SELECTOR; }
    {STRING}                    { return McFunctionTypes.STRING; }
    {JSON}                      { return McFunctionTypes.JSON; }
    {IDENTIFIER}                { return McFunctionTypes.IDENTIFIER; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    {CRLF}+                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

// worldborder use the command word "time" as an argument, so we have to split this into a separate context
<WORLDBORDER_CONTEXT>
{
    {COMMAND_WORLDBORDER_ARGS}  { return McFunctionTypes.COMMAND_ARGUMENT; }
    {NUMBER}                    { return McFunctionTypes.NUMBER; }
    {COORDINATE}                { return McFunctionTypes.COORDINATE; }
    {IDENTIFIER}                { return McFunctionTypes.IDENTIFIER; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    {CRLF}+                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }