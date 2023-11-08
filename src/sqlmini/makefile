ANTLR_JAR = ../../lib/antlr-4.13.1-complete.jar
BUILD_DIR = ./build/classes/
GRAMMAR = sqlg

all: Analyser.class run.sh clean

# Generate run.sh script
run.sh: 
	echo "#!/bin/bash" > run.sh
	echo "java -cp $(ANTLR_JAR):$(BUILD_DIR) AnalizadorSQL \$$1" >> run.sh
	chmod +x run.sh

Analyser.class: $(GRAMMAR)Lexer.g4 $(GRAMMAR)Parser.g4
	antlr4 $(GRAMMAR)Lexer.g4 $(GRAMMAR)Parser.g4
	javac -cp $(ANTLR_JAR) *.java -d $(BUILD_DIR)

clean:
	mv ./AnalizadorsqlListener.java ./AnalizadorsqlListener.tmp
	rm -rf ./*Lexer.java ./*Parser.java ./*Listener.java ./*.interp ./*.tokens
	mv ./AnalizadorsqlListener.tmp ./AnalizadorsqlListener.java
