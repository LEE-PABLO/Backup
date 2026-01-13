package variousclasses;

public class Anonymousclass {
	void a() {
		//Interfaceforanonymousclass i= new Interfaceforanonymousclass() {
		//	@Override
		//	public void i() {};}
		Interfaceforanonymousclass i=()->System.out.println();//람다식
		i.i();
	} 
}

