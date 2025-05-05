package io.github.unlp_oo.OO2_2;

public class Planta extends Personal {
	
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	
	public Planta (boolean casado, int cantHijos, int antiguedad) {
		this.casado = casado;
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	public double basico() {
		return 50000;
	}
	public double adicional() {
		int aux = (this.cantHijos * 2000) + (this.antiguedad * 2000);
		return (casado)? aux + 5000 : aux;
	}
}
