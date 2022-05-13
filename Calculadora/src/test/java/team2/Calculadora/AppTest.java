package team2.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import team2.Calculadora.modelo.Calculadora;

class AppTest {
	@BeforeEach
	public void constructor() {

		Calculadora conversorMoneda = new Calculadora();

	}
	
	public void testEuroLibra() {
		double resultado = conversorMoneda.conversor(5) ;//5euros
		double esperado = 4.25;
		double delta = 0.01;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testEuroDolar() {
		double resultado = conversorMoneda.conversor(8);//8euros
		double esperado = 8.33;
		double delta = 0.01;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testLibraEuro() {
		double resultado = conversorMoneda.conversor(2);//2libras
		double esperado = 2.36 ;
		double delta = 0.01;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testLibraDolar() {
		double resultado = conversorMoneda.conversor(3);//3libras
		double esperado = 3.68;
		double delta = 0.01;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testDolarLibra() {
		double resultado = conversorMoneda.conversor(7);//7libras
		double esperado = 5.71;
		double delta = 0.01;
		assertEquals(resultado, esperado, delta);
	
	}
}
