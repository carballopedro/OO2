package io.github.unlp_oo.OO2_15;

import java.time.LocalDate;

public class Quote {

	private LocalDate date;
	private String clientsName;
	private Device device;
	private double price;
	private double powerUsage;
	
	public Quote(String name, Device device) {
		this.date = LocalDate.now();
		this.clientsName = name;
		this.device = device;
		this.price = device.calculateTotalPrice();
		this.powerUsage = device.calculateTotalPowerUsage();
	}
	
}
