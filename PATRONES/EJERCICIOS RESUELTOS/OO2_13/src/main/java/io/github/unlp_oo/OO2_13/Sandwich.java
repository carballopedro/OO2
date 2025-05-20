package io.github.unlp_oo.OO2_13;

public class Sandwich {
	
	// podria seguir la misma logica que el ej 15
	// tener una lista de componentes (bread, dressing, etc)
	// que cada componente conozca su precio
	// y tal vez tener un catalogo de componentes
	// para evitar tener setters
	// mucho codigo y ademas son publicos y no esta muy bueno
	// ademas, si yo quisiera una hamburguesa diferente en el futuro, no podria usar este codigo
	// poca reusabilidad si yo quiero agregar un componente
	
	private String bread;
	private double breadsPrice;
	private String dressing;
	private double dressingsPrice;
	private String mainIngredient;
	private double mainIngredientsPrice;
	private String additional;
	private double additionalsPrice;
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public void setBreadsPrice(double breadsPrice) {
		this.breadsPrice = breadsPrice;
	}
	
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	
	public void setDressingsPrice(double dressingsPrice) {
		this.dressingsPrice = dressingsPrice;
	}
	
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	
	public void setMainIngredientsPrice(double mainIngredientsPrice) {
		this.mainIngredientsPrice = mainIngredientsPrice;
	}
	
	public void setAdditional(String additional) {
		this.additional = additional;
	}
	
	public void setAdditionalsPrice(double additionalsPrice) {
		this.additionalsPrice = additionalsPrice;
	}
	
	public double calculatePrice() {
		return this.breadsPrice + this.dressingsPrice + this.mainIngredientsPrice + this.additionalsPrice;
	}

}
