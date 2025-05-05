package io.github.unlp_oo.OO2_5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Sugerencia {
	
	// devuelve lista de peliculas filtrada
	// ordenada de mayor a menor puntaje
	// en caso de empate ordena de mas a menos reciente
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador){
		return decodificador.getGrilla().stream()
			    .sorted(Comparator.comparingDouble(Pelicula::getRating).reversed()
			    .thenComparing(Pelicula::getReleaseYear, Comparator.reverseOrder()))
			    .collect(Collectors.toList());
	}
}
