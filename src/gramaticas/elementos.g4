grammar elementos;

llamadafuncion: ID PI INT PD;

PI:'(';
PD:')';
ID: [a-zA-Z]+;
INT: [0-9]+;

//keywords
IF:'if'; //siempre al principio de los simbolos terminales

//Identificadores
IDz: [a-zA-Z][a-zA-Z0-9];
IDf: ID_LETRA(ID_LETRA|DIGITO)*;
fragment ID_LETRA:[a-zA-Z]; //como las macros
fragment DIGITO:[0-9];

//numeros
ENTERO: DIGITO+;
FLOTANTES: DIGITO+ '.' DIGITO+  //1. 1.0
        | '.' DIGITO+           //.9 .99
        ;
numeros: ENTERO|FLOTANTES;

//cadenas de caracteres
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];    // \b \t \n \r \" escapar caracteres

//Comentarios
COM_LINEA: '//' .*? '\n' ->skip;
COM_BLOQUE: '/*' .*? '*/' ->skip;

//Espacios en blanco, tabuladores
WS: [\t\n\r]+ ->skip;
