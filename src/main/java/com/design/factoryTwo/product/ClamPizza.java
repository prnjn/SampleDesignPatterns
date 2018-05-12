package com.design.factoryTwo.product;

import com.design.fatoryTwo.creator.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing "+ name);
		
		// each time it needs ingredients , it ask the factory to produce it
		pizzaIngredientFactory.createCheese();
		pizzaIngredientFactory.createDough();
		pizzaIngredientFactory.createSauce();
		
		// for NY Fresh clam and for Chicago Frozen clam will be created
		pizzaIngredientFactory.createClams();
	}
}
