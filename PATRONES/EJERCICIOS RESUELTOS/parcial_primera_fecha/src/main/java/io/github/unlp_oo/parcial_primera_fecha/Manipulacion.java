package io.github.unlp_oo.parcial_primera_fecha;

public class Manipulacion extends Decorator {

	public Manipulacion(IPaquete component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " fragil";
	}

}
