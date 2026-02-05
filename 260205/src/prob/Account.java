package prob;

public class Account {
	private int balance = 1000; 

    public int getBalance() {
        return balance;
    }

    
    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            balance -= money;
            System.out.println("출금 성공! 잔액: " + balance);
        } else {
            System.out.println("잔액 부족!!! (거부)");
        }
    }
}
