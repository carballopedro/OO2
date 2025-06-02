package io.github.unlp_oo.OO2_20b;

import java.util.Arrays;

public class ThoorBuilder extends PersonajeBuilder {


	@Override
	public void setArmadura() {
		this.personaje.setArmadura(new Hierro());
	}

	@Override
	public void setArma() {
		this.personaje.setArma(new Martillo());	
	}

	@Override
	public void setHabilidades() {
		this.personaje.setHabilidades(Arrays.asList(new CombateADistancia(), new LanzarRayos()));
	}

}
