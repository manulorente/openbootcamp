

/*
 *  @(#)Practica4Ejercicio00.c
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Error de ejecución. Division por cero.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
#include <stdio.h>

int main() {
	int d = 0;
	int a = 0;

      a = 42 /d;
      printf("Este codigo no se ejecuta nunca\n");

      return 0;
}

