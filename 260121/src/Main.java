import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		SalesService service=new SalesService();
		List<Order> orders = Arrays.asList(
			    new Order(1L, "ELECTRONICS", 1000.0, "COMPLETED"),
			    new Order(2L, "CLOTHING", 500.0, "CANCELED"), // 제외됨
			    new Order(3L, "ELECTRONICS", 2000.0, "COMPLETED"),
			    new Order(4L, "FOOD", 300.0, "COMPLETED")
			);

			// 당신이 만든 메서드 호출
			Map<String, Double> result = service.calculateRevenue(orders);
			System.out.println(result);
			String result2=service.findTopCategory(orders);
			System.out.println(result2);
			// 출력 결과
			// { "ELECTRONICS": 3000.0, "FOOD": 300.0 }
	}

}
