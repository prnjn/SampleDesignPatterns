package com.design.strategy;

import com.design.strategy.ducks.MallardDuck;
import com.design.strategy.ducks.ModelDuck;
import com.design.strategy.ducks.RubberDuck;
import com.design.strategy.ducks.WoodenDuck;
import com.design.strategy.fly_algorithms.FlyNoWay;
import com.design.strategy.fly_algorithms.FlyRocketPowered;
import com.design.strategy.quack_algorithms.MuteQuack;
import com.design.strategy.quack_algorithms.Squeak;

public class MiniDuckSimulator {
	
	public static void main(String args[]) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.setFlyBehaviour(new FlyRocketPowered()); // setting fly behavior dynamically
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		
		Duck woodenDuck = new WoodenDuck();
		woodenDuck.setFlyBehaviour(new FlyNoWay()); // setting fly behavior dynamically
		woodenDuck.setQuackBehavioyr(new MuteQuack()); // setting quack behavior dynamically
		woodenDuck.display();
		woodenDuck.performFly();
		woodenDuck.performQuack();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyNoWay());
		rubberDuck.setQuackBehavioyr(new Squeak());
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
