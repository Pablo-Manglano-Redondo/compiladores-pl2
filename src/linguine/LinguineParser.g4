parser grammar LinguineParser;

options {
    tokenVocab=LinguineLexer;
    language=Java;}

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
assignment: LET? ID EQ expression
        | LET? ID EQ function
        | LET? ID EQ ifStatement;

// If statements
ifStatement: IF LPAREN condition RPAREN THEN statement ELSE statement;
condition: expression BOOLOP expression;

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
        | expression ADD expression
        | expression SUB expression
        | expression MUL expression
        | expression DIV expression
        | expression MOD expression
        | ID ARROW expression // REV
        | LPAREN expression RPAREN
        | SUB expression
        | ID QUESTION // For match statements to make sense.
        | QUESTION // Same as above
        | expression BOOLOP expression;