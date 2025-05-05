package io.github.unlp_oo.OO2_5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia sugerencia;
	
	public Decodificador(List<Pelicula> grilla) {
		this.grilla = grilla;
		this.reproducidas = new ArrayList<Pelicula>();
	}
	
	//setters
	public void setStrategy(Sugerencia s) {
		this.sugerencia = s;
	}
	
	public void agregarPeliculaGrilla(Pelicula p) {
		this.grilla.add(p);
	}
	
	public void agregarPeliculaReproducida(Pelicula p) {
		this.reproducidas.add(p);
	}
	
	
	//getters
	public List<Pelicula> getGrilla() {
		return this.grilla;
	}
	
	public List<Pelicula> getReproducidas() {
		return this.reproducidas;
	}
	
	public List<Pelicula> getSugerencias(){
		return this.sugerencia.obtenerSugerencias(this);
	}
	
	
	// devuelve boolean si la pelicula p fue reproducida
	public boolean fueReproducida(Pelicula p) {
		return this.reproducidas.contains(p);
	}
}
