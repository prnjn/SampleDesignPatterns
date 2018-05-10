package com.design.factoryOne.product;

public class ChicagoStyleVeggiePizza extends Pizza{
	
	public ChicagoStyleVeggiePizza() {
		name = "Chicago style veggie pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into equal slices");
	}
}
