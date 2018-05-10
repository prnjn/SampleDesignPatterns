package com.design.factoryOne.product;

public class ChicagoStyleClamPizza extends Pizza{
	
	public ChicagoStyleClamPizza() {
		name = "Chicago style clam pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into equal slices");
	}
}
