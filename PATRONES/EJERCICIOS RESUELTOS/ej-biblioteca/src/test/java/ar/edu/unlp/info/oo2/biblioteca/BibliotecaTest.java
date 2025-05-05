package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	private Socio socio1;
	private Socio socio2;
	private JSONParser parseo;
	
	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
		socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		VoorheesExporter exporter = new VoorheesExporter();
		biblioteca.setExporter(exporter);
		parseo = new JSONParser();
	}
	
	@Test
	void testConJSONParser() throws ParseException{
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
		assertEquals(parseo.parse(biblioteca.exportarSocios()), parseo.parse(salida));	}
	
	void testNormal() throws ParseException{
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
		assertEquals(biblioteca.exportarSocios(), salida);	}
	
	void testJSONSimpleAdapter() throws ParseException{
		VoorheesExporter adapter = new JSONSimpleAdapter();
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
		biblioteca.setExporter(adapter);
		assertEquals(parseo.parse(salida), parseo.parse(this.biblioteca.exportarSocios()));
	}

}
