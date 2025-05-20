package io.github.unlp_oo.OO2_15;

public class Basic extends ConfigurationBuilder {

	@Override
	public void setProcessor() {
		this.getDevice().setProcessor(Catalogue.getComponent("Procesador Básico"));
	}

	@Override
	public void setRAM() {
		this.getDevice().setRAM(Catalogue.getComponent("8 GB"));
	}

	@Override
	public void setDisk() {
		this.getDevice().setDisk(Catalogue.getComponent("HDD 500 GB"));
	}

	@Override
	public void setGPU() {}

	@Override
	public void setChassis() {
		this.getDevice().setChassis(Catalogue.getComponent("Gabinete Estándar"));
	}
	
}
