package io.github.unlp_oo.OO2_20;

public class Director {
	
	private PersonajeBuilder builder;

	public Director(PersonajeBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(PersonajeBuilder builder) {
		this.builder = builder;
	}
	
	public Personaje build(String nombre) {
		this.builder.setNombre(nombre);
		this.builder.setVida(100);
		this.builder.setArmadura();
		this.builder.setArma();
		this.builder.setHabilidades();
		return this.builder.getPersonaje();
	}
}
