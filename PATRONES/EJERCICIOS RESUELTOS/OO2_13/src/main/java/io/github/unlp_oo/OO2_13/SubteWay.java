package io.github.unlp_oo.OO2_13;

public class SubteWay {

	private SandwichBuilder builder;
	
	// Constructor inicializa SubteWay con ClassicSandwich
	public SubteWay() {
		this.builder = new ClassicSandwich();
	}
	
	public void setBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public SandwichBuilder getBuilder() {
		return this.builder;
	}
	
	public Sandwich makeSandwich() {
		this.builder.addBread();
		this.builder.addDressing();
		this.builder.addMainIngredient();
		this.builder.addAdditionals();
		return this.builder.getSandwich();
	}
}
