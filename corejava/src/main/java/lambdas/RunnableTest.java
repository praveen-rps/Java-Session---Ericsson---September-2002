package lambdas;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<30;i++)
			System.out.println(i);
		
	}
	
}

/*
 * ()-> for(int i=0;i<30;i++) 
 *          System.out.println(i);
 * 
 */

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = ()-> {
							for(int i=10;i<=40;i++) 
								 System.out.println(i);
						   };
			          
		
		//MyThread m = new MyThread();
		Thread t = new Thread(r);
		t.start();
	}
}
