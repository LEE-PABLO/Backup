
public class Account {
	int balance;
	Account(int balance){this.balance=balance;}
 void withdraw(int amount) throws InsufficientBalanceException {
	 if (amount>balance) throw new InsufficientBalanceException("오류 발생: 잔액이 부족합니다");
	 else {balance-=amount;System.out.println(balance);}}
}
