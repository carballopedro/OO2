package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderate implements CancellationPolicy {

	// Si el automóvil tiene política de cancelación moderada, se reembolsará el monto total
	// si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes.
	public double getRefundAmount(Booking booking, LocalDate tentativeDate) {
		int aux = this.daysBetween(tentativeDate, booking.getDate());
		return (aux >= 7) ? booking.getAmountToPay() :
		       (aux >= 2) ? booking.getAmountToPay() * 0.5 : 0;
		
	}
	
	public int daysBetween(LocalDate tentativeDate, LocalDate realDate) {
		return (int)ChronoUnit.DAYS.between(tentativeDate, realDate);
	}
	
}
