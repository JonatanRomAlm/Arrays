package Array_Unidimensionales;

import java.util.*;

public class E2_Array_Primos {

	
	static	Scanner  sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		/*
		 * Crea una clase ArrayPrimos que defina un array de 10 números enteros inicializados a 0 y 
		luego en un bucle solicite al usuario que introduzca cada elemento. Luego crea otro bucle que 
		compruebe que números son primos, los números primos los copiará en otro array de enteros 
		llamado primos.
		 */

				
				//Declarar los arrays en 0.
				 int[] array = new int[10];
				 int[] primos = new int[10];
		        
				// Llamada a los métodos.
				ingresarElementos(array); 
				encontrarPrimos(primos,array);  

		    }
		    // Método para solicitar al usuario que introduzca elementos en el array.
			public static void ingresarElementos(int[]array) {		 
		        System.out.println("Introduce 10 números enteros:");
		        	for (int i = 0; i < array.length; i++) {
		        	System.out.println("Numero " + (i + 1) + ": ");
		            array[i] = sc.nextInt();
		        }
		        sc.close();
		    }

			//Metodo para recorrer el array,encontrar numeros primos y guardarlo en el array de primos.
		    public static void encontrarPrimos(int [] primos, int [] array) {
		        int contadorPrimos = 0;
		        for (int num : array) {
		            if (esPrimo(num)) {
		                primos[contadorPrimos] = num;
		                contadorPrimos++;
		            }
		        }

		        // Muestra los números primos encontrados
		        System.out.println("Números primos encontrados:");
		        for (int i = 0; i < contadorPrimos; i++) {
		            System.out.print(primos[i] + " ");
		        }
		        
		    }
		    // Método para verificar si un número es primo
		    private static boolean esPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }

		        for (int i = 2; i < numero; i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }		
		}
