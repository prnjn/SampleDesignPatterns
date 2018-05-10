package com.design.factoryOne.product;

public class ChicagoStylePepperoniPizza extends Pizza {
	
	public ChicagoStylePepperoniPizza() {
		name = "Chicago style pepperoni pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into equal slices");
	}
}
