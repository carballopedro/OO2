package io.github.unlp_oo.OO2_11B;

public class Land extends Topography {

	public double getWaterProportion() {
		return 0;
	}
	
	// para evitar que cualquier topografía con proporción de agua 0 sea considerada igual a un Land
	@Override
	public boolean isEqual(Topography t) {
	    return t instanceof Land;
	}

}
