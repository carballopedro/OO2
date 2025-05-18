package io.github.unlp_oo.OO2_13;

public class VegetarianSandwich extends SandwichBuilder {

	public void addBread() {
		this.getSandwich().setBread("Pan con semillas");
		this.getSandwich().setBreadsPrice(120);
	}
	public void addDressing() {
		this.getSandwich().setDressing("Sin aderezo");
		this.getSandwich().setDressingsPrice(0);
	}
	public void addMainIngredient() {
		this.getSandwich().setMainIngredient("Provoleta grillada");
		this.getSandwich().setMainIngredientsPrice(200);
	}
	public void addAdditionals() {
		this.getSandwich().setAdditional("Berenjenas al escabeche");
		this.getSandwich().setAdditionalsPrice(100);
	}
}
