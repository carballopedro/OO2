package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public class Strict implements CancellationPolicy {

	
	//Si el automóvil tiene política de cancelación estricta, no se reembolsará nada (0, cero)
	// sin importar la fecha tentativa de cancelación.  
	public double getRefundAmount(Booking booking, LocalDate tentativeDate) {
		return 0;
	}
}
