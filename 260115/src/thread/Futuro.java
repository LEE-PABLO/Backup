package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futuro {
	void f() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<Integer> future= executor.submit(()->{
			Thread.sleep(1000); 
			return 100+200;});
		System.out.println("계산중...");
		Integer result =future.get();
		System.out.println("결과:"+result);
		executor.shutdown();
	}
}
