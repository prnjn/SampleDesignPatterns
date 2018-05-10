package com.design.factoryOne.creator;

import com.design.factoryOne.product.ChicagoStyleCheesePizza;
import com.design.factoryOne.product.ChicagoStyleClamPizza;
import com.design.factoryOne.product.ChicagoStylePepperoniPizza;
import com.design.factoryOne.product.ChicagoStyleVeggiePizza;
import com.design.factoryOne.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("Veggie")) {
			return new ChicagoStyleVeggiePizza();
		}else if(item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		}else if(item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}else return null;
	}
}
