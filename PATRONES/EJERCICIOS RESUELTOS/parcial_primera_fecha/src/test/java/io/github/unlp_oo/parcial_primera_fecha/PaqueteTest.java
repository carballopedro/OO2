package io.github.unlp_oo.parcial_primera_fecha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaqueteTest {

	private IPaquete paquete;
	private IPaquete seguro;
	private IPaquete express;
	
	
	@BeforeEach
	void setUp() {
		this.paquete = new Paquete("Caja de libros", "Destinatario", "Direccion", 20000);
		
		this.seguro = new ConSeguro(this.paquete);
		
		this.express = new EntregaExpres(this.seguro);
	}
	
	@Test
	void test() {
		assertEquals("Caja de libros con seguro entrega express", this.express.getDescripcion());
		assertEquals(15000, this.express.getCostoEnvio());
	}
}
