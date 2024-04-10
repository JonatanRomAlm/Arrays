package ED_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		double valorEsperado=30;// Crear una variable y poner el resultado esperado.
		Calculadora cal = new Calculadora(20,10);//Crear un objeto con los datos a sumar.
		double valorReal = cal.sumar();//Guardar el calculo sumar en valor Real.
		assertEquals(valorEsperado, valorReal);//Comparar el calculo.
	}

	@Test
	void testRestar() {
		double valorEsperado=10;
		Calculadora cal = new Calculadora(20,10);
		double valorReal = cal.restar();
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testMultiplicar() {
		double valorEsperado=200;
		Calculadora cal = new Calculadora(20,10);
		double valorReal = cal.multiplicar();
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testDividir() {
		double valorEsperado=2;
		Calculadora cal = new Calculadora(20,10);
		double valorReal = cal.dividir();
		assertEquals(valorEsperado, valorReal);
	}

}
