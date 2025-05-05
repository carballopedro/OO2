package io.github.unlp_oo.OO2_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
	private Personal empCasadoSinHijos;
	private Personal empCasadoConHijos;
	private Personal empSolteroSinHijos;
	private Personal empSolteroConHijos;
	
	@BeforeEach
	public void setUp() throws Exception {
		empCasadoSinHijos = new Temporario(1, true, 0);
		empCasadoConHijos = new Temporario(1, true, 1);
		empSolteroSinHijos = new Temporario(1, false, 0);
		empSolteroConHijos = new Temporario(1, false, 1);
	}

	@Test
	public void testSueldoBasico() {
		assertEquals(20300, empCasadoSinHijos.basico());
		assertEquals(20300, empCasadoConHijos.basico());
		assertEquals(20300, empSolteroSinHijos.basico());
		assertEquals(20300, empSolteroConHijos.basico());
	}
	
	@Test
	public void testCalcularAdicionales() {
		assertEquals(5000, empCasadoSinHijos.adicional());
		assertEquals(7000, empCasadoConHijos.adicional());
		assertEquals(0, empSolteroSinHijos.adicional());
		assertEquals(2000, empSolteroConHijos.adicional());
	}
	
	@Test
	public void testCalcularDescuentos() {
	    assertEquals(2889, empCasadoSinHijos.descuentos());
	    assertEquals(2989, empCasadoConHijos.descuentos());
	    assertEquals(2639, empSolteroSinHijos.descuentos());
	    assertEquals(2739, empSolteroConHijos.descuentos());
	}

	@Test
	public void sueldo() {
	    assertEquals(22411, empCasadoSinHijos.sueldo());
	    assertEquals(24311, empCasadoConHijos.sueldo());
	    assertEquals(17661, empSolteroSinHijos.sueldo());
	    assertEquals(19561, empSolteroConHijos.sueldo());
	}
	
}
