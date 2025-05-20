package io.github.unlp_oo.OO2_15;

public class IntermediateBuilder extends ConfigurationBuilder {
	
	@Override
	public void setProcessor() {
		this.components.add(Catalogue.getComponent("Procesador Intermedio"));
	}

	@Override
	public void setRAM() {
		this.components.add(Catalogue.getComponent("16 GB"));
	}

	@Override
	public void setDisk() {
		this.components.add(Catalogue.getComponent("SSD 500 GB"));
	}

	@Override
	public void setGPU() {
		this.components.add(Catalogue.getComponent("GTX 1650"));
	}

	@Override
	public void setChassis() {
		this.components.add(Catalogue.getComponent("Gabinete Intermedio"));
		this.components.add(Catalogue.getComponent("Fuente 800w"));
	}
}
