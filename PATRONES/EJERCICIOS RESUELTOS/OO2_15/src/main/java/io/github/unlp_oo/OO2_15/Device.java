package io.github.unlp_oo.OO2_15;

import java.util.ArrayList;
import java.util.List;

public class Device {

	private List<Component> components;
	
	public Device() {
		this.components = new ArrayList<Component>();
	}
	
	public void setProcessor(Component c) {
		this.add(c);
	}
	public void setRAM(Component c) {
		this.add(c);
	}
	public void setDisk(Component c) {
		this.add(c);
	}
	public void setGPU(Component c) {
		this.add(c);
	}
	public void setChassis(Component c) {
		this.add(c);
	}
	public void add(Component c) {
		this.components.add(c);
	}
	
	// El consumo de un equipo está formado por la suma de los consumos de cada uno de sus componentes.
	public double calculateTotalPowerUsage() {
		return this.components.stream().mapToDouble(Component::getPowerUsage).sum();
	}
	
	// El precio final de un equipo está formado por la suma de los precios de cada uno de sus componentes más el 21% de IVA. 
	public double calculateTotalPrice() {
		return (this.components.stream().mapToDouble(Component::getPrice).sum()) * 1.21;
	}
	
}
