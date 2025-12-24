package Fruit;

import Fruit.extend.Apple;

public class FruitTester {

	public static void main(String[] args) {
		Fruit fruit=new Apple();
		if (fruit instanceof Apple) {
			Apple apple=(Apple)fruit;
		}
	}

}
