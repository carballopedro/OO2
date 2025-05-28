package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}
	
	public double obtenerPrecioLlamada() {
		return this.getDuracion() * 3;
	}

	public double aplicarAdicional() {
		return 50;
	}


}
