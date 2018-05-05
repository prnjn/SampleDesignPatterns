package com.design.strategy.quack_algorithms;

public class MuteQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
