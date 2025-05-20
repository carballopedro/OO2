package io.github.unlp_oo.OO2_15;

public class Gamer extends ConfigurationBuilder {

	@Override
	public void setProcessor() {
		this.getDevice().setProcessor(Catalogue.getComponent("Procesador Gamer"));
		this.getDevice().add(Catalogue.getComponent("Pad térmico"));
		this.getDevice().add(Catalogue.getComponent("Cooler"));
	}

	@Override
	public void setRAM() {
		this.getDevice().setRAM(Catalogue.getComponent("32 GB"));
		this.getDevice().setRAM(Catalogue.getComponent("32 GB"));
	}

	@Override
	public void setDisk() {
		this.getDevice().setDisk(Catalogue.getComponent("SSD 500 GB"));
		this.getDevice().setDisk(Catalogue.getComponent("SSD 1 TB"));
	}

	@Override
	public void setGPU() {
		this.getDevice().setGPU(Catalogue.getComponent("RTX 4090"));
	}

	@Override
	public void setChassis() {
		this.getDevice().setChassis(Catalogue.getComponent("Gabinete Gamer"));
		double aux = (this.getDevice().calculateTotalPowerUsage()) * 1.5;
		this.getDevice().add(Catalogue.getComponent("Fuente" + aux + "w"));
	}
}
