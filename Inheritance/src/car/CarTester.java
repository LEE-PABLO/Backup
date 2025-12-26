package car;

import car.sedan.Sonata;

public class CarTester {

	public static void main(String[] args) {
		Car c=new Sonata();
		Car c1=new Mustang();
		if (c==c1) {System.out.println("true");
	}else {System.out.println("false");
	}
	}

}
