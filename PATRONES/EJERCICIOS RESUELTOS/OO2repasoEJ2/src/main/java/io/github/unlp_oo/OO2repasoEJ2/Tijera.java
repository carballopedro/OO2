package io.github.unlp_oo.OO2repasoEJ2;

public class Tijera implements Jugada {

	public String resolverPapel() {
		return "Gana Tijera";
	}
	
	public String resolverPiedra() {
		return "Gana Piedra";
	}
	
	public String resolverTijera() {
		return "Empate";
	}
	
	public String resolverLagarto() {
		return "Tijera decapita Lagarto";
	}
	
	public String resolverSpock() {
		return "Spock rompe Tijera";
	}
	
	public String jugarContra(Jugada unaJugada) {
		return unaJugada.resolverTijera();
	}
}
