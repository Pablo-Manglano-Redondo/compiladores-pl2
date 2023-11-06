grammar Expr;
prog:   ((expr|asignacion) NEWLINE)* ;
asignacion: VARIABLE ':=' expr ;
expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   expr ('<'|'>'|'=='|'!=') expr
    |   INT
    |   '(' expr ')'
    |   OPERACION '(' (expr (','expr)*)? ')'
    |   VARIABLE
    ;
OPERACION: 'cos'|'sen'|'tan' ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
VARIABLE: [a-zA-Z0-9]+;/*<assoc=right> pa que vaya de derecha a izq*/
WS: ' '+ ->skip;


 