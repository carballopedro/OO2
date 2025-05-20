package io.github.unlp_oo.OO2_15;

public class BasicBuilder extends ConfigurationBuilder {

	@Override
	public void setProcessor() {
		this.components.add(Catalogue.getComponent("Procesador Básico"));
	}

	@Override
	public void setRAM() {
		this.components.add(Catalogue.getComponent("8 GB"));
	}

	@Override
	public void setDisk() {
		this.components.add(Catalogue.getComponent("HDD 500 GB"));
	}

	@Override
	public void setGPU() {}

	@Override
	public void setChassis() {
		this.components.add(Catalogue.getComponent("Gabinete Estándar"));
	}
	
}
