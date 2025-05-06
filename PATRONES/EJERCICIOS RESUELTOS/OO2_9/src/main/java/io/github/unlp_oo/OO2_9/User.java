package io.github.unlp_oo.OO2_9;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private List<RentalCar> rentalCars;;
	
	public User (String name) {
		this.name = name;
		this.rentalCars = new ArrayList<RentalCar>();
	}
	
	public void addRentalCar(RentalCar rentalCar) {
		this.rentalCars.add(rentalCar);
	}
}
