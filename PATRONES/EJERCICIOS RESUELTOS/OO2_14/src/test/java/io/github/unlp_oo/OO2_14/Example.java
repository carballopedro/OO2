package io.github.unlp_oo.OO2_14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Example {

	private Car car;
	private Rental rental;
	private CombinedAsset combinedAsset;
	
	@BeforeEach
	void setUp() {
		this.car = new Car(2015, 100000, 50000);
		this.rental = new Rental(LocalDate.of(2024, 1, 1), LocalDate.of(2025, 1, 1), 1000.0);
		
		this.combinedAsset = new CombinedAsset();
		
		combinedAsset.addAsset(car);
		combinedAsset.addAsset(rental);

	}
	
	@Test
	void testValue() {
		assertEquals(50000, this.car.value());
		assertEquals(12000, this.rental.value());
		assertEquals(62000, this.combinedAsset.value());
	}
	
	@Test
	void testLiquidity() {
		assertEquals(0.7, this.car.liquidity());
		assertEquals(0.9, this.rental.liquidity());
		assertEquals(0.5, this.combinedAsset.liquidity());
	}
	
	@Test
	void testTotalValue() {
		assertEquals(35000, this.car.getTotalValue());
		assertEquals(10800, this.rental.getTotalValue());
		assertEquals(31000, this.combinedAsset.getTotalValue());
	}
	 
}
