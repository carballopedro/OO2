package io.github.unlp_oo.parcial_primera_fecha;

public class ConSeguimiento extends Decorator {

	public ConSeguimiento(IPaquete component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + 2000;
	}

}
