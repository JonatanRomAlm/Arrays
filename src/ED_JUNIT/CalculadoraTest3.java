package ED_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest3 {

	private static Calculadora calcu; // Se crea estatico para acceder a todos los metodos.
	
		
		@BeforeAll
		public static void creaCalculadora() {
			calcu = new Calculadora(20,10);
		}
		
		@AfterAll
		public static void borraCalculadora() {
			calcu = null;
			
		}
		
		@Test
		public void testSumar() {
//		double valorEsperado = 30;// Crear una variable y poner el resultado esperado.
//		double resultado = calcu.sumar();		//Guardar el calculo sumar en valor Real.
//		assertEquals( resultado, valorEsperado);//Comparar el calculo.
			assertEquals (calcu.sumar(),30);
			
		}
		
	}