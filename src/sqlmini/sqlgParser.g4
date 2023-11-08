parser grammar sqlgParser;

options{
    tokenVocab= sqlgLexer;
    language = Java;
}

fichero: (consulta|NEWLINE)+;

consulta: consulta SEMICOLON
        | APAR select CPAR  // Permitimos consultas anidadas.
        | select;

select: (SELECT ((TEXTO (COMA TEXTO)*)|ALL) FROM TEXTO (WHERE expr*)? (ORDER TEXTO DIRECCION)?);

expr:   expr COMPARACION expr
    |   expr AND expr
    |   expr OR expr
    |   INT
    |   FLOTANTES
    |   TEXTO
    |   APAR expr CPAR
    |   COMILLA expr COMILLA
    ;
