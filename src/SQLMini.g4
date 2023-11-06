// SQLmini.g4

grammar SQLMini;

// Reglas parser
query: SELECT (ID | '*') (COMMA (ID | '*'))* FROM ID (WHERE condition)? (ORDER ID orderDirection?)?;
orderDirection: ASC | DESC;
condition: expression ((AND | OR) expression)*;
expression: LPAREN condition RPAREN | NOT expression | ID (GT | GTE | LT | LTE) (NUMBER | STRING) | ID;


// Reglas lexer
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ORDER: 'ORDER BY';
ASC: 'ASC';
DESC: 'DESC';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
STRING: '\'' ~ '\''* '\'';