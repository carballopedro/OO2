package io.github.unlp_oo.parcial_primera_fecha;

public class EntregaExpres extends Decorator {

	public EntregaExpres(IPaquete component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " entrega express";
	}
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + (super.getValorDeclarado() * 0.5);
	}

}
