package com.design.fatoryTwo.creator;

import com.design.factoryTwo.product.CheesePizza;
import com.design.factoryTwo.product.ClamPizza;
import com.design.factoryTwo.product.Pizza;
import com.design.factoryTwo.product.VeggiePizza;

public class NYPizzaStore extends PizzaStore{

	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
	
	@Override
	protected Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			pizza = new  CheesePizza(ingredientFactory);
			pizza.setName("NY Style Cheese Pizza");
		}else if(item.equals("Veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("NY Style Veggie Pizza");
		}else if(item.equals("clam")) {
			pizza =  new ClamPizza(ingredientFactory);
			pizza.setName("NY Style Clam Pizza");
		}
		return pizza;
	}
}
