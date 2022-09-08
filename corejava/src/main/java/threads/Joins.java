package threads;

class CustomThread extends Thread {
	CustomThread(String name) {
		super(name);
		start();
	}

	public void run() {
		try {
			for (int loop_index = 0; loop_index < 2; loop_index++) {
				System.out.println((Thread.currentThread()).getName() + " thread here..." + loop_index);
			}
		} catch (Exception e) {
		}
		System.out.println((Thread.currentThread()).getName() + " ending.");
	}
}

class Joins {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread());
		CustomThread thread1 = new CustomThread("first");
		CustomThread thread2 = new CustomThread("second");
		CustomThread thread3 = new CustomThread("third");
		CustomThread thread4 = new CustomThread("fourth");
		try {
			
			//thread1.join();
			//thread1.start();
			//thread2.start();
			//thread3.start();
			//thread4.start();
			thread2.yield();
			thread1.yield();
			
			System.out.println(thread2.getState());
			thread3.yield();
			System.out.println(thread3.getState());
			thread4.yield();
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getState());
	}
}