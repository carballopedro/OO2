package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;


// ejercicio 1b: utilizo interfaz exporter (seria mi target)

public class Biblioteca {
	private List<Socio> socios;
	private Exporter exporter;

	public Biblioteca() {
		socios = new ArrayList<>();
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public Exporter getExporter() {
		return exporter;
	}

	public void setExporter(Exporter exporter) {
		this.exporter = exporter;
	}
}
