package io.github.unlp_oo.OO2_6;

public class Definitiva extends EstadoInscripcion {

	public void inscribir(Excursion e, User user) {
		e.addToOfficialList(user);
		if (e.reachedMaxParticipants()) {
			e.setState(new Completa());
		}
	}
	
	public String getInformation(Excursion e) {
		 return "Cantidad de usuarios faltantes para alcanzar el cupo máximo: " + e.remainingToReachMax()
         + "\nMails de los Usuarios Inscriptos: \n" + e.getEmailsInscriptos();
	}
}
