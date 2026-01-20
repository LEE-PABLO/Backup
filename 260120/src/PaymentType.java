import System.out.InvalidPaymentAmountException;

public enum PaymentType {
	// enum의 각 상수의 내부에 직접 각 결제 방식의 메소드 호출
	CREDIT_CARD{
		public void pay (long amount) throws InvalidPaymentAmountException{
		if(amount<0) throw new InvalidPaymentAmountException();
		new CreditCardPayment().pay(amount);}},
	KAKAO_PAY{
		public void pay (long amount) throws InvalidPaymentAmountException{
		if(amount<0) throw new InvalidPaymentAmountException();
		new KakaoPayment().pay(amount);}};
	
	public void pay (long amount) throws InvalidPaymentAmountException{
		if(amount<0) throw new InvalidPaymentAmountException();}
}
