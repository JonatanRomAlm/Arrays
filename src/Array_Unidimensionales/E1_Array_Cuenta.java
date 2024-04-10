package Array_Unidimensionales;

import java.util.*;

public class E1_Array_Cuenta {

	public static void main(String[] args) {

		/*
		 * 1-	Crea una clase ArrayCuenta que defina un array de 10 números enteros
		 *  inicializados a 0 y luego llame a un método donde solicite
		 *   al usuario que introduzca cada elemento del array.   
		 *   Después llama a otro método que contabilice el total de números positivos, 
		 *   negativos y 0 del array. 
		 */
		
		// Crear Array inicializado en 0
		int [] entero = new int [10];	
		
		// Iniciar metodo.
		elemento(entero);
		contabilizar(entero);		
	}
	// Definir scanner en static para pedir numero en consola.
		static Scanner sc = new Scanner(System.in);
			
	/*
	 *  Crear metodo que no tiene retorno, donde se pide al usuario que introduzca
	 *   un numero positivo,negativo o cero.
	 */
		private static void elemento(int []entero) {
			
			for (int i = 0; i < entero.length; i++) {
				System.out.println(" Elemento " + (i + 1) + ": ");
				 entero[i] = sc.nextInt();
			}
		}		
	/*
	 *  Crear metodo que no tiene retorno y un for- each que recorra todos los
	 *  indices del vector.
	 */
		private static void contabilizar(int []entero) {
			int positivos = 0;
			int negativos = 0;
			int ceros = 0;
			
			for (int num : entero) {
				
				if (num > 0) {
					positivos++;
					
				}else if(num < 0){
					negativos++;
					
				} else {
					ceros++;
				}
			}
		//Mostrar los resultados
			System.out.println("Total de numeros positivos " + positivos);
			System.out.println("Total de numeros negativos " + negativos);
			System.out.println("Total de ceros  " + ceros);
			sc.close();
		}
		
	}