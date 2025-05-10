package io.github.unlp_oo.OO2_11;

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
	
	@BeforeEach
	void setUp() {
		this.t1 = new Water();
		this.t2 = new Land();
		this.mixt1 = new MixedTopography(t1, t2, t2, t1);
		this.mixt2 = new MixedTopography(t1, t2, t2, t1);
		this.mixt3 = new MixedTopography(t2, t2, t1, t1);
		this.mixt4 = new MixedTopography(t1, t2, t2, this.mixt1);
	}
	
	@Test
	void testGetWaterProportion() {
		assertEquals(this.t1.getWaterProportion(), 1);
		assertEquals(this.t2.getWaterProportion(), 0);
		assertEquals(this.mixt1.getWaterProportion(), 0.5);
		assertEquals(this.mixt2.getWaterProportion(), 0.5);
		assertEquals(this.mixt3.getWaterProportion(), 0.5);
		assertEquals(this.mixt4.getWaterProportion(), 0.375);
	}
	
	@Test
	void testGetLandProportion() {
		assertEquals(this.t1.getLandProportion(), 0);
		assertEquals(this.t2.getLandProportion(), 1);
		assertEquals(this.mixt1.getLandProportion(), 0.5);
		assertEquals(this.mixt2.getLandProportion(), 0.5);
		assertEquals(this.mixt3.getLandProportion(), 0.5);
		assertEquals(this.mixt4.getLandProportion(), 0.625);
	}
	
	@Test
	void testIsEqual() {
		assertTrue(this.t1.isEqual(new Water()));
		assertFalse(this.t1.isEqual(this.t2));
		assertTrue(this.t2.isEqual(new Land()));
		assertFalse(this.t2.isEqual(this.t1));

		assertFalse(this.mixt1.isEqual(new Water()));
		assertFalse(this.mixt1.isEqual(new Land()));

		assertTrue(this.mixt1.equals(new MixedTopography(new Water(),new Land(),new Land(),new Water())));
		assertTrue(this.mixt4.equals(new MixedTopography(new Water(),new Land(),new Land(), this.mixt1)));

		assertTrue(this.mixt1.isEqual(this.mixt2));
		
		assertFalse(this.mixt1.isEqual(this.mixt3));
		assertFalse(this.mixt2.isEqual(mixt4));	
	}
}
