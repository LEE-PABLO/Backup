
public class Main {

	public static void main(String[] args) {
		PaymentService service = new PaymentService();

		service.process(PaymentType.CREDIT_CARD, 25000);

		service.process(PaymentType.KAKAO_PAY, 5000);

		service.process(PaymentType.CREDIT_CARD, -100);
	}
}
