package car.factory;

import car.Car;
import car.ext.Mustang;
import car.ext.Sonata;

public class CarFactory {
	Car makeCar(String name) {
		if("sonata".equalsIgnoreCase(name)) {return new Sonata();}
		if("mustang".equalsIgnoreCase(name)) {return new Mustang();}
		return null;}
}