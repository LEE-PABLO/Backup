package singleton;

public enum A {
	INSTANCE;
	private int a=10;
	int a(int a) {return this.a+a;}
}
