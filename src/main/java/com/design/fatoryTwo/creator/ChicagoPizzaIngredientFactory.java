package com.design.fatoryTwo.creator;

import com.design.factoryTwo.ingredients.Cheese;
import com.design.factoryTwo.ingredients.Clams;
import com.design.factoryTwo.ingredients.Dough;
import com.design.factoryTwo.ingredients.FrozenClam;
import com.design.factoryTwo.ingredients.Garlic;
import com.design.factoryTwo.ingredients.MozzarellaCheese;
import com.design.factoryTwo.ingredients.Onion;
import com.design.factoryTwo.ingredients.PlumTomatoSauce;
import com.design.factoryTwo.ingredients.Sauce;
import com.design.factoryTwo.ingredients.ThickCrustDough;
import com.design.factoryTwo.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Clams createClams() {
		return new FrozenClam();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion()};
		return veggies;
	}

}
