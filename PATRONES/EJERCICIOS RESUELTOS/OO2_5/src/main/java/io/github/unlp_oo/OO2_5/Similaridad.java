package io.github.unlp_oo.OO2_5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia {

	// se obtiene lista de películas similares de todas las películas ya reproducidas
	// ordena de más a menos reciente
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador){
		return decodificador.getReproducidas()
				.stream().map(pelicula -> pelicula.getSimilares())
				.flatMap(lista -> lista.stream())
				.distinct()
				.sorted(Comparator.comparingInt(Pelicula::getReleaseYear).reversed())
				.collect(Collectors.toList());
	}
	
}
