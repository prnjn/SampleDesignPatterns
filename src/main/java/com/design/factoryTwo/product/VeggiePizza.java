package com.design.factoryTwo.product;
import com.design.fatoryTwo.creator.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing "+ name);
		
		// each time it needs ingredients , it ask the factory to produce it
		pizzaIngredientFactory.createCheese();
		pizzaIngredientFactory.createDough();
		pizzaIngredientFactory.createSauce();
		pizzaIngredientFactory.createVeggies();
	}
}

