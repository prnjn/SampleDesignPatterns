package com.design.decorator.decorators_condiments;

import com.design.decorator.components_beverages.Beverage;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// adding condiment name in the beverage name
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {
		// computing cost of beverage with Whip
		return beverage.cost() + .36;
	}

}
