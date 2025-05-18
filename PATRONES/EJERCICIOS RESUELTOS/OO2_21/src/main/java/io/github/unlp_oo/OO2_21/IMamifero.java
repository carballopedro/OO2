package io.github.unlp_oo.OO2_21;

import java.time.LocalDate;

public interface IMamifero {
	
	// Getters

	public String getIdentificador();
	
	public String getEspecie();
	
	public LocalDate getFechaNacimiento();
	
	public IMamifero getPadre();
	
	public IMamifero getMadre();
	
	public IMamifero getAbueloMaterno();
	
	public IMamifero getAbuelaMaterna();
	
	public IMamifero getAbueloPaterno();
	
	public IMamifero getAbuelaPaterna();
	
	// Setters
	
	public void setIdentificador (String identificador);
	
	public void setEspecie(String especie);
	
	public void setFechaNacimiento(LocalDate fechaDeNacimiento);
	
	public void setPadre(IMamifero padre);

	public void setMadre(IMamifero madre) ;
	
	// Otros 
	
	public boolean tieneComoAncestroA (IMamifero ancestro);
}
