parser grammar sqlgParser;

options{
    tokenVocab= sqlgLexer;
    language = Java;
}

fichero: consulta*;

consulta: SELECT ((TEXTO(COMA TEXTO)*)|ALL) FROM TEXTO (WHERE expr*)? (ORDER TEXTO DIRECCION)?;

expr:   expr COMPARACION expr
    |   expr AND expr
    |   expr OR expr
    |   INT
    |   FLOTANTES
    |   TEXTO
    |   APAR expr CPAR
    |   COMILLA expr COMILLA
    ;
