package io.github.unlp_oo.OO2_15;

import java.util.ArrayList;
import java.util.List;

public abstract class ConfigurationBuilder {

	protected List<Component> components;
	
	// reset privado
	// ademas el director no deberia hacerse cargo de hacer reset
	// lo hace el mismo builder
	private void reset() {
		this.components = new ArrayList<Component>();
	}
	
	public abstract void setProcessor();
	public abstract void setRAM();
	public abstract void setDisk();
	public abstract void setGPU();
	public abstract void setChassis();
	
	public Device getDevice() {
		Device temp = new Device(this.components);
		this.reset();
		return temp;
	}

}
