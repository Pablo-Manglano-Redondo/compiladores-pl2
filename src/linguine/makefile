ANTLR_JAR = ../../lib/antlr-4.13.1-complete.jar
BUILD_DIR = ./build/classes/

all: Analyser.class run.sh clean

# Generate run.sh script
run.sh: 
	echo "#!/bin/bash" > run.sh
	echo "java -cp $(ANTLR_JAR):$(BUILD_DIR) Analyser \$$1 \$$2" >> run.sh
	chmod +x run.sh

Analyser.class: Analyser.java LinguineLexer.g4 LinguineParser.g4
	antlr4 Linguine.g4 LinguineLexer.g4 LinguineParser.g4
	javac -cp $(ANTLR_JAR) *.java -d $(BUILD_DIR)

clean:
	mv ./AnalyserListener.java ./AnalyserListener.tmp
	rm -rf ./*Lexer.java ./*Parser.java ./*Listener.java ./*.interp ./*.tokens
	mv ./AnalyserListener.tmp ./AnalyserListener.java
