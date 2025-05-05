package io.github.unlp_oo.OO2_2;

public abstract class Personal {
	
	public double sueldo() {
		return this.basico()+ this.adicional()- this.descuentos(); }
	
	public double descuentos() {
		return (this.basico() * 0.13) + (this.adicional() * 0.05);
	}
	
	public abstract double basico();
	public abstract double adicional();
	
}
