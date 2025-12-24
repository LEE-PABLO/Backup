package Fruit;

import Fruit.extend.Apple;

public class Market {
	Fruit[] fruits;
	void buy(Fruit fruit) {
		fruits[0]=fruit;
	}
	
	Fruit sell(String name) {
		if("Apple".equals(name)) {
			return new Apple();
		}
		return null;
	} 
}
