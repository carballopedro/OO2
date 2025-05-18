package io.github.unlp_oo.OO2_21;

import java.time.LocalDate;

public class NullMamifero implements IMamifero {
	
	// Getters

	public String getIdentificador() {
		return null;
	}
	
	public String getEspecie() {
		return null;
	}
	
	public LocalDate getFechaNacimiento() {
		return null;
	}
	
	public IMamifero getPadre() {
		return null;
	}
	
	public  IMamifero getMadre() {
		return null;
	}
	
	public IMamifero getAbueloMaterno() {
		return null;
	}
	
	public IMamifero getAbuelaMaterna() {
		return null;
	}
	
	public IMamifero getAbueloPaterno() {
		return null;
	}
	
	public IMamifero getAbuelaPaterna() {
		return null;
	}
	
	
	// Setters
	
	public void setIdentificador (String identificador) {}
	
	public void setEspecie(String especie) {}
	
	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {}
	
	public void setPadre(IMamifero padre) {}

	public void setMadre(IMamifero madre) {}
	
	// Otros
	
	public boolean tieneComoAncestroA (IMamifero ancestro) {
		return false;
	}
}
