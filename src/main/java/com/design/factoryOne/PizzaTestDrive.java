package com.design.factoryOne;

import com.design.factoryOne.creator.ChicagoPizzaStore;
import com.design.factoryOne.creator.NYPizzaStore;
import com.design.factoryOne.creator.PizzaStore;
import com.design.factoryOne.product.Pizza;

public class PizzaTestDrive {
	
	public static void main(String args[]) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza NYCheesePizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + NYCheesePizza.getName());
		
		System.out.println("******************************************");
		
		Pizza ChicagoVeggiePizza = chicagoStore.orderPizza("Veggie");
		System.out.println("Joel ordered a " + ChicagoVeggiePizza.getName());
	}
}
