package io.github.unlp_oo.OO2_20;

import java.util.Arrays;

public class ArqueroBuilder extends PersonajeBuilder {

	@Override
	public void setArmadura() {
		this.personaje.setArmadura(new Cuero());
	}

	@Override
	public void setArma() {
		this.personaje.setArma(new Arco());	
	}

	@Override
	public void setHabilidades() {
		this.personaje.setHabilidades(Arrays.asList(new CombateADistancia()));
	}

}
