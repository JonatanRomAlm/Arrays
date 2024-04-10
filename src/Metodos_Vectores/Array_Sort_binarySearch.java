package Metodos_Vectores;

import java.util.*;


public class Array_Sort_binarySearch {

	public static void main(String[] args) {
		

		// Se crea el array con los valores inicializados.
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		// Se crea la variable para pedir un numero al usuario
		int n1;
		
		Scanner sc = new Scanner(System.in);
		// Se pide un numero al usuario.
		System.out.println("Introduce un numero");
		n1 = sc.nextInt();
		
		//previamente ordenado con sort con el método binarySearch
		//dándonos la posición de donde se encuentra.
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));//visualiza con tostring los numeros del array.
		int posicion = Arrays.binarySearch(numeros, n1);
		
		// se hace un if que a partir de la posicion 0, el numero introducido muestre en que posicion se encuentra.
		if (posicion >= 0) {
			System.out.println(" El " + n1 + " se encuentra en la poscion " + posicion);
			
		} else {
			System.out.println("El numero " + n1 + " no se encuentra");
		}
		sc.close();
	}

}
