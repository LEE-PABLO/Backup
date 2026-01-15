import thread.ByInterface;
import thread.MyThread;
import thread.SecondThread;

public class Tester {

	public static void main(String[] args) {
		Thread t=new Thread(new ByInterface());
		MyThread mt=new MyThread();
		SecondThread nd=new SecondThread();
		mt.start();
		nd.start();
		t.start();
		System.out.println(nd);
		System.out.println(mt);
		System.out.println(t);
	}
}
