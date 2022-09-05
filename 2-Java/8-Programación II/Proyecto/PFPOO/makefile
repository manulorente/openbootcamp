#JAVAC=/home/antonio/Desktop/jdk1.6.0_23/bin/javac
JAVAC=javac
OPCIONES= -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin 
#JAVADOC=/home/antonio/Desktop/jdk1.6.0_23/bin/javadoc


#############################
# Javadoc, empaquetador y
# ejecutor
############################# 

Ejecuta: javadoc
	java -jar ./jar/Main.jar Rutinas.txt Clientes.txt

javadoc: Main.jar 
		javadoc  -encoding ISO-8859-1  -charset "UTF-8" -classpath ./bin -d ./doc -sourcepath ./src \
                 ./src/fp2/poo/pfpoomanloralm/*.java   \
                 ./src/fp2/poo/utilidades/Excepciones/*.java  \
		 ./src/fp2/poo/utilidades/*.java	\
		 ./src/fp2/poo/principal/*.java

Main.jar:	\
	./bin/fp2/poo/principal/Main.class	\
	./bin/fp2/poo/pfpoomanloralm/Cliente.class	\
	./bin/fp2/poo/pfpoomanloralm/CorreoElectronico.class	\
	./bin/fp2/poo/pfpoomanloralm/Dni.class	\
	./bin/fp2/poo/pfpoomanloralm/Domicilio.class	\
	./bin/fp2/poo/pfpoomanloralm/Gimnasio.class	\
	./bin/fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.class	\
	./bin/fp2/poo/pfpoomanloralm/Telefono.class	\
	./bin/fp2/poo/utilidades/ClienteInterfaz.class	\
	./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class	\
	./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class	\
	./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class	\
	./bin/fp2/poo/utilidades/DniInterfaz.class	\
	./bin/fp2/poo/utilidades/DomicilioInterfaz.class	\
	./bin/fp2/poo/utilidades/GimnasioInterfaz.class	\
	./bin/fp2/poo/utilidades/IteracionClientes.class	\
	./bin/fp2/poo/utilidades/IteracionRutinas.class	\
	./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class	\
	./bin/fp2/poo/utilidades/TelefonoInterfaz.class	\
	./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
	./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class \
	./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
	./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class 

		jar cvfe ./jar/Main.jar fp2.poo.principal.Main 	\
			-C ./bin ./fp2/poo/principal/Main.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/Cliente.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/CorreoElectronico.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/Dni.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/Domicilio.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/Gimnasio.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.class	\
			-C ./bin ./fp2/poo/pfpoomanloralm/Telefono.class	\
			-C ./bin ./fp2/poo/utilidades/ClienteInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/CorreoElectronicoInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/DatosDeClientesEntrada.class	\
			-C ./bin ./fp2/poo/utilidades/DatosDeRutinasEntrada.class	\
			-C ./bin ./fp2/poo/utilidades/DniInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/DomicilioInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/GimnasioInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/IteracionClientes.class	\
			-C ./bin ./fp2/poo/utilidades/IteracionRutinas.class	\
			-C ./bin ./fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/TelefonoInterfaz.class	\
			-C ./bin ./fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
			-C ./bin ./fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class \
			-C ./bin ./fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
			-C ./bin ./fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class


#############################
# Main.java
# 
#############################             
./bin/fp2/poo/principal/Main.class:                         \
            ./bin/fp2/poo/utilidades/GimnasioInterfaz.class \
            ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
            ./bin/fp2/poo/pfpoomanloralm/Gimnasio.class           \
            ./src/fp2/poo/principal/Main.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/principal/Main.java 

#############################
# Gimnasio.java
# 
#############################             
./bin/fp2/poo/pfpoomanloralm/Gimnasio.class:  \
            ./src/fp2/poo/pfpoomanloralm/Gimnasio.java \
            ./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class \
            ./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class \
            ./bin/fp2/poo/utilidades/GimnasioInterfaz.class \
            ./bin/fp2/poo/utilidades/DniInterfaz.class \
            ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class \
            ./bin/fp2/poo/utilidades/TelefonoInterfaz.class \
            ./bin/fp2/poo/utilidades/ClienteInterfaz.class \
            ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/Gimnasio.java

#############################
# GimnasioInterfaz.java                   
# 
#############################
./bin/fp2/poo/utilidades/GimnasioInterfaz.class: \
                       ./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class\
                       ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                       ./bin/fp2/poo/utilidades/ClienteInterfaz.class \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class \
                       ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class \
                       ./src/fp2/poo/utilidades/GimnasioInterfaz.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/GimnasioInterfaz.java

#############################
# DatosDeClientesEntrada.java
# 
#############################
./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class:       \
      ./src/fp2/poo/utilidades/DatosDeClientesEntrada.java   \
      ./bin/fp2/poo/utilidades/IteracionClientes.class \
      ./bin/fp2/poo/pfpoomanloralm/Cliente.class            \
      ./bin/fp2/poo/pfpoomanloralm/Dni.class                \
      ./bin/fp2/poo/pfpoomanloralm/Telefono.class                \
      ./bin/fp2/poo/pfpoomanloralm/Domicilio.class          \
      ./bin/fp2/poo/pfpoomanloralm/CorreoElectronico.class  \
      ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class \
      ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
      ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DatosDeClientesEntrada.java

#############################
# IteracionClientes.java
# 
#############################
./bin/fp2/poo/utilidades/IteracionClientes.class: ./src/fp2/poo/utilidades/IteracionClientes.java \
                         ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                         ./bin/fp2/poo/utilidades/ClienteInterfaz.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/IteracionClientes.java


#############################
# ClienteInterfaz.java
# 
#############################
./bin/fp2/poo/utilidades/ClienteInterfaz.class: \
                       ./bin/fp2/poo/utilidades/DomicilioInterfaz.class \
                       ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class \
                       ./bin/fp2/poo/utilidades/TelefonoInterfaz.class \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class \
                       ./src/fp2/poo/utilidades/ClienteInterfaz.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/ClienteInterfaz.java


#############################
# OperacionNoPermitidaExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class: \
                         ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java


#############################
# Telefono.java
# depende de su interfaz Telefono.java 
#############################
./bin/fp2/poo/pfpoomanloralm/Telefono.class: \
                         ./src/fp2/poo/pfpoomanloralm/Telefono.java \
                         ./bin/fp2/poo/utilidades/TelefonoInterfaz.class \
                         ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/Telefono.java

#############################
# Cliente.java
# 
#############################
./bin/fp2/poo/pfpoomanloralm/Cliente.class:                                     \
                          ./bin/fp2/poo/utilidades/DniInterfaz.class       \
                          ./bin/fp2/poo/utilidades/DomicilioInterfaz.class \
                          ./bin/fp2/poo/utilidades/ClienteInterfaz.class   \
                          ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class\
                          ./src/fp2/poo/pfpoomanloralm/Cliente.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/Cliente.java



#############################
# DatosDeRutinasEntrada.java
# 
#############################
./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class: ./src/fp2/poo/utilidades/DatosDeRutinasEntrada.java \
                        ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                        ./bin/fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.class\
                        ./bin/fp2/poo/utilidades/IteracionRutinas.class 
	$(JAVAC) $(OPCIONES)  ./src/fp2/poo/utilidades/DatosDeRutinasEntrada.java

#############################
# RutinaEntrenamiento.java
# 
#############################	
./bin/fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.class:  \
                         ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class\
                         ./src/fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/RutinaDeEntrenamiento.java

#############################
# RutinaEntrenamientoInterfaz.java
# 
#############################	
./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class:  \
                         ./src/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.java


#############################
# IteracionRutinas.java
# 
#############################
./bin/fp2/poo/utilidades/IteracionRutinas.class: ./src/fp2/poo/utilidades/IteracionRutinas.java \
                         ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                         ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/IteracionRutinas.java

#############################
# CorreoElectronico.java
# depende de su interfaz CorreoElectronico.java 
#############################
./bin/fp2/poo/pfpoomanloralm/CorreoElectronico.class: \
                       ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class\
                       ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
                       ./src/fp2/poo/pfpoomanloralm/CorreoElectronico.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/CorreoElectronico.java

#############################
# CorreoElectronicoInterfaz.java
# depende de su interfaz CorreoElectronicoIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class: \
                       ./src/fp2/poo/utilidades/CorreoElectronicoInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/CorreoElectronicoInterfaz.java

#############################
# CorreoElectronicoIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class: \
                       ./src/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.java


#############################
# Dni.java
# depende de su interfaz DniIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/pfpoomanloralm/Dni.class: \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class\
                       ./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class \
                       ./src/fp2/poo/pfpoomanloralm/Dni.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/Dni.java


#############################
# DniInterfaz.java
# depende de su interfaz DniIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/DniInterfaz.class: \
                       ./src/fp2/poo/utilidades/DniInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DniInterfaz.java


#############################
# DniIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class: \
                             ./src/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.java





#############################
# TelefonoInterfaz.java
# depende de su interfaz TelefonoIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/TelefonoInterfaz.class: \
                       ./src/fp2/poo/utilidades/TelefonoInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/TelefonoInterfaz.java

#############################
# TelefonoIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class: \
                             ./src/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.java


#############################
# Domicilio.java
# 
#############################
./bin/fp2/poo/pfpoomanloralm/Domicilio.class:  \
                         ./bin/fp2/poo/utilidades/DomicilioInterfaz.class  \
                         ./src/fp2/poo/pfpoomanloralm/Domicilio.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoomanloralm/Domicilio.java


#############################
# DomicilioInterfaz.java
# 
#############################
./bin/fp2/poo/utilidades/DomicilioInterfaz.class: ./src/fp2/poo/utilidades/DomicilioInterfaz.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DomicilioInterfaz.java



