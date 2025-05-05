package io.github.unlp_oo.OO2_6;

public class Completa extends EstadoInscripcion {

	public void inscribir(Excursion e, User user) {
		e.addToWaitingList(user);
	}
	
	public String getInformation(Excursion e) {
		return "";
	}
}