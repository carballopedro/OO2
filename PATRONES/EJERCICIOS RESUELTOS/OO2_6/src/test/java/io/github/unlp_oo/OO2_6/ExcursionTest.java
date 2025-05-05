package io.github.unlp_oo.OO2_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private User usuario1;
	private User usuario2;
	private User usuario3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 4, 6), LocalDate.of(2023, 4, 8), 
									   "Terminal de Ómnibus de La Plata", 5000,1,2);
		this.usuario1 = new User("Lana", "Del Rey", "lanadelrey1985@gmail.com");
		this.usuario2 = new User("Taylor", "Swift", "taylorswift13@gmail.com");
		this.usuario3 = new User("Chappell", "Roan", "chappellroan@gmail.com");
		this.excursion.inscribir(usuario1);
		this.excursion.inscribir(usuario2);
		}

	@Test
	public void testInscribir() {
		this.excursion.inscribir(usuario3);
		assertEquals(1,this.excursion.getWaitingListSize());
		assertEquals(2,this.excursion.getTotalParticipants());
		assertTrue(this.excursion.getOfficialList().contains(usuario1));
		assertTrue(this.excursion.getOfficialList().contains(usuario2));
		assertFalse(this.excursion.getOfficialList().contains(usuario3));
		assertTrue(this.excursion.getWaitingList().contains(usuario3));
		assertTrue(this.excursion.getState() instanceof Completa);
		
		String cadena = "Nombre: Dos días en kayak bajando el Paraná" + "\n"
				+ "Costo: 5000.0" + "\n"
				+ "Fecha de Inicio: " + LocalDate.of(2023, 4, 6) + "\n"
				+ "Fecha de Fin: " + LocalDate.of(2023, 4, 8) + "\n"
				+ "Punto de Encuentro: Terminal de Ómnibus de La Plata" + "\n";
		assertEquals(cadena , this.excursion.getInformation());

	}
}
