package io.github.unlp_oo.OO2_20b;

public class Acero implements Armadura {

	public int recibirDaño(Arma arma) {
		return arma.dañoContraAcero();
	}
}
