package singleton;

public class Everland {
	private static Everland INSTANCE=new Everland();
	private Everland() {}
	public static synchronized Everland getInstance() {return INSTANCE;}
}
