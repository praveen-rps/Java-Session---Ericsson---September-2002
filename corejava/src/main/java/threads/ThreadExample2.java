package threads;

class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the runnable run method...");
		Thread.getAllStackTraces();
		
	}
	
	
}
public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MyRunnableThread myt = new MyRunnableThread();
	MyThread m1 = new MyThread();
	//Runnable r = ()->System.out.println("Inside the child thread..");
	Runnable r = m1::run;
	Thread t = new Thread(r);
	t.start();	
	System.out.println("Id :"+t.getId());
	System.out.println("name:"+t.getName());
	System.out.println("priority :" +t.getPriority());
	System.out.println("state:"+t.getState());
	System.out.println("Thread group:"+t.getThreadGroup());
	System.out.println("is thread alive:"+t.isAlive());
	System.out.println("is thread deamon:"+t.isDaemon());
	System.out.println("is thread interrupted:"+t.isInterrupted());

	}

}
