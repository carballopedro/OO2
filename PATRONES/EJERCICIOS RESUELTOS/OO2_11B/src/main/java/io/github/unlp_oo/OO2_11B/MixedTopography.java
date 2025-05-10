package io.github.unlp_oo.OO2_11B;

import java.util.ArrayList;
import java.util.List;

public class MixedTopography extends Topography {

	private List<Topography> components;
	
	public MixedTopography (Topography t1, Topography t2, Topography t3, Topography t4) {
		this.components = new ArrayList<Topography>();
		this.components.add(t1);
		this.components.add(t2);
		this.components.add(t3);
		this.components.add(t4);
	}
	
	public List<Topography> getComponents(){
		return this.components;
	}
	
	public double getWaterProportion() {
	    return components.stream()
                .limit(4) // Limita el stream a los primeros 4 elementos // no es necesario pero es buena práctica
                .mapToDouble(Topography::getWaterProportion)
                .average()
                .orElse(0.0); // Aunque se asegura de que haya 4 // no es necesario pero es buena práctica
	}
	
	@Override
	public boolean isEqual(Topography t) {
		// verifica que objeto sea realmente una instancia de MixedTopography antes de hacer el cast
	    if (!(t instanceof MixedTopography)) {
	        return false;
	    }
	    
	    // Se realiza el cast manual después de verificar el tipo
	    MixedTopography other = (MixedTopography) t;

	    // Comparamos las listas de componentes
	    return this.components.equals(other.getComponents());
	}

}
