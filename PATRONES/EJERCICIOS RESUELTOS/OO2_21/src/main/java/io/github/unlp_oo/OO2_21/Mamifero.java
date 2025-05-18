package io.github.unlp_oo.OO2_21;

import java.time.LocalDate;


public class Mamifero implements IMamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private IMamifero padre;
	private IMamifero madre;
	
	// Getters

	public String getIdentificador() {
		return this.identificador;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public IMamifero getPadre() {
		return this.padre;
	}
	
	public  IMamifero getMadre() {
		return this.madre;
	}
	
	public IMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	
	}
	
	public IMamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public IMamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public IMamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	
	// Setters
	
	public void setIdentificador (String identificador) {
		this.identificador = identificador;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public void setPadre(IMamifero padre) {
		this.padre = padre;
	}

	public void setMadre(IMamifero madre) {
		this.madre = madre;
	}
	
	// Otros
	
	public boolean tieneComoAncestroA (IMamifero ancestro) {
		boolean linajeMaterno, linajePaterno;
		linajeMaterno = (this.madre.equals(ancestro) || this.madre.tieneComoAncestroA(ancestro));
		linajePaterno = (this.padre.equals(ancestro) || this.padre.tieneComoAncestroA(ancestro));
		return (linajeMaterno || linajePaterno);
	}
}
