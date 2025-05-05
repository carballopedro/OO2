package io.github.unlp_oo.OO2repasoEJ2;

public class Papel implements Jugada{
	
	
	public String resolverPapel() {
		return "Empate";
	}
	
	public String resolverPiedra() {
		return "Gana papel";
	}
	
	public String resolverTijera() {
		return "Gana Tijera";
	}
	
	public String resolverLagarto() {
		return "Lagarto come papel";
	}
	
	public String resolverSpock() {
		return "Pape desaprueba Spock";
	}
	
	public String jugarContra(Jugada unaJugada) {
		return unaJugada.resolverPapel();
	}

}
