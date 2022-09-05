#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#


CLASE=MatrizBidimensional
RUTACLASE=fp2/poo/matrices/

DIRSRC=./src/
DIRBIN=./bin/
DIRJAR=./jar/
PRINCIPAL=fp2.poo.matrices.Bidimensional


ejecutaJ: $(DIRJAR)$(CLASE).jar
	java -jar $(DIRJAR)$(CLASE).jar

$(DIRJAR)$(CLASE).jar: ./bin/fp2/poo/matrices/MatrizBidimensional.class
	jar cvfe  $(DIRJAR)$(CLASE).jar $(PRINCIPAL)  -C  $(DIRBIN)  $(RUTACLASE)$(CLASE).class -C  $(DIRBIN)  $(RUTACLASE)Bidimensional.class


./bin/fp2/poo/matrices/MatrizBidimensional.class: ./src/fp2/poo/matrices/MatrizBidimensional.java
	javac -g -Xlint -encoding ISO-8859-1 -d $(DIRBIN) ./src/fp2/poo/matrices/MatrizBidimensional.java

