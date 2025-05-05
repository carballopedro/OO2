package io.github.unlp_oo.OO2_7;

public abstract class EstadoEspera implements Estado {
	
	// aca tiene que hacer la operacion con el valor acumulado y el valor pasado por parametro
	public abstract void setValor(double unValor, Calculadora c);

	public void mas(Calculadora c) {
		c.setState(new EstadoError());
	}
	    
	public void menos(Calculadora c) {
		c.setState(new EstadoError());
	}
	    
	public void por(Calculadora c) {
		c.setState(new EstadoError());
	}
	    
	public void dividido(Calculadora c) {
		c.setState(new EstadoError());
	}
	    
	public String getResultado(Calculadora c) {
		c.setState(new EstadoError());
		return "Error";
	}

}
