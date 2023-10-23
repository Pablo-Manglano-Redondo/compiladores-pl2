grammar SQLMini;

// Definición de tokens
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ORDER: 'ORDER BY';
ASC: 'ASC';
DESC: 'DESC';
AND: 'AND';
OR: 'OR';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
EQ: '=';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;

// Reglas de la gramática
query: SELECT select_list FROM table_name (WHERE condition)? (ORDER ORDER_BY_FIELDS)?;
select_list: (ID (COMMA ID)*) | '*';
table_name: ID;
condition: expression ((AND | OR) expression)*;
expression: ID (GT | GTE | LT | LTE | EQ) NUMBER;
ORDER_BY_FIELDS: ID (ASC | DESC)?;

