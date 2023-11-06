lexer grammar LinguineLexer;

// Lexer rules
STRING: '"' (~["\r\n])* '"';
LET: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
MATCH: 'match';
WITH: 'with';
ARROW: '->';
SEMICOLON: ';';
COMMA: ',';
QUESTION: '?';
SHOW: 'show';
FUN: 'fun';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
LPAREN: '(';
RPAREN: ')';
GT: '>';
LT: '<';
EEQ: '==';
NEQ: '!=';
GTE: '>=';
LTE: '<=';
PIPE: '|';
ADD: '+';
MUL: '*';
DIV: '/';
MOD: '%';
TRUE: 'true';
FALSE: 'false';
AND: '&&';
OR: '||';
NOT: '!';
EQ: '=';
SUB: '-';

// Ignore spaces, tabs, carriage returns and newlines...
WS: [ \t\r\n]+ -> skip;
