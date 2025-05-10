package io.github.unlp_oo.OO2_11B;

public class Water extends Topography {

	public double getWaterProportion() {
		return 1;
	}
	
	// para evitar que cualquier topografía con proporción de agua 1 sea considerada igual a un Water
	@Override
	public boolean isEqual(Topography t) {
	    return t instanceof Water;
	}
}
