import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesService {
	// [미션 1] 카테고리별 총 매출액 계산 (아까 배운 내용 복습!)
    public Map<String, Double> calculateRevenue(List<Order> orders) {
    	return orders.stream()
    			.filter(o -> "COMPLETED".equals(o.getStatus()))  // 1. 필터링
    		    .collect(Collectors.groupingBy(                  // 2. 수집 시작
    		            Order::getCategory,                          // 3. 그룹핑 기준 (Key가 됨)
    		            Collectors.summingDouble(Order::getPrice)));
    		// 1. 상태가 "COMPLETED" 인 것만 필터링 (filter)
            // TODO: .filter(...)
    		// 2. 카테고리 기준으로 묶고, 가격을 더함 (collect)
            // TODO: .collect(...) 
    }

    // [미션 2] 매출이 가장 높은 카테고리 이름 찾기 (새로운 도전!)
    public String findTopCategory(List<Order> orders) {
        // 1단계: 위에서 만든 메서드를 재사용해서 이미 계산된 Map을 가져옵니다. (효율성)
        Map<String, Double> revenueMap = calculateRevenue(orders);

        // 2단계: Map의 Entry(키-값 쌍)를 스트림으로 만들어서 최댓값을 찾습니다.
        return revenueMap.entrySet().stream()
            // TODO: max()를 사용하여 '값(Value)'이 가장 큰 Entry를 찾으세요.
            // 힌트: Map.Entry.comparingByValue() 를 사용하면 편합니다.
            .max(Map.Entry.comparingByValue())
            
            // TODO: map()을 사용하여 찾은 Entry에서 '키(Key)'만인 카테고리 이름만 꺼내세요.
            .map(Map.Entry::getKey)
            
            // TODO: orElse()를 사용하여 만약 결과가 없다면 "데이터 없음"을 반환하세요.
            .orElse("데이터 없음");
    }
}
