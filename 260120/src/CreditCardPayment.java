
public class CreditCardPayment implements Payment{
	@Override
	public void pay(long amount) {System.out.println("신용카드로 " + amount + "원 결제 성공");}
}
