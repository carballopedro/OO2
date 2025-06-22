package io.github.unlp_oo.parcial_primera_fecha;

public class Paquete implements IPaquete {

	private String descripcion;
	private String destinatario;
	private String direccionDestino;
	private double valorDeclarado;
	
	public Paquete(String descripcion, String destinatario, String direccionDestino, double valorDeclarado) {
		super();
		this.descripcion = descripcion;
		this.destinatario = destinatario;
		this.direccionDestino = direccionDestino;
		this.valorDeclarado = valorDeclarado;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public String getDestinatario() {
		return this.destinatario;
	}

	@Override
	public String getDireccionDestino() {
		return this.direccionDestino;
	}

	@Override
	public double getValorDeclarado() {
		return this.valorDeclarado;
	}

	@Override
	public double getCostoEnvio() {
		return this.valorDeclarado * 0.05;
	}
	
	
	
}
