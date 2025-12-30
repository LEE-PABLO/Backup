package design.factory;

import design.factory.impl.A;
import design.factory.impl.B;
import design.factory.impl.C;

public class Factoryimpl {
	A make(String name) {
		if("B".equalsIgnoreCase(name)) {
			return new B();
		} 
		if("C".equalsIgnoreCase(name)) {
			return new C();
		} return null;
	}
}

