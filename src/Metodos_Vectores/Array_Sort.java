package Metodos_Vectores;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {
		
		// Se crea el array inicializado con 7 notas.
				double [] notasAlumnos = {5,7,6,5,9,4,8};
				
				// Se ordenan de forma ascendente.
				Arrays.sort(notasAlumnos);
				
				// Se guarda el array en un for y se visualiza la nota.
				for (double nota: notasAlumnos ) {
					System.out.println(nota + ":");
				}
				

			}

		}
