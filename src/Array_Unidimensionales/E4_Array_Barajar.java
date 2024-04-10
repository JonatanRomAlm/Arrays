package Array_Unidimensionales;

import java.util.*;
/*
 * Crea una clase ArrayBarajar que defina un array de 10 números enteros inicializados a 0 y 
	luego en un bucle solicite al usuario que introduzca cada elemento. En un bucle muestra en 
	pantalla todos los elementos en una sola línea. Luego crea otro bucle para barajar los 
	elementos usando el método Random con los índices (debes obtener dos índices), de tal 
	forma que intercambies el contenido del array para ese índice con el otro.

 */


public class E4_Array_Barajar {

	public static void main(String[] args) {

		// Crear Array inicializado en 0.
				int [] barajar = new int [10];
				
		// Iniciar metodos.		
				introElemento(barajar);
				mostrarLinea(barajar);
				barajarElementos(barajar);
			}
		// Se pone el Scanner en static fuera del metodo
				static	Scanner sc = new Scanner(System.in);
				
		// Metodo para pedir al usuario que introduzca hasta 10 elementos.		
			public static void introElemento (int [] barajar) {
					//Scanner sc = new Scanner(System.in);
					for (int i = 0; i < barajar.length; i++) {
						System.out.println(" Introduce un numero " + (i +1));
						barajar[i] = sc.nextInt();
					}
				}
		// Metodo para mostrar en una sola linea los elementos.		
			public static void mostrarLinea (int [] barajar) {
						System.out.print("Mostrar en linea : ");
					for (int numero : barajar) {
						System.out.print(numero + " ");
						
				}
					System.out.println(" ");
			}
		/*
		 *  Metodo para barajar los elementos utilizando el metodo Random
		 *  con 2 indices, intercambiarlos y mostrarlos en una sola linea.
		 */
			public static void barajarElementos (int [] barajar) {
				
				System.out.print("Intercambiar numeros: ");
					Random rd = new Random();
					
				for (int i = 0; i < barajar.length; i++) {
					
					int indice1 = rd.nextInt(barajar.length);
					int indice2 = rd.nextInt(barajar.length);
						
			// Intercambiar los elementos.	
					
					int temp = barajar[indice1];
					barajar[indice1] = barajar[indice2];
					barajar[indice2] = temp;
					System.out.print(temp + " ");
					
				}
			}
			
		}
	
