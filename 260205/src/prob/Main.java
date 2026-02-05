package prob;

public class Main {
	public static void main(String[] args) {
        Account sharedAccount = new Account(); // 통장은 하나!
        Runnable task = new WithdrawTask(sharedAccount);
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
