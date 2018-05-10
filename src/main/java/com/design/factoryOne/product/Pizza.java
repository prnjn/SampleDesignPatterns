package com.design.factoryOne.product;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough..."+dough);
		System.out.println("Adding sauce..."+sauce);
		System.out.println("Adding Toppings...");
		for(String topping : toppings) {
			System.out.println(" "+topping);
		}
	}
	
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
}
