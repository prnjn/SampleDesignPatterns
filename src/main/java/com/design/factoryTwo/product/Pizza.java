package com.design.factoryTwo.product;

import com.design.factoryTwo.ingredients.Cheese;
import com.design.factoryTwo.ingredients.Clams;
import com.design.factoryTwo.ingredients.Dough;
import com.design.factoryTwo.ingredients.Sauce;
import com.design.factoryTwo.ingredients.Veggies;

public abstract class Pizza {
	
	String name;
	
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams clams;
	Veggies veggies[];
	
	
	//We have now made prepare method abstract
	// This is where we are going to collect ingredients needed for the pizza
	// which will come from ingredient factory
	abstract public void prepare();
	
	public void bake() {
		System.out.println("bake for 25 min at 350");
	}
	
	public void cut() {
		System.out.println("cutting the pizza into diagonal pieces");
	}
	
	public void box() {
		System.out.println("place pizza in official pizzaStore Box");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
