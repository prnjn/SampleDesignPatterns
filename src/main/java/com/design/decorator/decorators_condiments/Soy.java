package com.design.decorator.decorators_condiments;

import com.design.decorator.components_beverages.Beverage;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// adding condiment name in the beverage name
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		// computing cost of beverage with Soy
		return beverage.cost() + .16;
	}
}
