public class JsonExporter implements ReportExporter{
	@Override
	public String export(String data) {
		return String.format("{ data: [%s] }", data);
	}

}
