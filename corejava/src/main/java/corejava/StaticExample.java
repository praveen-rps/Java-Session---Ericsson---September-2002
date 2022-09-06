package corejava;

class Box{
	int count;
	public void countBoxes() {
		count++;
		System.out.println("Box Number -->"+count);
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		
		Box b1 = new Box();
		b1.countBoxes();
		
		Box b2 = new Box();
		b1.countBoxes();

		Box b3 = new Box();
		b1.countBoxes();
		

	}

}
