package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private StrategyTipoGenerador tipoGenerador = new ConcreteStrategyUltimo();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		String linea = this.tipoGenerador.obtenerNumeroLibre(this.lineas);
		this.lineas.remove(linea);
		return linea;
	}

	public void cambiarTipoGenerador(StrategyTipoGenerador strategy) {
		this.tipoGenerador = strategy;
	}
	
	public boolean agregarNumeroTelefono(String str) {
		if (!this.contiene(str)) {
			this.agregarNumero(str);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean contiene(String str) {
		return this.lineas.contains(str);
	}
	
	public void agregarNumero(String str) {
		this.lineas.add(str);
	}
}
