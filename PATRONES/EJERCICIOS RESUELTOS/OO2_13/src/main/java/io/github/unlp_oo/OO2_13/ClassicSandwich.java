package io.github.unlp_oo.OO2_13;

public class ClassicSandwich extends SandwichBuilder {

	
	// las clases concretas deberian concoer al producto sandwich?
	// o está bien que la clase abstracta conozca al producto sandwich?
	
	public void addBread() {
		this.getSandwich().setBread("Brioche");
		this.getSandwich().setBreadsPrice(100);
	}
	public void addDressing() {
		this.getSandwich().setDressing("Mayonesa");
		this.getSandwich().setDressingsPrice(20);
	}
	public void addMainIngredient() {
		this.getSandwich().setMainIngredient("Carne de ternera");
		this.getSandwich().setMainIngredientsPrice(300);
	}
	public void addAdditionals() {
		this.getSandwich().setAdditional("Tomate");
		this.getSandwich().setAdditionalsPrice(80);
	}
}
