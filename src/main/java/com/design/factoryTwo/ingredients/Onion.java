package com.design.factoryTwo.ingredients;

public class Onion implements Veggies{
	
	public Onion() {
		System.out.println("Added Onion in Veggie");
	}
	
	@Override
	public String toString() {
		return "Onion";
	}
}
