package ED_JUNIT;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Calculadora_2Test2 {

	@Test
	void testRestar() {
		int valorEsperado = 30;
		Calculadora_2 cal = new Calculadora_2(50,20);
		int valorReal = cal.restar();
		assertTrue(30 == cal.restar());
		assertFalse(30 != cal.restar());
		assertEquals(valorEsperado,valorReal);
	}

	@Test
	void testDividir2() {
		Calculadora_2 cal = new Calculadora_2(20,10);
		assertTrue(2 == cal.dividir2());
		assertFalse(2 != cal.dividir2());
		assertEquals(2,cal.dividir2());
		assertNotNull(cal.dividir2());
		
		Calculadora_2 cal2 = new Calculadora_2(0,0);
		assertNull(cal2.dividir2());
	}

	@Test
	void testDividir3() {//Solo se da cuando hay un error o excepcion.hay que introducir datos erroneos.
		Calculadora_2 cal = new Calculadora_2(20,0);
		Assertions.assertThrows(ArithmeticException.class, ()-> {cal.dividir3();});
		
	}

}
