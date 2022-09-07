package threads;

class MyThread extends Thread{
	public void run() {
		System.out.println("Child thread started....");
		for(int i=1;i<=100;i++) {
			try {
				sleep(200);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		System.out.println(this.getState());
		System.out.println("Child thread stopped....");
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread started...");
		MyThread t = new MyThread();
		t.start();
		for(int i=101;i<=200;i++) {
			//Thread.sleep(2000);
			System.out.println(i);
		}
		System.out.println("Main thread stopped....");

	}

}
