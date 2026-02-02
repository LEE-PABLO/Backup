import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
        // 테스트용 로그 데이터
        List<String> logs = new ArrayList<>();
        // 편의상 addAll 사용
        java.util.Collections.addAll(logs, 
            "id_a", "id_b", "id_a", "id_c", "id_a", "id_b");

        LogAnalyzer.analyze(logs);
    }
}
