package com.design.decorator.decorators_condiments;

import com.design.decorator.components_beverages.Beverage;

// We need to be interchangeable with a Beverage, so we extend Beverage class
public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
