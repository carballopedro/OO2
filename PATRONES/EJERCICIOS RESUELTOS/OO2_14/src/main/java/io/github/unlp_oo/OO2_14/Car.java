package io.github.unlp_oo.OO2_14;

import java.time.LocalDate;

public class Car extends Asset {

	// year
	private int model;
	
	private double km;
	private double newCarPrice;
	
	public Car (int model, double km, double newCarPrice) {
		// necesito super() ?
		super();
		this.model = model;
		this.km = km;
		this.newCarPrice = newCarPrice;
	}
	
	public double liquidity() {
		return 0.7;
	}
	public double value() {
		return this.newCarPrice * (0.1 * this.getAge());
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - this.model;
	}
}
