package io.github.unlp_oo.OO2_5;

import java.util.List;

public abstract class Sugerencia {

	// filtra las peliculas vistas y limita la lista a devovler a 3 peliculas 
	public List<Pelicula> obtenerSugerencias(Decodificador decodificador){
		return this.sugerirPeliculas(decodificador)
				.stream().filter(pelicula -> !decodificador.fueReproducida(pelicula))
				.limit(3).toList();
	}
	
	public abstract List<Pelicula> sugerirPeliculas(Decodificador decodificador);
}
