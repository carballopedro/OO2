package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}

	public double obtenerPrecioLlamada() {
		return this.getDuracion() * 150;
	}

	public double aplicarAdicional() {
		return 0;
	}
}
