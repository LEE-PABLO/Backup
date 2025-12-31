package capinpoly;

public class Customer {
	StarbucksTokyo t= new StarbucksTokyo();
	StarbucksOsaka o= new StarbucksOsaka();
	void getCoffee() {
		t.makeCoffee();
		o.makeCoffee();
	}
}
