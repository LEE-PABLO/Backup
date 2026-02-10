import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add(0, "1st");
		list.add(1, "2nd");
		list.add(2, "3rd");
		
		
		
		new ReportService(new TextExporter()).print(list);
		new ReportService(new JsonExporter()).print(list);
		new ReportService(new XmlExporter()).print(list);
	}
}
