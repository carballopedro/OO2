package io.github.unlp_oo.OO2repasoEJ2;

public class Juego {
	
	public Juego() {
	}
	
	public String Jugar(Jugador jugador1, Jugador jugador2) {
		return jugador1.getJugada().jugarContra(jugador2.getJugada());
	}
	
	// pre condiciones: ambos jugadores deben tener una jugada seteada
}
