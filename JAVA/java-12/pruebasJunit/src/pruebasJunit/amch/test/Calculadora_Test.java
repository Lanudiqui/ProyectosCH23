package pruebasJunit.amch.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.amch.app.Calculadora;

class Calculadora_Test {
	
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecuta Before ---> ");
	}
	
	@AfterEach
	public void configurandoAfter() {
		ct = null;
		System.out.println("Ejecutando AfterEach --->");
		System.out.println("**************************");
	}

	@Test
	public void calculdoraNull() {
		
		//fail("Not yet implemented");
		assertNull(ct1, "La clase es una instancia nula");
		System.out.println("Ejecutando el primer test ---> calculadora");
	}
	
	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct,"La clase esta instanciada");
		System.out.println("Ejecutando el segundo test ---> calculadora");
	}
	
	/***********************FIRST TEST***********************/
	
	@Test
	public void primerosAssert() {
		/*
		 * 1.- Indicar que se va a evaluar
		 * 2.- Indicar lo que se va a realizar
		 * 3.- Evaluar con el assert indicado
		 */
		
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6,4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ---> primerosAssert");
	}
	
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20,calculadora.sumar(10, 10));
		System.out.println("Ejecutando cuarto test ---> sumaTest");
	}
	
	/***********************TYPE TEST***********************/
	
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
		assertEquals("Alejandro", "Alejandro");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3= c1;
		assertSame(c1,c3);
		assertNotSame(c2,c3);
		assertEquals(1,1.2,.5);
	}
	
	@Test
	public void validandosuma() {
		assertEquals(11,ct.sumar(5, 6));
	}
	
	@Test
	public void validandoResta() {
		assertEquals(20,ct.restar(100, 80));
	}
	
	@Test
	public void validandoRestaNegativa() {
		assertEquals(-15,ct.restar(15, 30));
	}
	
	@Test
	public void validandoDivision() {
		assertEquals(2,ct.dividir(4, 2));
	}
	
	/*
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class,
				()->ct.divisionByZero(10, 0), "No se puede dividir por cero");
	}*/
	
	
	@Disabled("En espera")
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class,
				()->ct.divisionByZero(10, 0), "No se puede dividir por cero");
	}
}
