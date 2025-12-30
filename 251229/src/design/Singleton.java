package design;

public class Singleton {
	private static Singleton INSTANCE=new Singleton();
	private Singleton() {}
	public static synchronized Singleton getInstance() {return INSTANCE;}
}
