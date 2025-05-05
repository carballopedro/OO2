package io.github.unlp_oo.OO2repasoEJ2;

public interface Jugada {

	
	public String resolverPapel();
	
	public String resolverPiedra();
	
	public String resolverTijera();
	
	public String resolverLagarto();
	
	public String resolverSpock();
	
	public String jugarContra(Jugada unaJugada);
}