import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnswerSheet {
	static void analyze(List<String> logs) {
        // 1. 중복 제거 (Set 활용)
        Set<String> unique = new HashSet<>(logs);

        // 2. 횟수 카운팅 (Map 활용)
        Map<String, Integer> map = new HashMap<>();
        for (String id : logs) {
            map.put(id, map.getOrDefault(id, 0) + 1);
        }

        // 3. 최다 접속자 찾기 (로직용 변수는 메소드 안에서 선언!)
        int max = 0;
        String maxId = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxId = entry.getKey();
            }
        }

        // 4. 결과 출력
        System.out.println("[로그 분석 결과]");
        System.out.printf("총 접속 횟수: %d회\n", logs.size());
        System.out.printf("고유 방문자 수: %d명 %s\n", unique.size(), unique);
        System.out.println();

        System.out.println("[접속 통계]");
        // 람다식 활용 (아주 훌륭합니다!)
        map.forEach((id, count) -> System.out.printf("%s: %d회\n", id, count));
        System.out.println();

        System.out.printf("👑 최다 접속자: %s (%d회)\n", maxId, max);
    }
}
