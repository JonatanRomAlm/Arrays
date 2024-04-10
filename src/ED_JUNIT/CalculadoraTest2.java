package ED_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

private Calculadora calcu;
	
	@BeforeEach
	public void creaCalculadora() {
		calcu = new Calculadora(20,10);
	}
	
	@AfterEach
	public void borraCalculadora() {
		calcu = null;
		
	}
	
	@Test
	public void testsumar() {
	double valorEsperado=30;// Crear una variable y poner el resultado esperado.
	double resultado = calcu.sumar();		//Guardar el calculo sumar en valor Real.
	assertEquals( resultado, valorEsperado);//Comparar el calculo.
		//assertEquals(calcu.sumar(), 30);
		

		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	