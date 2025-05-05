package io.github.unlp_oo.OO2repasoEJ2;

public class Spock implements Jugada {
	
	public String resolverPapel() {
		return "Papel desaprueba Spock";
	}
	
	public String resolverPiedra() {
		return "Spock vaporiza Piedra";
	}
	
	public String resolverTijera() {
		return "Spock rompe Tijera";
	}
	
	public String resolverLagarto() {
		return "Lagarto envenena Spock";
	}
	
	public String resolverSpock() {
		return "Empate";
	}
	
	public String jugarContra(Jugada unaJugada) {
		return unaJugada.resolverSpock();
	}
}
