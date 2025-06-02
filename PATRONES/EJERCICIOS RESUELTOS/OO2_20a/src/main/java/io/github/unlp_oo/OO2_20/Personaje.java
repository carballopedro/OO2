package io.github.unlp_oo.OO2_20;

import java.util.List;

public class Personaje {

	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private List<Habilidad> habilidades;
	private int vida;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public boolean isAlive() {
		return this.vida > 0;
	}
	
	public void enfrentar(Personaje rival) {
		if (this.isAlive() && rival.isAlive()) {
			rival.recibirDaño(this.arma);
		}
		else
		{ throw new RuntimeException("Personaje/s sin vida para el combate");
		}
	}
	
	public void recibirDaño(Arma arma) {
		// calculo max entre 0 y lo que me queda de vida al restar el daño
		// para que mi vida no quede en negativo
		this.vida = Math.max(this.vida - (this.armadura.recibirDaño(arma)), 0);
	}
	
	
}
