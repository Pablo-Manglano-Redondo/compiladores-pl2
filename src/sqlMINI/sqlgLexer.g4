lexer grammar sqlgLexer;

AND:'AND';
OR:('OR');                          //Comparadores logicos
COMPARACION:('<'|'>'|'=='|'!='|'>='|'<='|'=');      //Simbolos de comparacion
WS:[\n\r]+ ->skip;                              //Ignorar salto de linea, tabuladores
BL:' '+ ->skip;                                     //Ignorar espacios
SELECT:'SELECT';                                    
FROM:'FROM';
COMA:',';
WHERE:'WHERE';
ORDER:'ORDER BY';
DIRECCION:'ASC'|'DESC';                             //Direccion de order by
TEXTO:[a-zA-Z0-9]+;                                 //Cadenas
ALL:'*';
INT:[0-9]+;                                         //Numeros
FLOTANTES: INT+ '.' INT+;                           //Numeros flotantes
APAR:'(';
CPAR:')';
COMILLA:'’';
