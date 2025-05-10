package io.github.unlp_oo.OO2_11B;

public class Swamp extends Topography{

	public double getWaterProportion() {
		return (double)0.7;
	}
	
	// para evitar que cualquier topografía con proporción de agua 0.7 sea considerada igual a un Swamp
	@Override
	public boolean isEqual(Topography t) {
	    return t instanceof Swamp;
	}
}
