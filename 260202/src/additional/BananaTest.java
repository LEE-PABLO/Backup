package additional;

import java.util.HashMap;
import java.util.Map;

public class BananaTest {
	public static void main(String[] args) {
        String text = "banana";
        Map<Character, Integer> map = new HashMap<>();

        // 문자열을 문자 배열로 바꿔서 반복 (향상된 for문)
        for (char c : text.toCharArray()) {
            // 미션: 여기에 딱 한 줄만 써서 개수를 세보세요!
            // 힌트: map.put(키, map.getOrDefault(키, 0) + 1);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map); // {b=1, a=3, n=2} 출력됨
    }
}
