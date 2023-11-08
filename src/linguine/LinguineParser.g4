parser grammar LinguineParser;

options {
        tokenVocab=LinguineLexer;
        language=Java;}

// Reglas parser

program: (statement|comment|NL)+;

comment: COMMENT_OPEN COMMENT_TEXT* COMMENT_END;


// Statements (including both inner and outer statements).
statement: statement SEMICOLON // Wrapping with semicolon for outer statements. 
        | expression
        | assignment
        | ifStatement
        | matchStatement
        | function
        | showStatement;

// Assignments
assignment: LET assignment
        | ID EQ expression
        | ID EQ function
        | ID EQ ifStatement;

// If statements
ifStatement: IF LPAREN condition RPAREN THEN statement ELSE statement;
condition: expression BOOLOP expression;

// Match statements
matchStatement: MATCH ID WITH (NL)? matchCases;
matchCases: (PIPE matchCase| PIPE matchCase NL)*;
matchCase: expression ARROW expression;

// Function definitions
function: FUN ID LPAREN (ID (COMMA ID)*)? RPAREN ARROW statement;

// Show statements
showStatement: SHOW expression;

// Expressions
expression: expression WS
        | WS expression
        | ID LPAREN (expression (COMMA expression)*)? RPAREN
        | expression DIV expression
        | expression MUL expression
        | expression MOD expression
        | expression ADD expression
        | expression SUB expression
        | ID ARROW expression // REV
        | LPAREN expression RPAREN
        | SUB expression
        | ID QUESTION // For match statements to make sense.
        | QUESTION // Same as above
        | expression BOOLOP expression
        | NUMBER
        | ID
        | STRING; // String