#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#


CLASE=EjemploMatriz
RUTACLASE=fp2/poo/matrices/

DIRSRC=./src/
DIRBIN=./bin/
DIRJAR=./jar/
PRINCIPAL=fp2.poo.matrices.EjemploMatriz


ejecutaJ: $(DIRJAR)$(CLASE).jar
	java -jar $(DIRJAR)$(CLASE).jar

$(DIRJAR)$(CLASE).jar: $(DIRBIN)$(RUTACLASE)$(CLASE).class
	jar cvfe  $(DIRJAR)$(CLASE).jar $(PRINCIPAL)  -C  $(DIRBIN)  $(RUTACLASE)$(CLASE).class


$(DIRBIN)$(RUTACLASE)$(CLASE).class: $(DIRSRC)$(RUTACLASE)$(CLASE).java
	javac -g -Xlint -d $(DIRBIN) $(DIRSRC)$(RUTACLASE)$(CLASE).java


