package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

// mi adapter

public class JacksonAdapter implements Exporter {

	// crea un stream de la lista
	// convierte cada socio en un JSON String usando mapper (ObjectMapper)
	// .collect(Collectors.joining("\n")) -> junta todos los strings en un único String separados por salto de linea
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		

        return socios.stream()
                .map(socio -> {
                    try {
                        return mapper.writeValueAsString(socio);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return "{}"; // Devuelve objeto vacío en caso de error
                    }
                })
                .collect(Collectors.joining("\n")); // Une con salto de línea
        }

}
