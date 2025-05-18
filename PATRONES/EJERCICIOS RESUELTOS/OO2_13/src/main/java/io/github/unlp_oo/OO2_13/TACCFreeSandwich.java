package io.github.unlp_oo.OO2_13;

public class TACCFreeSandwich  extends SandwichBuilder {

	public void addBread() {
		this.getSandwich().setBread("Pan de chipá");
		this.getSandwich().setBreadsPrice(150);
	}
	public void addDressing() {
		this.getSandwich().setDressing("Salsa tártara");
		this.getSandwich().setDressingsPrice(18);
	}
	public void addMainIngredient() {
		this.getSandwich().setMainIngredient("Carne de pollo");
		this.getSandwich().setMainIngredientsPrice(250);
	}
	public void addAdditionals() {
		this.getSandwich().setAdditional("Verduras grilladas");
		this.getSandwich().setAdditionalsPrice(200);
	}
}
