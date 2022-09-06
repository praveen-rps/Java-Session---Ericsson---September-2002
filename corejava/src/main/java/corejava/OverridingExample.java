package corejava;

class A{
	int x;
	int y;
	A(){
		x=10;
		y=20;
	}
	public void display() {
		System.out.println("Inside the base class");
		System.out.println("x = "+x+" y = "+y);
	}
}

class B extends A {
	int x;
	int y;
	B(){
		x=30;
		y=40;
	}
	
	@Override
	public void display() {
		System.out.println("Inside the derived class");
		System.out.println("x = "+super.x+" y = "+y);
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.display();

	}

}
