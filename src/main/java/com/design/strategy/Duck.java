package com.design.strategy;

import com.design.strategy.fly_algorithms.FlyBehaviour;
import com.design.strategy.quack_algorithms.QuackBehaviour;

public abstract class Duck {
	protected FlyBehaviour flybehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flybehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All the Ducks float, even the decoys");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flybehaviour = fb;
	}
	
	public void setQuackBehavioyr(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
