package io.github.unlp_oo.OO2_15;

public class GamerBuilder extends ConfigurationBuilder {

	@Override
	public void setProcessor() {
		this.components.add(Catalogue.getComponent("Procesador Gamer"));
		this.components.add(Catalogue.getComponent("Pad térmico"));
		this.components.add(Catalogue.getComponent("Cooler"));
	}

	@Override
	public void setRAM() {
		this.components.add(Catalogue.getComponent("32 GB"));
		this.components.add(Catalogue.getComponent("32 GB"));
	}

	@Override
	public void setDisk() {
		this.components.add(Catalogue.getComponent("SSD 500 GB"));
		this.components.add(Catalogue.getComponent("SSD 1 TB"));
	}

	@Override
	public void setGPU() {
		this.components.add(Catalogue.getComponent("RTX 4090"));
	}

	@Override
	public void setChassis() {
		this.components.add(Catalogue.getComponent("Gabinete Gamer"));
		double aux = (this.getDevice().calculateTotalPowerUsage()) * 1.5;
		this.components.add(Catalogue.getComponent("Fuente" + aux + "w"));
	}
}
