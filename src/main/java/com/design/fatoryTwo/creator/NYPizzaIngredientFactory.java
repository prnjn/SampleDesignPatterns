package com.design.fatoryTwo.creator;

import com.design.factoryTwo.ingredients.Cheese;
import com.design.factoryTwo.ingredients.Clams;
import com.design.factoryTwo.ingredients.Dough;
import com.design.factoryTwo.ingredients.FreshClams;
import com.design.factoryTwo.ingredients.Garlic;
import com.design.factoryTwo.ingredients.MarinaraSauce;
import com.design.factoryTwo.ingredients.Mushroom;
import com.design.factoryTwo.ingredients.Onion;
import com.design.factoryTwo.ingredients.RegiannoCheese;
import com.design.factoryTwo.ingredients.Sauce;
import com.design.factoryTwo.ingredients.ThinCrustDough;
import com.design.factoryTwo.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new RegiannoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom()};
		return veggies;
	}
}
