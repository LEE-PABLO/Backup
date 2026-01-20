
public class KakaoPayment implements Payment{
	@Override
	public void pay(long amount) {System.out.println("카카오페이로 " + amount + "원 결제 성공");}
}
