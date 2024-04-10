package busqueda_lineal_ordenada;

import java.util.Arrays;

public class Ordenar_Burbuja {

	public static void main(String[] args) {

		int [] array = {2,12,7,5,4,1,};
		ordenarBurbuja(array);
		
		System.out.println(Arrays.toString(array));
		
	
	}

	private static void ordenarBurbuja(int[] array) {
		int aux;
		
		for (int i = array.length;i>0; i--) {
			for (int j = 0; j<i-1; j++) {
				
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]= array[j+1];
					array [j+1] = aux;
				}
				
			}
		}
			
	}
}


