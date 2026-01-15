package thread;

public class SecondThread extends Thread{
	public void run() {
		long s = System.nanoTime();
		for (int i=0;i<1000000000;i++) {}
		long e = System.nanoTime();
		long d=(e-s)/1_000_000;
		System.out.println("실행시간:"+d+"ms");
		//try {Thread.sleep(2);} 
		//catch (InterruptedException e) {e.printStackTrace();}
		//System.out.println(this+"="+i);}}
	}
}