package com.design.strategy;

import com.design.strategy.ducks.MallardDuck;
import com.design.strategy.ducks.ModelDuck;
import com.design.strategy.fly_algorithms.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String args[]) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.setFlyBehaviour(new FlyRocketPowered()); // setting fly behavior dynamically
		modelDuck.performFly();
		modelDuck.performQuack();
	}
}
