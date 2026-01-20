import System.out.InvalidPaymentAmountException;
public class PaymentService {
	//enum의 내부 메소드 구현을 통해 가장 간단한 메소드 작성 성공 
	public void process (PaymentType p, long amount) {
		try {p.pay(amount);}
		catch(InvalidPaymentAmountException e) {e.RuntimeException();}
	}
	
}
