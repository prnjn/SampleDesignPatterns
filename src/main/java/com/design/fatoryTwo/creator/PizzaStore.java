package com.design.fatoryTwo.creator;

import com.design.factoryTwo.product.Pizza;

public abstract  class PizzaStore {
	public Pizza orderPizza(String item) {
		Pizza pizza = null;
		
		pizza = createPizza(item);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
