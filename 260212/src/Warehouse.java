import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	Map<String, Integer> stock;
	public Warehouse() {stock=new HashMap<>(); stock.put("노트북", 5);}
	public void decreaseStock(String item, int count) throws IllegalArgumentException,SoldOutException{
		if(!stock.containsKey(item)) throw new IllegalArgumentException("없는 상품");
		if(count>stock.get(item)) throw new SoldOutException(item);
		stock.replace(item, stock.get(item), stock.get(item)-count);
	}
}
