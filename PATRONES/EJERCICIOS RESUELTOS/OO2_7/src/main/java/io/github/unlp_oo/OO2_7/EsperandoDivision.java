package io.github.unlp_oo.OO2_7;

public class EsperandoDivision extends EstadoEspera {

	public void setValor(double unValor, Calculadora c) {
		if(unValor != 0) {
		c.setValorAcumulado(c.getValorAcumulado() / unValor);
		c.setState(new EstadoInicial());
		}
		else
			c.setState(new EstadoError());
	}

}
