import date.Localdate;
import stream.File;

public class Tester {

	public static void main(String[] args) {
		new Localdate().seoulzone();
		new Localdate().zoneids();
		new Localdate().zoneid();
		new Localdate().datemanipulation();
		new Localdate().timemanipulation();
		new Localdate().zoneddatetime();
		new Localdate().zoneddatetimemanipulation();
		new Localdate().between();
		new Localdate().buisnessdays();
		new Localdate().formatting();
		new File().filewriter();
		new File().filereader();
		new File().bufferedreader();
		new File().copyBinaryFile("a.jpg", "b.jpg");
		new File().path();
		new File().files();
	}
}
