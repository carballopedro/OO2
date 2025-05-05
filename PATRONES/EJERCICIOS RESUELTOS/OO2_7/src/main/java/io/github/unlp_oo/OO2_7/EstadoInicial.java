package io.github.unlp_oo.OO2_7;

public class EstadoInicial implements Estado {
	
	public void setValor(double unValor, Calculadora c) {
		c.setValorAcumulado(unValor);
	}

	public void mas(Calculadora c) {
		c.setState(new EsperandoSuma());
	}
	    
	public void menos(Calculadora c) {
		c.setState(new EsperandoResta());

	}
	    
	public void por(Calculadora c) {
		c.setState(new EsperandoMultiplicacion());

	}
	    
	public void dividido(Calculadora c) {
		c.setState(new EsperandoDivision());

	}
	    
	public String getResultado(Calculadora c) {
		return String.valueOf(c.getValorAcumulado());
	}
	
}
