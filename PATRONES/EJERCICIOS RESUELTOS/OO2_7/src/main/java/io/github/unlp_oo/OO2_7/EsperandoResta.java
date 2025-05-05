package io.github.unlp_oo.OO2_7;

public class EsperandoResta extends EstadoEspera {

	public void setValor(double unValor, Calculadora c) {
		c.setValorAcumulado(c.getValorAcumulado() - unValor);
		c.setState(new EstadoInicial());
	}
}
