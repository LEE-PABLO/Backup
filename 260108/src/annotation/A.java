package annotation;

public class A {
	@Hello
	void a(String s) {System.out.printf("Invoked %s",s);};
	@Deprecated
	void a2() {}
	
}
