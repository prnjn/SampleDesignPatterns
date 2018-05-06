package com.design.decorator.decorators_condiments;

import com.design.decorator.components_beverages.Beverage;

// Remember CondimentDecorator extends Beverage
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// adding condiment name in the beverage name
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		// computing cost of beverage with Mocha
		return beverage.cost() + .21;
	}
}
