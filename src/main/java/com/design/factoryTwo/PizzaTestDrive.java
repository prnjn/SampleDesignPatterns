package com.design.factoryTwo;

import com.design.factoryTwo.product.Pizza;
import com.design.fatoryTwo.creator.ChicagoPizzaStore;
import com.design.fatoryTwo.creator.NYPizzaStore;
import com.design.fatoryTwo.creator.PizzaStore;

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
