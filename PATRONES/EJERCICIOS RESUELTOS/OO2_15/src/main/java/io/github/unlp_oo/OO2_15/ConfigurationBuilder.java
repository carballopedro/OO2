package io.github.unlp_oo.OO2_15;

public abstract class ConfigurationBuilder {

	private Device device;
	
	public void reset() {
		this.device = new Device();
	}
	
	public abstract void setProcessor();
	public abstract void setRAM();
	public abstract void setDisk();
	public abstract void setGPU();
	public abstract void setChassis();
	
	public Device getDevice() {
		return this.device;
	}

}
