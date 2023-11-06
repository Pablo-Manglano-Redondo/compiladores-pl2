grammar Linguine;

// Reglas lexer
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
GTE: '>=';
LTE: '<=';
AND: 'AND';
OR: 'OR';
PIPE: '|';

// Reglas parser
program: statement+;

statement: LET ID '=' (NUMBER | ID | expression) SEMICOLON
         | IF LPAREN condition RPAREN THEN statement ELSE statement
         | MATCH ID WITH matchCases
         | FUN ID LPAREN (ID (COMMA ID)*)? ARROW expression SEMICOLON
         | SHOW expression SEMICOLON;

expression: NUMBER
          | ID
          | ID LPAREN (expression (COMMA expression)*)? RPAREN
          | expression '+' expression
          | expression '-' expression
          | expression '*' expression
          | expression '/' expression
          | expression '%' expression
          | ID ARROW expression
          | LPAREN expression RPAREN
          | MINUS expression
          | ID QUESTION
          | expression GT expression
          | expression LT expression
          | expression GTE expression
          | expression LTE expression
          | expression AND expression
          | expression OR expression;

condition: expression (GT | LT | GTE | LTE | QUESTION) expression;

matchCases: matchCase (PIPE matchCase)*;

matchCase: expression ARROW expression;

WS: [ \t\r\n]+ -> skip;
