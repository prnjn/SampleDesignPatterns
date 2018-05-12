package com.design.fatoryTwo.creator;

import com.design.factoryTwo.ingredients.Cheese;
import com.design.factoryTwo.ingredients.Clams;
import com.design.factoryTwo.ingredients.Dough;
import com.design.factoryTwo.ingredients.Sauce;
import com.design.factoryTwo.ingredients.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Clams createClams();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
}
