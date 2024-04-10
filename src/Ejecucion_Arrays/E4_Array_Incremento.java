package Ejecucion_Arrays;
import java.util.*;

public class E4_Array_Incremento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Ejercicio 4: Crea una clase llamada ArrayIncremento que defina e
		inicialice un array de 10 números de tipo double. Después mediante
		un bucle for each recorre el bucle visualizando cada elemento
		incrementado en un porcentaje que se le haya pedido al usuario.
		 */
		
		// Declara Array en double
		double numero [] = {0,1,2,3,4,5,6,7,8,9};
		
		
		//Pedir al usuario un porcentaje.
		System.out.println("Dame un porcentaje");
		double porcentaje = sc.nextDouble();
		
		
		// Recorrer el Array con bucle for- each.
		// Crear calculo de porcentaje.
		// Mostrar por pantalla el numero mas el numero incrementado.
		for ( double n : numero) {
			 double resultado = (n * (porcentaje/100))+ n;
			 System.out.println("Numero " + n + " Nº Incrementado " + resultado);
		}
		sc.close();
	}

}
