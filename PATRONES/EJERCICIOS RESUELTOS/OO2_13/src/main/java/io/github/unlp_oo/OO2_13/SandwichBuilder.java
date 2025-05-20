package io.github.unlp_oo.OO2_13;

public abstract class SandwichBuilder {

	private Sandwich sandiwch;
	
	// reset privado
	// ademas el director no deberia hacerse cargo de hacer reset
	// lo hace el mismo builder
	private void reset() {
		this.sandiwch = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		Sandwich temp = this.sandiwch;
		reset();
		return temp;
	}
	
	public abstract void addBread();
	public abstract void addDressing();
	public abstract void addMainIngredient();
	public abstract void addAdditionals();
	
}
