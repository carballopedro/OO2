package io.github.unlp_oo.OO2repasoEJ2;

public class Lagarto implements Jugada {

	
	public String resolverPapel() {
		return "Lagarto come Papel";
	}
	
	public String resolverPiedra() {
		return "Piedra aplasta Lagarto";
	}
	
	public String resolverTijera() {
		return "Tijera decapita Lagarto";
	}
	
	public String resolverLagarto() {
		return "Empate";
	}
	
	public String resolverSpock() {
		return "Lagarto envenena Spock";
	}
	
	public String jugarContra(Jugada unaJugada) {
		return unaJugada.resolverLagarto();
	}
}
