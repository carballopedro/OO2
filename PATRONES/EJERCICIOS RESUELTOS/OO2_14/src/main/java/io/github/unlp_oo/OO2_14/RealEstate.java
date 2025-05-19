package io.github.unlp_oo.OO2_14;

public class RealEstate extends Asset {

	private String address;
	private double area;
	private double pricePerM2;
	
	public RealEstate(String address, double area, double pricePerM2) {
		super();
		this.address = address;
		this.area = area;
		this.pricePerM2 = pricePerM2;
	}
	
	public double liquidity() {
		return 0.2;
	}
	
	public double value() {
		return this.area * this.pricePerM2;
	}
}
