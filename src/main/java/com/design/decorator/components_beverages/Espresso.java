package com.design.decorator.components_beverages;

public class Espresso extends Beverage{

	public Espresso() {
		//description instance variable is inherited from Beverage
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.89;
	}

}
