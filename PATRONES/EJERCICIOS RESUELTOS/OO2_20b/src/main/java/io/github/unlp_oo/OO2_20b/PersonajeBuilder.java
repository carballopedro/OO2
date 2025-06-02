package io.github.unlp_oo.OO2_20b;


public abstract class PersonajeBuilder {

	protected Personaje personaje;

	private void reset() {
		this.personaje = new Personaje();
	}
	
	public void setNombre(String nombre) {
		this.personaje.setNombre(nombre);
	}
	
	public void setVida(int vida) {
		this.personaje.setVida(vida);
	}
	
	public abstract void setArmadura();
	public abstract void setArma();
	public abstract void setHabilidades();
	
	public Personaje getPersonaje() {
		Personaje temp = this.personaje;
		this.reset();
		return temp;
	}
}
