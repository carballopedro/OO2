package io.github.unlp_oo.OO2_15;

public class Component {

	private String name;
	private String description;
	private double price;
	private double powerUsage;
	
	public Component(String name, String description, double price, double powerUsage) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.powerUsage = powerUsage;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public double getPowerUsage() {
		return powerUsage;
	}
	
}
