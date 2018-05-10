package com.design.factoryOne.product;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago style cheese pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into equal slices");
	}
}
