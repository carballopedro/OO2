package io.github.unlp_oo.OO2_2;

public class Temporario extends Personal {
	
	private int cantHorasTrabajadas;
	private boolean casado;
	private int cantHijos;
	
	public Temporario (int cantHorasTrabajadas, boolean casado, int cantHijos) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.casado = casado;
		this.cantHijos= cantHijos;
	}
	
	public double basico() {
		return 20000 + (this.cantHorasTrabajadas * 300);
	}
	public double adicional() {
		int aux = 2000 * this.cantHijos;
		return (casado)? aux + 5000 : aux;
	}
}
