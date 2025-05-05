package io.github.unlp_oo.OO2_7;

public class Calculadora {

	private Estado state;
	private double valorAcumulado;
	
	public Calculadora() {
		this.reiniciarCalculadora();
	}
	
	public void reiniciarCalculadora() {
		this.setValorAcumulado(0);
		this.setState(new EstadoInicial());
	}
	
	// borrar
	public void borrar() {
		this.reiniciarCalculadora();
	}
	
	// setters
	public void setState(Estado state) {
		this.state = state;
	}
	
	public void setValorAcumulado(double unValor) {
		this.valorAcumulado = unValor;
	}
	
    public void setValor(double unValor) {
    	this.state.setValor(unValor, this);
    }

	// getters
	public double getValorAcumulado() {
		return this.valorAcumulado;
	}
	
	public String getResultado() {
    	return this.state.getResultado(this);
    }
    
    // operaciones
    public void mas() {
    	this.state.mas(this);
    }
    
    public void menos() {
    	this.state.menos(this);
    }
    
    public void por() {
    	this.state.por(this);
    }
    
    public void dividido() {
    	this.state.dividido(this);
    }

}
