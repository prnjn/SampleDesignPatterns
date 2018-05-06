package com.design.decorator.components_beverages;

public class Decaf extends Beverage{

	public Decaf() {
		//description instance variable is inherited from Beverag
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 2.9;
	}
}
