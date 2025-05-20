package io.github.unlp_oo.OO2_15;

public class Intermediate extends ConfigurationBuilder {
	
	@Override
	public void setProcessor() {
		this.getDevice().setProcessor(Catalogue.getComponent("Procesador Intermedio"));
	}

	@Override
	public void setRAM() {
		this.getDevice().setRAM(Catalogue.getComponent("16 GB"));
	}

	@Override
	public void setDisk() {
		this.getDevice().setDisk(Catalogue.getComponent("SSD 500 GB"));
	}

	@Override
	public void setGPU() {
		this.getDevice().setGPU(Catalogue.getComponent("GTX 1650"));
	}

	@Override
	public void setChassis() {
		this.getDevice().setChassis(Catalogue.getComponent("Gabinete Intermedio"));
		this.getDevice().add(Catalogue.getComponent("Fuente 800w"));
	}
}
