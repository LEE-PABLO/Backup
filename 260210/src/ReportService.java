import java.util.List;

public class ReportService {
	ReportExporter re;
 public ReportService(ReportExporter re) {this.re=re;}
 public void print(List<String> dataList) {for (String s:dataList) {System.out.println(re.export(s));}}
}
