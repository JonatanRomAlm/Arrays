package Metodos_Vectores;

import java.util.*;

import java.util.Arrays;

public class Array_Copi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		int [] a = {3,10,5,7,14,20,83};
		
		System.out.println("\nPide al usuario la primera posicion");
		int posicion1 = sc.nextInt();
		System.out.println("\nPide al usuario la posicion final");
		int posicionFinal = sc.nextInt();
		
		int [] b = Arrays.copyOfRange(a, posicion1, posicionFinal);//copia el array la posicion inicial y la final
		System.out.println(Arrays.toString(b));
		
		int [] c = Arrays.copyOf(a, a.length);// Copia el primer en un tercer array.
		System.out.println(Arrays.toString(c));
		
		System.out.println(Arrays.equals(a, c));// Compara los 2 arryas
		
		// pedir al usuario un numero y rellenar todos los elementos con un numero.
		System.out.println("\npedir numero al usuario");
		int numero = sc.nextInt();
		Arrays.fill(a, numero);
		System.out.println(Arrays.toString(a));
	}

}
