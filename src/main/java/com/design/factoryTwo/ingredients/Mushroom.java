package com.design.factoryTwo.ingredients;

public class Mushroom implements Veggies{
	
	public Mushroom() {
		System.out.println("Added Mushroom in Veggie");
	}
	
	@Override
	public String toString() {
		return "Mushroom";
	}
}
