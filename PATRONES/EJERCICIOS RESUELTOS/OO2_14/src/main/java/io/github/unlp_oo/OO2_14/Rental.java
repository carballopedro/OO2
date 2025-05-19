package io.github.unlp_oo.OO2_14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental extends Asset {

	private LocalDate startDate;
	private LocalDate endDate;
	private double monthlyRent;
	
	public Rental(LocalDate startDate, LocalDate endDate, double monthlyRent) {
		// necesito super() ?
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.monthlyRent = monthlyRent;
	}
	
	public double liquidity() {
		return 0.9;
	}
	
	public double value() {
		return this.remainaingMonths() * this.monthlyRent;
	}
	
	public int remainaingMonths() {
		return (int) ChronoUnit.MONTHS.between(startDate, endDate);
	}
}
