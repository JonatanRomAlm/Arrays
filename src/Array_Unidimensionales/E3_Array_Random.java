package Array_Unidimensionales;

import java.util.*;
/*
 *  - Crea una clase ArrayRandom que defina un array de 10 números enteros inicializados a 0. 
	Crea un bucle que inicialice los valores del array usando números aleatorios de 0 a 25. Luego 
	crea otro bucle que si encuentra el número 15 en algún elemento salga del bucle y muestre 
	la posición en la que está. 
 */

public class E3_Array_Random {

	public static void main(String[] args) {

		// Crear Array inicializado en 0
				int [] enteros = new int [10];
				
		// Iniciar metodo.
				numAleatorio(enteros);	
				numQuince(enteros);
			}
			
			
			/*
			 *  Metodo para crear 10 numeros aleatorios de 0 hasta 25 
			 *  e inicialice los valores del array.
			 */
			
			public static void numAleatorio( int [] enteros) {
					
				
				Random rd = new Random();
				System.out.println(" Dame 10 numeros aleatorios");
				
				for (int i = 0; i < enteros.length; i++) {
				
					enteros[i] = rd.nextInt(0,25);
					System.out.print(enteros[i]+ " ");
						
				}
				
			}
			
			/*
			 *  Método para buscar el número 15 en el array 
			 *  y mostrar su posición si se encuentra.
			 */
			
			public static void numQuince( int [] enteros) {
		        for (int i = 0; i < enteros.length; i++) {
		            if (enteros[i] == 15) {
		            	System.out.println(" ");
		                System.out.println("¡CORRECTO! número 15 en la posición " + i);
		                break;  // Sale del bucle al encontrar el número 15
		            }
		        }
		    }
		}


