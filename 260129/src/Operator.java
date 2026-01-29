import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Operator {
	PLUS{BigDecimal calculate(BigDecimal a, BigDecimal b){return a.add(b);}}, 
	MINUS{BigDecimal calculate(BigDecimal a, BigDecimal b){return a.subtract(b);}}, 
	MULTIPLY{BigDecimal calculate(BigDecimal a, BigDecimal b){return a.multiply(b);}}, 
	DIVIDE{BigDecimal calculate(BigDecimal a, BigDecimal b) throws ArithmeticException{
		if(b.compareTo(BigDecimal.ZERO)==0) throw new ArithmeticException("0으로는 나눌 수 없습니다");
		else return a.divide(b, 10, RoundingMode.HALF_UP);}};
	abstract BigDecimal calculate(BigDecimal a, BigDecimal b);
}
