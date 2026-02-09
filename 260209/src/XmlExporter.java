public class XmlExporter implements ReportExporter{
	@Override
	public String export(String data) {
		return String.format("<xml>%s</xml>", data);
	}
}
