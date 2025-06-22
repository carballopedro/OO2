package io.github.unlp_oo.parcial_primera_fecha;

public class ConSeguro extends Decorator {

	public ConSeguro(IPaquete component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " con seguro";
	}
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + (super.getValorDeclarado() * 0.2);
	}

}
