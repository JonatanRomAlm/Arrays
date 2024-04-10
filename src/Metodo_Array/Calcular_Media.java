package Metodo_Array;

public class Calcular_Media {

	public static void main(String[] args) {

		
		double numero [] = {5.2,2.7,8.5};
		
		System.out.println("la media es " + calculoMedia(numero));
		
	}
		private static double calculoMedia(double[] numero) {
			double suma= 0;
			
			for (double num: numero) {
				suma = suma + num;
		}
			return suma/numero.length;
	}
}