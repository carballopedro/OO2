package io.github.unlp_oo.OO2_13;

public abstract class SandwichBuilder {

	private Sandwich sandiwch;
	
	public void reset() {
		this.sandiwch = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandiwch;
	}
	
	public abstract void addBread();
	public abstract void addDressing();
	public abstract void addMainIngredient();
	public abstract void addAdditionals();
	
}
