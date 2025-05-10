package io.github.unlp_oo.OO2_11;

public abstract class Topography {

	public abstract double getWaterProportion();
	
	public double getLandProportion() {
		return 1 - this.getWaterProportion();
	}
	
	// Double.compare --> forma más segura y recomendada para comparar valores de tipo double
	public boolean isEqual(Topography t) {
		return Double.compare(this.getWaterProportion(), t.getWaterProportion()) == 0;
	}
	
	// DEBO REDEFINIRLA PARA QUE LA COMPARACION DE TOPOGRAFIA MIXTA SEA EN CUANDO A PROPORCION
	 // SI NO LO REDEFINO ENTONCES ME COMPARA SI ES EL MISMO OBJETO (misma referencia a memoria) 
	@Override
	public  boolean equals(Object object) {
		// verifica que objeto sea realmente una instancia de Topography antes de hacer el cast
		if (!(object instanceof Topography))
			{
			return false;
			}
		
	    // Se realiza el cast manual después de verificar el tipo
	    Topography other = (Topography) object;

	    // Llamamos a isEqual para comparar el contenido
	    return this.isEqual(other);
	}
}
