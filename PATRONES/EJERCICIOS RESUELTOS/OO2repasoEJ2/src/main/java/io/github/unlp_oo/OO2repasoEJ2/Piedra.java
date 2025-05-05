package io.github.unlp_oo.OO2repasoEJ2;

public class Piedra implements Jugada {
	
	public Piedra() {
	}
	
	public String resolverPapel() {
		return "Gana Papel";
	}
	
	public String resolverPiedra() {
		return "Empate";
	}
	
	public String resolverTijera() {
		return "Gana Piedra";
	}
	
	public String resolverLagarto() {
		return "Piedra aplasta Lagarto";
	}
	
	public String resolverSpock() {
		return "Spock vaporiza Piedra";
	}
	
	public String jugarContra(Jugada unaJugada) {
		return unaJugada.resolverPiedra();
	}
}
