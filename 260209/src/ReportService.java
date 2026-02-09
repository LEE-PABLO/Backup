public class ReportService {
	ReportExporter re;
 public ReportService(ReportExporter re) {this.re=re;}
 public void print(String data) {System.out.println(re.export(data));}
}
