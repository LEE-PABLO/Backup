
public class AdvancedSingleton {
	private static class AdvancedSingleton_Inner{ 
	private static AdvancedSingleton INSTANCE=new AdvancedSingleton();}
	private AdvancedSingleton() {}
	public static synchronized AdvancedSingleton getInstance() {return AdvancedSingleton_Inner.INSTANCE;}
}
