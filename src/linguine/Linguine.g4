// Linguine.g4

// g4 file for the Linguine language.

// Made by:
// Cristian Dorhoi
// Pablo Manglano Redondo
// Sergio Sierra Arquero

grammar Linguine;


// Reglas parser

program: statement+;


// Statements (including both inner and outer statements).
statement: statement SEMICOLON // Wrapping with semicolon for outer statements. 
        | expression
        | assignment
        | ifStatement
        | matchStatement
        | function
        | showStatement;

// Assignments
assignment: LET? ID '=' expression
        | LET? ID '=' function
        | LET? ID '=' ifStatement;

// If statements
ifStatement: IF LPAREN condition RPAREN THEN statement ELSE statement;
condition: expression (GT | LT | GTE | LTE | QUESTION | EEQ | NEQ) expression;

// Match statements
matchStatement: MATCH ID WITH matchCases;
matchCases: (PIPE matchCase)*;
matchCase: expression ARROW expression;

// Function definitions
function: FUN ID LPAREN (ID (COMMA ID)*)? RPAREN ARROW statement;

// Show statements
showStatement: SHOW expression;

// Expressions
expression: NUMBER
        | ID
        | ID LPAREN (expression (COMMA expression)*)? RPAREN
        | STRING // String
        | expression '+' expression
        | expression '-' expression
        | expression '*' expression
        | expression '/' expression
        | expression '%' expression
        | ID ARROW expression // REV
        | LPAREN expression RPAREN
        | MINUS expression
        | ID QUESTION // For match statements to make sense.
        | QUESTION // Same as above
        | expression GT expression
        | expression LT expression
        | expression GTE expression
        | expression EEQ expression
        | expression NEQ expression
        | expression LTE expression;




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
MINUS: '-';
GT: '>';
LT: '<';
EEQ: '==';
NEQ: '!=';
GTE: '>=';
LTE: '<=';
PIPE: '|';

// Ignore spaces, tabs, carriage returns and newlines...
WS: [ \t\r\n]+ -> skip;
