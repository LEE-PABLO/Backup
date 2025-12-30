package design.factory;

import design.factory.ext.A;
import design.factory.ext.B;
import design.factory.ext.C;

public class FactoryExt {
	A make(String name) {
		if("B".equalsIgnoreCase(name)) {
			return new B();
		} 
		if("C".equalsIgnoreCase(name)) {
			return new C();
		} return null;
	}
}
