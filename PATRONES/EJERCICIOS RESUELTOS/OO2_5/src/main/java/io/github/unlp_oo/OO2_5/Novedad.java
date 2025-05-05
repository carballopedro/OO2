package io.github.unlp_oo.OO2_5;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia {

	// devuelve lista de peliculas ordenadas de más reciente a menos reciente
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador){
		return decodificador.getGrilla().stream()
				.sorted((p1,p2) -> Integer.compare(p2.getReleaseYear(), p1.getReleaseYear()))
				.collect(Collectors.toList());
	}
	
	// otra manera
	// 		return decodificador.getGrilla().stream()
    //              .sorted(Comparator.comparingInt(Pelicula::getReleaseYear).reversed())
	//              .collect(Collectors.toList());
}
