package Array_Unidimensionales;

import java.util.*;

/*
 * Crea un programa que, a partir de un vector de números enteros, halle y muestre el valor más 
	alto que contiene (su máximo) y el valor más bajo que contiene (su mínimo). El programa 
	debe pedir el número de elementos que tendrá el vector y los valores de cada uno de esos 
	elementos. No utilizar el sort.

 */

public class E5_Valor_Maximo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Pedir al usuario que introduzca hasta n elementos.
		        System.out.print("Introduce el número de elementos del vector: ");
		        int numero = sc.nextInt();
		        
		// Crear Array con el numero introducido de elementos anteriormente.
		        int[] vector = new int[numero];

		// Pedir al usuario que introduzca los elementos
		        for (int i = 0; i < vector.length; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            vector[i] = sc.nextInt();
		        }

		// Inicializar las variables para el máximo y el mínimo con el primer elemento del vector
		        int maximo = vector[0];
		        int minimo = vector[0];

		// Encontrar el máximo y el mínimo recorriendo el vector.
		        for (int i = 1; i < vector.length; i++) {
		            if (vector[i] > maximo) {
		                maximo = vector[i];
		            }

		            if (vector[i] < minimo) {
		                minimo = vector[i];
		            }
		        }

		 // Mostrar el resultado del maximo y del minimo.
		        System.out.println("Valor máximo: " + maximo);
		        System.out.println("Valor mínimo: " + minimo);
		        sc.close();
		    }
		}
