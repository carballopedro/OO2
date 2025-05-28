package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		return this.guia.agregarNumeroTelefono(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public Cliente registrarClienteFisico(String dni, String nombre) {
		String tel = this.obtenerNumeroLibre();
		Cliente cliente = new ClienteFisico(nombre, tel, dni);
		this.agregarCliente(cliente);
		return cliente;
	}
	
	public Cliente registrarClienteJuridico(String cuit, String nombre) {
		String tel = this.obtenerNumeroLibre();
		Cliente cliente = new ClienteJuridico(nombre, tel, cuit);
		this.agregarCliente(cliente);
		return cliente;
	}


	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotal();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
