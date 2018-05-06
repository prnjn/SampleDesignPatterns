package com.design.strategy.ducks;

import com.design.strategy.Duck;
import com.design.strategy.fly_algorithms.FlyWithWings;
import com.design.strategy.quack_algorithms.Quack;

public class MallardDuck extends Duck{
	
    	
	// instantiating quack and flybehaviour in constructor is not required if we set it dynamically 
	public MallardDuck() {
		quackBehaviour = new Quack();
		flybehaviour   = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Display Mallard Duck");
	}
	
}
