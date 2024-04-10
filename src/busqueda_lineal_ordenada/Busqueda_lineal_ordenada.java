package busqueda_lineal_ordenada;

public class Busqueda_lineal_ordenada {
	
	public static void main(String[] args) {
	
		
		int [] numeros = {2,8,12,19,22,35,48} ;
		int busco = 4;
		
		System.out.println(buscarLineal(numeros,busco));
		
	}

	/**
	 * Busca en el array numeros el elemento.
	 * @param numeros, array donde se buscara.
	 */
	private static int buscarLineal(int []numeros,int busco) {
		for (int pos = 0; pos < numeros.length && numeros[pos]<=busco; pos++) {
			if (numeros[pos] == busco) {
				return pos;
			}
		}
		return -1;
	}
	
	
	
}
