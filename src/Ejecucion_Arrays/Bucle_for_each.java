package Ejecucion_Arrays;
import java.util.*;

public class Bucle_for_each {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

/*
 * 	Ejercicio 2: Crea una clase llamada ArrayNombres que defina un array
	de 10 Strings vacíos y luego en un bucle solicite al usuario que
	introduzca cada elemento. Después muestra todos los elementos con
	un bucle for each.

 */
		// Declara Array en String
		String[] nombre = new String [10];
		
		// Solicitar al usuario que introduzca un numero.
		
		for (int pos = 0; pos < nombre.length; pos++) {
			System.out.println("Dame un nombre: " + pos);
			String visualizar = sc.next();
			nombre[pos] = visualizar;
			System.out.println("El nombre es" + "'" + visualizar + "'");

		}
		
		// Recorrer el Array con bucle for- each.
		for ( String visualizar : nombre) {
			
			System.out.println(" El valor del elemento es " + visualizar);
		}
		sc.close();
	}

}
