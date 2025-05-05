package io.github.unlp_oo.OO2repasoEJ2;

public class Jugador {

	private Jugada jugada;
	
	// valor de jugada almacenado en el constructor para asegurarme que un jugador siempre tiene una jugada seteada
	public Jugador (Jugada jugada) {
		this.jugada = jugada;
	}
	
	public void setJugada (Jugada jugada) {
		this.jugada = jugada;
	}
	
	public Jugada getJugada() {
		return this.jugada;
	}
}
