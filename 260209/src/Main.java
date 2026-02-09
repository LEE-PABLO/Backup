public class Main {

	public static void main(String[] args) {
		new ReportService(new TextExporter()).print("매출데이터");
		new ReportService(new JsonExporter()).print("매출데이터");
		new ReportService(new XmlExporter()).print("매출데이터");
	}
}
