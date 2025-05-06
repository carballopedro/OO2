package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public class Flexible implements CancellationPolicy {

	// Si el automóvil tiene política de cancelación flexible, se reembolsará el monto total
	// sin importar la fecha de cancelación (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). 
	public double getRefundAmount(Booking booking, LocalDate tentativeDate) {
		if (!tentativeDate.isBefore(booking.getDate())) {
			return booking.getAmountToPay();
		}
		else
			return 0;
	}
}
