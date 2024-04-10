package Ejecucion_Arrays;

public class Bucle_for_array {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio 1: Crea una clase llamada ArrayMostrar que defina e
			inicialice un array de 10 números enteros y muestre cada elemento
			por medio de un bucle for.
		 */

		int [] mostrar = {0,1,2,3,4,5,6,7,8,9};
		int puntosMayo = mostrar [4];
		
		// Recorrer el bucle con for.
		for (int pos= 0; pos < mostrar.length; pos++) {
			System.out.println(" el valor que hay en la posicion " + pos + " es " + mostrar[pos]);
					
		}
			System.out.println(puntosMayo);
	}

}
