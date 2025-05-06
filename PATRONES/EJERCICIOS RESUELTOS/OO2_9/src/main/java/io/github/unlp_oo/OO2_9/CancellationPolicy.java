package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public interface CancellationPolicy {

	public double getRefundAmount(Booking booking, LocalDate tentativeDate);
}
