lexer grammar LinguineLexer;

// Lexer rules
COMMENT_OPEN: '--' -> pushMode(COMMENT);
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

// Boolean operators
AND: '&&'; // Keep correct order of operations AND goes first
BOOLOP: ('==' | '!=' | '<' | '>' | '<=' | '>=' | '||');

PIPE: '|';
ADD: '+';
MUL: '*';
DIV: '/';
MOD: '%';
TRUE: 'true';
FALSE: 'false';
NOT: '!';
EQ: '=';
SUB: '-';

NL: [\r\n]+; // Windows or Unix line endings
// Ignore spaces, tabs, carriage returns and newlines...
WS: ' '+ -> skip;



mode COMMENT;
COMMENT_END: '--' -> popMode;
COMMENT_TEXT: .+?; // Non-greedy match of any character
// Because of this we will have to add it to the comment text
// when defining the comment rule


