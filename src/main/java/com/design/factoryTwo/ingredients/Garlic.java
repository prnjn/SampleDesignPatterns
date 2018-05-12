package com.design.factoryTwo.ingredients;

public class Garlic implements Veggies{
	
	public Garlic() {
		System.out.println("Added Galic in Veggie");
	}
	
	@Override
	public String toString() {
		return "Garlic";
	}
}
