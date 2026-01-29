import java.math.BigDecimal;

public class EnumTest {

	public static void main(String[] args) {
		BigDecimal x = BigDecimal.valueOf(Math.random()*100);
		BigDecimal y = BigDecimal.valueOf(Math.random()*100);
		// "Enum아, 너가 직접 계산해!"
        for (Operator op : Operator.values()) {
        	BigDecimal result = op.calculate(x, y);
            System.out.println(x + " " + op + " " + y + " = " + result);
        }// TODO Auto-generated method stub
	}	
}
