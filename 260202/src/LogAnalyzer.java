import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogAnalyzer {
	
	static void analyze(List<String> logs) {
		int max=0;
		String maxId=null;
		Set<String> unique=new HashSet<>(logs);
		Map<String, Integer> map=new HashMap<>();
		for(String id:logs) {
		map.put(id, map.getOrDefault(id, 0) + 1);}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > max) {
		        max = entry.getValue();
		        maxId = entry.getKey();
		    }
		}
		System.out.println("[로그 분석 결과]");
		System.out.printf("총 접속 횟수: %d회\n", logs.size());
		System.out.printf("고유 방문자 수: %d회 ", unique.size());
		System.out.println(unique);
		System.out.println();
		System.out.println("[접속 통계]");
		map.forEach((id, count)->System.out.printf("%s: %d회\n",id,count));
		System.out.println();
		System.out.printf("최다 접속자: %s (%d회)",maxId,max);
	}
}
