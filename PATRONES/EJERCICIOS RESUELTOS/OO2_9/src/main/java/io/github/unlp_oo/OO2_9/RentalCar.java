package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public class RentalCar {

	private double pricePerDay;
	private int numberOfSeats;
	private String brand;
	private CancellationPolicy cancellationPolicy;
	
	public RentalCar (double pricePerDay, int numberOfSeats, String brand, CancellationPolicy cancellationPolicy ) {
		this.pricePerDay = pricePerDay;
		this.numberOfSeats = numberOfSeats;
		this.brand = brand;
		this.cancellationPolicy = cancellationPolicy;
	}
	
	public void setCancellationPolicy (CancellationPolicy cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}
	
	public double getRefundAmount(Booking booking, LocalDate tentativeDate) {
		return this.cancellationPolicy.getRefundAmount(booking, tentativeDate);
	}
	
	public double getPricePerDay() {
		return this.pricePerDay;
	}
}
