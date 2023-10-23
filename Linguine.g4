grammar Linguine;

// Definición de tokens
LET: 'let';
IF: 'if';
ELSE: 'else';
FUN: 'fun';
MATCH: 'match';
WITH: 'with';
ARROW: '->';
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;

// Reglas de la gramática
program: statement (SEMICOLON statement)*;
statement: letStatement | ifStatement | funStatement | matchStatement;
letStatement: LET ID '=' expression;
ifStatement: IF LPAREN expression RPAREN THEN statement (ELSE statement)?;
funStatement: FUN ID LPAREN ID (COMMA ID)* RPAREN ARROW expression;
matchStatement: MATCH ID WITH matchCases;
matchCases: (matchCase SEMICOLON)* matchCase;
matchCase: '|' expression ARROW expression;
expression: ID | NUMBER | LPAREN expression RPAREN | expression '+' expression | ... // otras reglas de expresiones

// si ejecutamos este codigo: antlr -Dlanguage=Python3 Linguine.g4
// se  generará archivos como LinguineLexer.py y LinguineParser.py.