package com.design.strategy.ducks;

import com.design.strategy.Duck;
import com.design.strategy.fly_algorithms.FlyNoWay;
import com.design.strategy.quack_algorithms.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flybehaviour = new FlyNoWay(); // model duck starts life grounded... without a way to fly
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Display Model duck");
	}
}
