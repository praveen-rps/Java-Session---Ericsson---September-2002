package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Runnable r1 = ()->System.out.println("One");
		Runnable r2 = ()->System.out.println("two");
		
		Callable<String> c1 =()->new String("Hello");
		
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(r1);
		es.execute(r2);
		Future f = es.submit(c1);
		System.out.println(f.get());
		es.shutdown();

	}
}
