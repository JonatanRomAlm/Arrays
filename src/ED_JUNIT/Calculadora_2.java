package ED_JUNIT;

public class Calculadora_2 {

	private int numero1;
	private int numero2;
	
	
	
	public Calculadora_2() {
		super();
	}

	
	public Calculadora_2(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}


	public int restar() {
		int resul;
		if (restar2())
			resul=numero1-numero2;
		else resul= numero2-numero1;
		return resul;
	}
	
	private boolean restar2() {
		if (numero1>= numero2)
			return true;
		else
			return false;
	}
	
	public Integer dividir2() {
		if (numero2==0)
			return null;
		int resul = numero1 / numero2;
		return resul;
		
	}
	public Integer dividir3() {
		if (numero2== 0)
			throw new java.lang.ArithmeticException("Division por 0 ");
		else {
		int resul = numero1/numero2;
		return resul;
		}
	}
}
