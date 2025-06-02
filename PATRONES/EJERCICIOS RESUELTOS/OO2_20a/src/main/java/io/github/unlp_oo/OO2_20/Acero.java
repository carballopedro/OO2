package io.github.unlp_oo.OO2_20;

public class Acero implements Armadura {

	public int recibirDaño(Arma arma) {
		return arma.dañoContraAcero();
	}
}
