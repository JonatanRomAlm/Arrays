package Array_Unidimensionales;

import java.util.*;

/*
 * Crea un programa para calcular la letra de un DNI. Se le pedirá al usuario un DNI sin letra, el 
	programa calculará la letra que corresponde y se mostrará el DNI completo.
	Para calcular la letra, cogeremos el resto de dividir el dni entre 23. Haz un método donde 
	según el resto de la división (posición del elemento del array) busque en un array de 
	caracteres la letra.
 */

public class E6_Calcular_DNI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		// Pedir al usuario que introduzca los numeros del DNI.
		        System.out.print("Introduce los números del DNI (sin letra): ");
		        int dniNumeros = sc.nextInt();
		        
		// Guardar en una variable char el metodo para calcular la letra del DNI.
		        char DNI = calcularLetraDNI(dniNumeros);
		        
		// Mostrar el DNI completo
		        System.out.println("DNI completo: " + dniNumeros + DNI);
		        sc.close();
		    }
			
		//Metodo static char para calcular la letra del DNI.
		    public static char calcularLetraDNI(int dniNumeros) {
		        // Array de caracteres correspondiente a la tabla de letras
		        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
		                            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		 // Calcular el resto de la división del dni entre 23
		        int resto = dniNumeros % 23;

		        
		// Devuelve la letra correspondiente al resto en el array de caracteres
		        return letrasDNI[resto];
		       
		    }
		    
		}