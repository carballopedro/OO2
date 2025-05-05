package io.github.unlp_oo.OO2_2;

public class Pasante extends Personal {

	private int cantExamenesRendidos;
	
	public Pasante (int cantExamenesRendidos) {
		this.cantExamenesRendidos = cantExamenesRendidos;
	}
	
	public double basico() {
		return 20000;
	}
	public double adicional() {
		return this.cantExamenesRendidos * 2000;
	}
}
