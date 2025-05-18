package io.github.unlp_oo.OO2_13;

public class VeganSandwich extends SandwichBuilder {

	public void addBread() {
		this.getSandwich().setBread("Pan integral");
		this.getSandwich().setBreadsPrice(100);
	}
	public void addDressing() {
		this.getSandwich().setDressing("Salsa criolla");
		this.getSandwich().setDressingsPrice(20);
	}
	public void addMainIngredient() {
		this.getSandwich().setMainIngredient("Milanesa de girgolas");
		this.getSandwich().setMainIngredientsPrice(500);
	}
	public void addAdditionals() {
		this.getSandwich().setAdditional("Sin adicional");
		this.getSandwich().setAdditionalsPrice(0);
	}
}
