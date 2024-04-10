package Ejecucion_Arrays;

import java.util.*;

public class E3_ArrayMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Ejercicio 3: Crea una clase llamada ArrayMedia que defina un array de
		10 números decimales float vacíos y luego en un bucle solicite al
		usuario que introduzca cada número. Después mediante un bucle for
		calcula la media aritmética de todos los números.
		 */

		// Declara Array en float
		float [] numero = new float [10];
		
		// Solicitar al usuario que introduzca un numero.
		
		for (int pos = 0; pos < numero.length; pos++) {
			System.out.println(" Dame un numero " + pos);
			float visualizar = sc.nextFloat();
			numero [pos] = visualizar;
			
			
		}
		
		//Crear varible e inicializarla en 0.
		 float suma = 0;
		 
		// Recorrer el Array con bucle for- each.
		 // Crear calculo de suma.
		 for (float visualizar : numero) {
			 suma = suma + visualizar;
			
			
		}
		 //Mostrar por pantalla el resultado
		 System.out.println(" el resultado es: " + suma / numero.length);
	}

}
