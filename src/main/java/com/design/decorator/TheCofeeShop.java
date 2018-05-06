package com.design.decorator;

import com.design.decorator.components_beverages.Beverage;
import com.design.decorator.components_beverages.DarkRoast;
import com.design.decorator.components_beverages.Espresso;
import com.design.decorator.components_beverages.HouseBlend;
import com.design.decorator.decorators_condiments.Mocha;
import com.design.decorator.decorators_condiments.Soy;
import com.design.decorator.decorators_condiments.Whip;

public class TheCofeeShop {
	
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ": $ "+ beverage.cost());
		
		//Dark roast double mocha with whip
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + ": $ "+ beverage2.cost());
		
		//House Blend with Soy , mocha and whip
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + ": $ "+ beverage3.cost());
	}
}
