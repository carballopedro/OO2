package io.github.unlp_oo.OO2repasoEJ1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {

	// Declaraciones
	Twitter t;
	Usuario u;
	
	Twitter t2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.t = new Twitter();
		this.u = new Usuario("Pedro");
		
		this.t2 = new Twitter();
		this.t2.agregarUsuario("Pedro");
		
	}
	
	// Tests
	@Test
	void testAgregarUsuario() {
		// agrega usuario correctamente
		assertEquals(u.getClass(), t.agregarUsuario("Pedro").getClass());
		
		// no puede agregar usuario con nombre repetido
		assertEquals(null, t.agregarUsuario("Pedro"));
	}
	
	@Test
	void testEliminarUsuario() {
		// tiene usuarios
		assertEquals(false, t2.getUsuarios().isEmpty());
		
		// elimina usuarios y lista de usuarios esta vacia
		Usuario usu = t2.getUsuarios().get(0);
		t2.eliminarUsuario(usu);
		assertEquals(true, t2.getUsuarios().isEmpty());

	}
}
