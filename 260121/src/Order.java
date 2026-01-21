
public class Order {
	private Long id;
    private String category; // "ELECTRONICS", "CLOTHING", "FOOD" ...
    private double price;
    private String status;   // "COMPLETED", "CANCELED", "REFUNDED"
 // 생성자, Getter 등은 있다고 가정
    public Order(Long id, String category, double price, String status) {
        this.id = id; this.category = category; this.price = price; this.status = status;
    }
    // Getter: getCategory(), getPrice(), getStatus()
    public String getCategory() {return this.category;}
    public double getPrice() {return this.price;}
    public String getStatus() {return this.status;}
}
