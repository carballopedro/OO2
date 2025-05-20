package io.github.unlp_oo.OO2_15;

public class Director {

	private ConfigurationBuilder builder;
	
	public Director (ConfigurationBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder (ConfigurationBuilder builder) {
		this.builder = builder;
	}
	
	public Quote buildDevice (String name) {
		this.builder.setProcessor();
		this.builder.setRAM();
		this.builder.setDisk();
		this.builder.setGPU();
		this.builder.setChassis();
		return new Quote(name, this.builder.getDevice());
	}
}
