# PL2 Compiladores | Gramáticas y Generadores Automáticos

## Recursos

- [Web ANTLR](https://www.antlr.org/)
- [Introducción e instalación ANTLR](https://www.youtube.com/watch?v=p_7okCxR-KQ)
- [Solución Ejercicio ANTLR](https://www.youtube.com/watch?v=uF64ZYaVzSc)
- [Notación ANTLR Y Patrones de Lenguajes](https://www.youtube.com/watch?v=GeMNhkKGR3w)
- [Implementación del patrón Comentario e integración en lenguajes](https://www.youtube.com/watch?v=eBGKCrJiqXQ)
- [Recorrido del árbol de análisis Parte1: Creación de la gramática gramática](https://www.youtube.com/watch?v=8YloShXyUpw)
- [Recorrido del árbol de análisis Parte 2: Programa Java](https://www.youtube.com/watch?v=M9Ln7Jsgn64)

## Memoria

La memoria es un template de LaTeX, en el siguiente enlace se encuentra el acceso al OverLeaf (edición colaborativa).

[Link OverLeaf](https://es.overleaf.com/2369829969xtbrwsgwswtp)

## Instalación

- Windows -> Seguir tutorial de los vídeos.
- Linux -> '''pip install antlr4-tools'''

### Extensión para VSCode Studio

Name: ANTLR4 grammar syntax support
Id: mike-lischke.vscode-antlr4
Description: Language support for ANTLR4 grammar files
Version: 2.4.2
Publisher: Mike Lischke
VS Marketplace Link: https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4

## Linguine

### Rasgos generales del lenguaje

Nos encontramos frente a un lenguaje de programación aparentemente **imperativo**. Además, observamos algunas otras características:

- **Tipado dinámico**: No es necesario declarar el tipo de las variables, ya que el lenguaje lo infiere.
- **Terminación de sentencias en ;**: Es necesario terminar las sentencias con un punto y coma.
- **Sentencias unilínea**: Las sentencias se escriben en una sola línea, terminando en **;**, como se mencionaba.

Aunque la sentencia **"match"** es especial, ya que se escribe en varias líneas, termina en **;**, lo que hace que esto sea meramente visual y pueda, de igual modo, ser considerada una sentencia unilínea.

- **No hay bloques de código**: Al tener las sentencias una estructura unilínea, no hay bloques de código, por lo que no hay necesidad de usar llaves **{}** o algún otro tipo de estrategia para delimitarlos.

### Uso potencial del lenguaje

Este lenguaje de programación podría ser usado para la creación de programas que requieran de un alto rendimiento al ser compilado. Además, el lenguaje es de tipado dinámico, lo que hace que sea más fácil de usar y más rápido de programar.

Resultaría bastante intuitivo para programadores que ya hayan usado lenguajes como **Python**, ya que la sintaxis es ciertamente similar.

También podría utilizarse en el ámbito del desarrollo web, ya que el código al tener una estructura tan simple, podría ser fácilmente comprimido como hacen algunos otros lenguajes (webpacks) de **JavaScript**.

### Modo de empleo

Para ejecutar el analizador de este lenguaje, se debe ejecutar el siguiente comando:

(**¡En Linux!**)

1. Compilación del Proyecto

```bash

cd path_to_linguine
make

```

Es MUY importante verificar que las librerías se encuentren según se especifica en el Makefile.

2. Ejecución del Analizador

```bash

cd path_to_linguine
./run.sh path_to_code_file 

```

Este comando devolverá la tabla de símbolos. Si lo que se quiere obtener es el árbol sintáctico (AST) (Formato LISP), se debe añadir el flag **-t** o **--tree** al final del comando.

```bash

./run.sh path_to_code_file -t || ./run.sh path_to_code_file --tree

```

