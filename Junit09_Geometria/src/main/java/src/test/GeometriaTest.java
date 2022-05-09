package src.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import JUnit.Junit09_Geometria.dto.*;

class GeometriaTest {

	Geometria geometria;

	@BeforeEach
	public void constructor() {

		geometria = new Geometria(1);

	}
	
	@Test
	public void constructorDefecto() {

		geometria = new Geometria();

	}

	@Test
	public void testAreaCuadrado() {

		int resultado = geometria.areacuadrado(5);
		int esperado = 25;

		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCirculo() {

		double resultado = geometria.areaCirculo(4);
		double esperado = 50.27;
		double delta = 0.1; // Margen de 0,1 por si redondea

		assertEquals(esperado, resultado, delta);

	}

	@Test
	public void testAreaTriangulo() {
		double resultado = geometria.areatriangulo(10, 2);
		double esperado = 10;

		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() {

		double resultado = geometria.arearectangulo(5, 2);
		double esperado = 10;

		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() {

		double resultado = geometria.areapentagono(10, 2);
		double esperado = 10;
		
		assertEquals(esperado, resultado);

	}

	@Test
	public void testAreaRombo() {
		
		double resultado = geometria.arearombo(10, 2);
		double esperado = 10;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testAreaRomboide() {
		
		double resultado = geometria.arearomboide(10, 2);
		double esperado = 20;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testAreaTrapecio() {
		
		double resultado = geometria.areatrapecio(5, 5, 5);
		double esperado = 25;
		
		assertEquals(esperado, resultado);
		
	}
	
	private static Stream<Arguments> getFormatFixture(){
		return Stream.of(
				Arguments.of(1,"cuadrado"),
				Arguments.of(2,"Circulo"),
				Arguments.of(3,"Triangulo"),
				Arguments.of(4,"Rectangulo"),
				Arguments.of(5,"Pentagono"),
				Arguments.of(6,"Rombo"),
				Arguments.of(7,"Romboide"),
				Arguments.of(8,"Trapecio"),
				Arguments.of(9,"Default"));
	}
	
	@ParameterizedTest
	@MethodSource("getFormatFixture")
	public void testStringFigura(int a, String f) {
		
		String resultado = geometria.figura(a);
		String esperado = f;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetId() {
		
		int resultado = geometria.getId();
		int esperado = 1;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testSetId() {
		geometria.setId(5);
		int resultado = geometria.getId();
		int esperado = 5;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testGetNom() {
		
		String resultado = geometria.getNom();
		String esperado = "cuadrado";
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testSetNom() {
		
		geometria.setNom("Triangulo");
		
		String resultado = geometria.getNom();
		String esperado = "Triangulo";
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testGetArea() {
		
		double resultado = geometria.getArea();
		double esperado = 0;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testSetArea() {
		geometria.setArea(5);
		
		double resultado = geometria.getArea();
		double esperado = 5;
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testToString() {
		
		String resultado = geometria.toString();
		String esperado = "Geometria [id=1, nom=cuadrado, area=0.0]";
		
		assertEquals(esperado, resultado);
		
	}
	
}
