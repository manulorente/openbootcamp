#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#

# CLASEPPAL es el nombre de la clase que contiene el metodo principal (main)
CLASEPPAL=Ejercicio01

# CLASEAUX es el nombre de la clase que se esta probando.
CLASEAUX=Calculadora

RUTACLASE=fp2/poo/practica1/


RUTAGUARDARCLASS=bin/

RUTAGUARGARJAR=jar/

PRINCIPAL=fp2.poo.practica1.Ejercicio01

ejecutaJ: $(CLASEPPAL).jar
	java -jar $(CLASEPPAL).jar

$(CLASEPPAL).jar: ./bin/fp2/poo/practica1/Ejercicio01.class ./bin/fp2/poo/practica1/Calculadora.class
	jar cvfe  ./$(RUTAGUARDARJAR)$(CLASEPPAL).jar $(PRINCIPAL) -C ./bin  fp2/poo/practica1/Calculadora.class -C ./bin fp2/poo/practica1/Ejercicio01.class

./bin/fp2/poo/practica1/Ejercicio01.class: ./src/fp2/poo/practica1/Ejercicio01.java ./bin/fp2/poo/practica1/Calculadora.class
	javac -g -Xlint  -encoding ISO-8859-1 -classpath ./bin -d ./bin ./src/fp2/poo/practica1/Ejercicio01.java
	
./bin/fp2/poo/practica1/Calculadora.class: ./src/fp2/poo/practica1/Calculadora.java
	javac -g -Xlint -encoding ISO-8859-1 -d ./bin ./src/fp2/poo/practica1/Calculadora.java





