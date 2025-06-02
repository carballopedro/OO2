package io.github.unlp_oo.OO2_20b;

import java.util.Arrays;

public class GuerreroBuilder extends PersonajeBuilder {


	@Override
	public void setArmadura() {
		this.personaje.setArmadura(new Acero());
	}

	@Override
	public void setArma() {
		this.personaje.setArma(new Espada());	
	}

	@Override
	public void setHabilidades() {
		this.personaje.setHabilidades(Arrays.asList(new CombateCuerpoACuerpo()));
	}
}
