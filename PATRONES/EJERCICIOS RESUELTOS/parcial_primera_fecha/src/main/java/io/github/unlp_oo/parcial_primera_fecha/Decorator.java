package io.github.unlp_oo.parcial_primera_fecha;

public abstract class Decorator implements IPaquete {

	private IPaquete component;
	
	public Decorator (IPaquete component) {
		this.component = component;
	}
	
	public String getDescripcion() {
		return this.component.getDescripcion();
	}
	
	public String getDestinatario() {
		return this.component.getDestinatario();
	}
	
	public String getDireccionDestino() {
		return this.component.getDireccionDestino();
	}
	
	public double getValorDeclarado() {
		return this.component.getValorDeclarado();
	}
	
	public double getCostoEnvio() {
		return this.component.getCostoEnvio();
	}
}
