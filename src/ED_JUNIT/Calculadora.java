package ED_JUNIT;

public class Calculadora {

	
		
		private double num1;
		private double num2;
		
		
		public Calculadora() {
			super();
		}


		public Calculadora(double num1, double num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}
		
		
		public double sumar() {
			return num1 + num2;
		}
		
		public double restar() {
			return num1 - num2;
	}

		public double multiplicar() {
			return num1 * num2;
}
		
		public double dividir() {
			return num1 / num2;
			
		}
}