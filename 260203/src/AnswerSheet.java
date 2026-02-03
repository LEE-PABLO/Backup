import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnswerSheet {
	public static void main(String[] args) {
        // [테스트 준비] input.txt 파일이 없으면 섭섭하니까 자동으로 만들어줍니다.
        createDummyFile(); 

        // [본체] 작성하신 코드 (수정 완료)
        try (BufferedReader br = new BufferedReader(new FileReader("poem.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"))) {
            
            String line;
            Map<String, Integer> map = new HashMap<>();

            while ((line = br.readLine()) != null) {
                // ⚠️ 핵심 수정: split("") -> split(" ") (공백으로 자르기)
                // trim()을 추가하면 앞뒤 불필요한 공백도 제거해줘서 더 안전합니다.
                for (String word : line.trim().split(" ")) {
                    // 빈 문자열이 들어가는 걸 방지 (공백이 여러 개일 때 대비)
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // 결과 파일에 쓰기
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();

                bw.write(String.format("%s: %d", word, count));
                bw.newLine(); // 줄바꿈 필수!
            }
            
            System.out.println("✅ 분석 완료! result.txt 파일을 확인해보세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 테스트용 파일을 만들어주는 도우미 메소드
    static void createDummyFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("poem.txt"))) {
            bw.write("sky sea mountain");
            bw.newLine();
            bw.write("sky earth moon");
            bw.newLine();
            bw.write("sea sky star");
        } catch (IOException e) {
            // 파일 만들기 실패해도 일단 무시 (이미 있을 수도 있으니까)
        }
    }
}

