package com.design.fatoryTwo.creator;


import com.design.factoryTwo.product.Pizza;
import com.design.factoryTwo.product.CheesePizza;
import com.design.factoryTwo.product.ClamPizza;
import com.design.factoryTwo.product.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
	
	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
	
	@Override
	protected Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			pizza = new  CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}else if(item.equals("Veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}else if(item.equals("clam")) {
			pizza =  new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}
		return pizza;
	}
}
