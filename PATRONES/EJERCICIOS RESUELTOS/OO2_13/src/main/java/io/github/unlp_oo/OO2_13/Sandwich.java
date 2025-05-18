package io.github.unlp_oo.OO2_13;

public class Sandwich {

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
