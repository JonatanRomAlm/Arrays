package busqueda_lineal_ordenada;


public class Busqueda_binaria {

	public static void main(String[] args) {

		

		int [] numeros = {2,8,12,19,22,35,48} ;
		int busco = 48;
		
		System.out.println(busquedaBinaria(numeros,busco));
		
	}
	
	private static int busquedaBinaria(int [] numeros,int busco) {
		int izq, der, centro;
		
		izq=0;
		der=numeros.length-1;
		centro=(izq+der)/2;
		int iteraciones=0;
		
		while (izq<der && numeros[centro]!= busco) {
			if (numeros [centro]> busco)
				der = centro-1;
			
			else izq = centro-1;
			
			centro=(izq+der)/2;
			iteraciones++;
		}
		System.out.println("Iteraciones " + iteraciones);//cuantas iteraciones tarda en buscarlos.
			if (numeros[centro] ==busco)
			return centro;
			
			else
				return -1;
	}
	

}
