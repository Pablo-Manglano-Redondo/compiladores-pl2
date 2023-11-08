VER = 1.0.0
ANTLR_JAR = antlr-4.13.1-complete.jar
LIB_DIR = ../../lib/
BUILD_DIR = ./build/classes/
GRAMMAR = Linguine

all: Analyser.class run.sh clean
jar: jargen clean cleanman

# Generate java jarfile with all dependencies
jargen: Analyser.class manifest deflate
	jar cvfm ../../release/Linguine_$(VER).jar MANIFEST.MF -C $(BUILD_DIR) . 

# Generate MANIFEST.MF file taking in account the dependencies
# and the Analyser class location ./build/classes/Analyser.class	
manifest:
	cd $(BUILD_DIR) && echo "Main-Class: Analyser" > ../../MANIFEST.MF

deflate:
	unzip $(LIB_DIR)$(ANTLR_JAR)  -d $(BUILD_DIR)


# Generate run.sh script
run.sh: 
	echo "#!/bin/bash" > run.sh
	echo "java -cp $(LIB_DIR)$(ANTLR_JAR):$(BUILD_DIR) Analyser \$$1 \$$2" >> run.sh
	chmod +x run.sh

Analyser.class: Analyser.java $(GRAMMAR)Lexer.g4 $(GRAMMAR)Parser.g4
	antlr4 $(GRAMMAR)Lexer.g4 $(GRAMMAR)Parser.g4
	javac -cp $(LIB_DIR)$(ANTLR_JAR) *.java -d $(BUILD_DIR)

clean:
	mv ./AnalyserListener.java ./AnalyserListener.tmp
	rm -rf ./*Lexer.java ./*Parser.java ./*Listener.java ./*.interp ./*.tokens
	mv ./AnalyserListener.tmp ./AnalyserListener.java

cleanman:
	rm -rf MANIFEST.MF build/
	