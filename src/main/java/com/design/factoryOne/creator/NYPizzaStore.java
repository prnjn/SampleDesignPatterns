package com.design.factoryOne.creator;

import com.design.factoryOne.product.NYStyleCheesePizza;
import com.design.factoryOne.product.NYStyleClamPizza;
import com.design.factoryOne.product.NYStylePepperoniPizza;
import com.design.factoryOne.product.NYStyleVeggiePizza;
import com.design.factoryOne.product.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else if(item.equals("Veggie")) {
			return new NYStyleVeggiePizza();
		}else if(item.equals("clam")) {
			return new NYStyleClamPizza();
		}else if(item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		}else return null;
	}
}
