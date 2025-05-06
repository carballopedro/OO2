package io.github.unlp_oo.OO2_9;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		User user = new User("Pedro");
		
		// Auto con política flexible
        RentalCar car = new RentalCar(100.0, 5, "Audi", new Flexible());
        
        // Reserva del 10 al 15 de abril (5 días)
        Booking booking = new Booking(5, LocalDate.of(2025, 4, 10), user, car);
        
        // Cancelación el 5 de abril → antes del inicio
        System.out.println("Reembolso con política flexible: $" + booking.getRefundAmount(LocalDate.of(2025, 4, 5)));
        
        // Cambiar a política moderada
        car.setCancellationPolicy(new Moderate());
        
	    System.out.println("Reembolso con política moderada (8 días antes): $" +
	    booking.getRefundAmount(LocalDate.of(2025, 4, 2))); // 100%
	    
        System.out.println("Reembolso con política moderada (5 días antes): $" +
	    booking.getRefundAmount(LocalDate.of(2025, 4, 5))); // 50%

	    System.out.println("Reembolso con política moderada (1 día antes): $" +
	    booking.getRefundAmount(LocalDate.of(2025, 4, 9))); // 0%
	}

	
}
