package Metodos_Vectores;

import java.util.*;

/*
 * Crea una clase ArraySort que defina un array
de 10 números enteros inicializados a 0 y
luego en un bucle solicite al usuario que
introduzca cada elemento.
Luego crea otro bucle que determine si en el
array hay algún elemento repetido. Con uno
repetido que encuentre vale.

 */


public class Array_Sort_Elemento_Repetido {

	public static void main(String[] args) {
	
		// Crear array de 10 posiciones inicializado en 0.
				int[] aleatorio = new int[10];
				//int[] ale1 = new int [10];
				verificarRepetidos(aleatorio); // LLamar al metodo.

		        Scanner sc = new Scanner(System.in);

		        // Solicitar 10 numeros al usuario
		        for (int i = 0; i < aleatorio.length; i++) {
		            System.out.print("Ingrese el numero " + (i + 1) + ": ");                 
		            
		            aleatorio[i] = sc.nextInt();
		        }

		        // Mostrar números introducidos en orden ascendente.  
		        //Guardar en un for cada numero introducido.
		        Arrays.sort(aleatorio);
		        for (int num : aleatorio) {
		            System.out.print(num + " ");
		        }
		        

		        // Verificar numeros repetidos con el metodo verificarRepetidos.
		        if (verificarRepetidos(aleatorio)) {
		            System.out.println("¡Hay numeros repetidos!");
		        } else {
		            System.out.println("No hay numeros repetidos.");
		        }
		        sc.close();
		    }
		// Metodo para comparar los vectores de 2 arrays y saber si se ha introducido numeros repetidos.
		    public static boolean verificarRepetidos(int[] aleatorio) {
		        for (int i = 0; i < aleatorio.length; i++) {
		            for (int j = i + 1; j < aleatorio.length; j++) {
		                if (aleatorio[i] == aleatorio[j]) {
		                    return true;
		                }
		            }
		        }
		        return false;
		    }
		}