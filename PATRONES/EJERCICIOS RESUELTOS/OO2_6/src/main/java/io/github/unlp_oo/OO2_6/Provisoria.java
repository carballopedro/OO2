package io.github.unlp_oo.OO2_6;

public class Provisoria extends EstadoInscripcion {

	public void inscribir(Excursion e, User user) {
		e.addToOfficialList(user);
		if (e.reachedMinParticipants()) {
			e.setState(new Definitiva());
		}
	}
	
	public String getInformation(Excursion e) {
		return "Cantidad de usuarios faltantes para alcanzar el cupo minimo: " + e.remainingToReachMin();
	}
}
