package io.github.unlp_oo.OO2_20b;

import java.util.Arrays;

public class MagoBuilder extends PersonajeBuilder {


	@Override
	public void setArmadura() {
		this.personaje.setArmadura(new Cuero());
	}

	@Override
	public void setArma() {
		this.personaje.setArma(new Baston());	
	}

	@Override
	public void setHabilidades() {
		this.personaje.setHabilidades(Arrays.asList(new Magia(), new CombateADistancia()));
	}

}
