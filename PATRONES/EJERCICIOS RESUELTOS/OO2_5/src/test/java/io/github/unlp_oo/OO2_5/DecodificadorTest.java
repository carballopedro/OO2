package io.github.unlp_oo.OO2_5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {

	private Decodificador deco;
	private List<Pelicula> grilla;
	Pelicula pelicula1;
	Pelicula pelicula2;
	Pelicula pelicula3;
	Pelicula pelicula4;
	Pelicula pelicula5;
	Pelicula pelicula6;
	Pelicula pelicula7;
	Pelicula pelicula8;
	Pelicula pelicula9;
	Pelicula pelicula10;
	
	@BeforeEach
	void setUp() throws Exception {
		pelicula1 = new Pelicula("El Padrino", 1972, 9.2);
        pelicula2 = new Pelicula("Titanic", 1997, 7.8);
        pelicula3 = new Pelicula("Avatar", 2009, 7.8);
        pelicula4 = new Pelicula("Pulp Fiction", 1994, 8.9);
        pelicula5 = new Pelicula("Forrest Gump", 1994, 8.8);
        pelicula6 = new Pelicula("El Senior de los Anillos: El Retorno del Rey", 2003, 8.9);
        pelicula7 = new Pelicula("La lista de Schindler", 1993, 8.9);
        pelicula8 = new Pelicula("Matrix", 1999, 8.7);
        pelicula9 = new Pelicula("Interestelar", 2014, 8.6);
        pelicula10 = new Pelicula("Gladiador", 2000, 8.5);
        
        pelicula3.establecerSimilitud(pelicula6);
        pelicula3.establecerSimilitud(pelicula9);
        pelicula1.establecerSimilitud(pelicula4);
        pelicula1.establecerSimilitud(pelicula10);
        pelicula7.establecerSimilitud(pelicula5);
        
        grilla = new ArrayList<Pelicula>();
        
        grilla.add(pelicula1);
        grilla.add(pelicula2);
        grilla.add(pelicula3);
        grilla.add(pelicula4);
        grilla.add(pelicula5);
        grilla.add(pelicula6);
        grilla.add(pelicula7);
        grilla.add(pelicula8);
        grilla.add(pelicula9);
        grilla.add(pelicula10);
        
        deco = new Decodificador(grilla);
        deco.agregarPeliculaReproducida(pelicula1);
        deco.agregarPeliculaReproducida(pelicula3);
        deco.agregarPeliculaReproducida(pelicula5);
        deco.agregarPeliculaReproducida(pelicula7);
        
	}
	
	@Test
	void testObtenerSugerenciasPorSimilitud() {
		deco.setStrategy(new Similaridad());
		List<Pelicula> similares = deco.getSugerencias();
		
		assertTrue(similares.contains(pelicula6));
		assertTrue(similares.contains(pelicula10));
		assertTrue(similares.contains(pelicula9));
	}
	
	@Test
	void testObtenerSugerenciasPorPuntaje() {
		deco.setStrategy(new Puntaje());
		List<Pelicula> similares = deco.getSugerencias();
		
		assertTrue(similares.contains(pelicula6));
		assertTrue(similares.contains(pelicula4));
		assertTrue(similares.contains(pelicula8));
	}
}
