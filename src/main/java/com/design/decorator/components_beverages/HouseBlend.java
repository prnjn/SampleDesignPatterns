package com.design.decorator.components_beverages;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		//description instance variable is inherited from Beverag
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 2.9;
	}
}
