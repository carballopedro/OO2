package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public class Booking {

	private int numberOfDays;
	private LocalDate date;
	private User driver;
	private RentalCar rentalCar;
	
	public Booking (int numberOfDays, LocalDate date, User driver, RentalCar rentalCar) {
		this.numberOfDays = numberOfDays;
		this.date = date;
		this.driver = driver;
		this.rentalCar = rentalCar;
	}
	
	public double getAmountToPay() {
		return this.numberOfDays * this.rentalCar.getPricePerDay();
	}
	
	public double getRefundAmount(LocalDate tentativeDate) {
		return this.rentalCar.getRefundAmount(this, tentativeDate);
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public int getNumberOfDays() {
		return this.numberOfDays;
	}
}
