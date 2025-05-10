package io.github.unlp_oo.OO2_11B;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopography {

	private Topography t1;
	private Topography t2;
	
	private Topography mixt1;
	private Topography mixt2;
	private Topography mixt3;
	
	private Topography mixt4;
	
	// Swamp
	private Topography s;
	private Topography mixs1;
	private Topography mixs2;

	@BeforeEach
	void setUp() {
		this.t1 = new Water();
		this.t2 = new Land();
		this.mixt1 = new MixedTopography(t1, t2, t2, t1);
		this.mixt2 = new MixedTopography(t1, t2, t2, t1);
		this.mixt3 = new MixedTopography(t2, t2, t1, t1);
		this.mixt4 = new MixedTopography(t1, t2, t2, this.mixt1);
		
		// Swamp
		this.s = new Swamp();
		this.mixs1 = new MixedTopography(new Water(),new Swamp(),new Land(),new Swamp());
		this.mixs2 = new MixedTopography(new Water(),new Land(),new Land(), this.mixs1);
	}
	
	@Test
	void testGetWaterProportion() {
		assertEquals(this.t1.getWaterProportion(), 1);
		assertEquals(this.t2.getWaterProportion(), 0);
		assertEquals(this.mixt1.getWaterProportion(), 0.5);
		assertEquals(this.mixt2.getWaterProportion(), 0.5);
		assertEquals(this.mixt3.getWaterProportion(), 0.5);
		assertEquals(this.mixt4.getWaterProportion(), 0.375);
		
		// Swamp
		assertEquals(this.s.getWaterProportion(), 0.7);
		assertEquals(this.mixs1.getWaterProportion(), 0.6);
		assertEquals(this.mixs2.getWaterProportion(), 0.4);
	}
	
	@Test
	void testGetLandProportion() {
		assertEquals(this.t1.getLandProportion(), 0);
		assertEquals(this.t2.getLandProportion(), 1);
		assertEquals(this.mixt1.getLandProportion(), 0.5);
		assertEquals(this.mixt2.getLandProportion(), 0.5);
		assertEquals(this.mixt3.getLandProportion(), 0.5);
		assertEquals(this.mixt4.getLandProportion(), 0.625);
		
		// Swamp
		// Math.round para redondear resultado a un solo decimal
		assertEquals((Math.round(this.s.getLandProportion() * 100) / 100.0), 0.3);
		assertEquals((Math.round(this.mixs1.getLandProportion() * 100) / 100.0), 0.4);
		assertEquals((Math.round(this.mixs2.getLandProportion() * 100) / 100.0), 0.6);
	}
	
	@Test
	void testIsEqual() {
		// Water
		assertTrue(this.t1.isEqual(new Water()));
		assertFalse(this.t1.isEqual(this.t2));
		assertFalse(this.t1.isEqual(this.s));
		
		// Land
		assertTrue(this.t2.isEqual(new Land()));
		assertFalse(this.t2.isEqual(this.t1));
		assertFalse(this.t2.isEqual(this.s));
		
		// Swamp
		assertTrue(this.s.isEqual(new Swamp()));
		assertFalse(this.s.isEqual(this.t1));
		assertFalse(this.s.isEqual(this.t2));

		// Mix1
		assertFalse(this.mixt1.isEqual(new Water()));
		assertFalse(this.mixt1.isEqual(new Land()));
		assertFalse(this.mixt1.isEqual(new Swamp()));

		assertTrue(this.mixt1.isEqual(new MixedTopography(new Water(),new Land(),new Land(),new Water())));
		assertTrue(this.mixt4.isEqual(new MixedTopography(new Water(),new Land(),new Land(), this.mixt1)));

		assertTrue(this.mixt1.isEqual(this.mixt2));
		
		assertFalse(this.mixt1.isEqual(this.mixt3));
		assertFalse(this.mixt2.isEqual(mixt4));	
		
		
		// Swamp mixes
		
		assertTrue(this.mixs1.isEqual(new MixedTopography(new Water(),new Swamp(),new Land(),new Swamp())));
		assertTrue(this.mixs2.isEqual(new MixedTopography(new Water(),new Land(),new Land(), this.mixs1)));
		
		// same components but different order
		assertFalse(this.mixs1.isEqual(new MixedTopography(new Swamp(), new Water(),new Land(),new Swamp())));
		
		assertFalse(this.mixs1.isEqual(this.mixt1));
		assertFalse(this.mixs1.isEqual(this.mixt2));
		assertFalse(this.mixs1.isEqual(this.mixt3));
		assertFalse(this.mixs1.isEqual(this.mixt4));
		assertFalse(this.mixs1.isEqual(this.mixs2));
		
		assertFalse(this.mixs2.isEqual(this.mixt1));
		assertFalse(this.mixs2.isEqual(this.mixt2));
		assertFalse(this.mixs2.isEqual(this.mixt3));
		assertFalse(this.mixs2.isEqual(this.mixt4));
		assertFalse(this.mixs2.isEqual(this.mixs1));


	
	}
}
