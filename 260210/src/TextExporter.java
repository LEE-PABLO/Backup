public class TextExporter implements ReportExporter{
	@Override
	public String export(String data) {
		return String.format("Text format: [%s]", data);
	}
}
