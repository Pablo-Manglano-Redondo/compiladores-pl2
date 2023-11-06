#!/bin/bash

# Take the first positional argument as the input file

input_grammar=$1

# Add 'Parser.g4' to the end of the input grammar
parser="$input_grammar"Parser.g4"" 
lexer="$input_grammar"Lexer.g4"" 

echo $parser
echo $lexer

entry_point=$2

antlr4-parse $parser $lexer $entry_point -tokens -gui