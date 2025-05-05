package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// se testean JSONSimpleAdapter y JacksonAdapter

public class BibliotecaTest {

	private Biblioteca biblioteca;
	private Socio socio1;
	private Socio socio2;
	private JSONParser parseo;
	private Exporter adapter;
	
	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
		socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		
		adapter = new JSONSimpleAdapter();
		biblioteca.setExporter(adapter);
		
		parseo = new JSONParser();
	}
	
	@Test
	
	void testJSONSimpleAdapter() throws ParseException{
		String salida = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		assertEquals(parseo.parse(salida), parseo.parse(this.biblioteca.exportarSocios()));
	}
	
	void testJacksonAdapter() throws ParseException{
		Exporter newAdapter = new JacksonAdapter();
		biblioteca.setExporter(newAdapter);
		String salida = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		assertEquals(parseo.parse(salida), parseo.parse(this.biblioteca.exportarSocios()));
	}
}
