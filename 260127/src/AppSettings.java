
public class AppSettings {
	private static AppSettings instance;
	private AppSettings() {}
	public static synchronized AppSettings getInstance() {
		if (instance==null) {instance= new AppSettings(); return instance;}
		else return instance;
		}
}
