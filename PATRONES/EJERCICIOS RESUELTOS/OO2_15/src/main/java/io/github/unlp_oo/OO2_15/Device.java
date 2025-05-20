package io.github.unlp_oo.OO2_15;

import java.util.List;

public class Device {

	private List<Component> components;
	
	public Device(List<Component> components) {
		this.components = components;
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
