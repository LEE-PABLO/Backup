package prob;

public class WithdrawTask implements Runnable{
	Account acc;
    WithdrawTask(Account acc) {
        this.acc = acc;
    }
    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            try { Thread.sleep((int)(Math.random() * 300)); } 
            catch(Exception e) {}
            acc.withdraw(200); 
        }
    }
}
