package math;

import java.math.*;

public class Bigdecimal {
	public static void main(String[] args) {
		BigDecimal price=new BigDecimal("19.99");
		BigDecimal quantity=new BigDecimal("3");
		BigDecimal taxrate=new BigDecimal("0.08");
		BigDecimal subtotal=price.multiply(quantity);
		BigDecimal tax=subtotal.multiply(taxrate);
		BigDecimal total=subtotal.add(tax);
		
	}
}
