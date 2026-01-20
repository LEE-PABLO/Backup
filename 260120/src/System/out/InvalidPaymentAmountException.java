package System.out;

@SuppressWarnings("serial")
public class InvalidPaymentAmountException extends RuntimeException{
	//RuntimeException override
	public void RuntimeException() {System.out.println("결제 금액이 0원 이하입니다!");}
}
