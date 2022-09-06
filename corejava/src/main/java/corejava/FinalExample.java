package corejava;

 class Base{
	 int x=10;
	Base(){
		System.out.println(++x);
	}
	final public void display() {
		System.out.println("Inside the display of base class");
	}
}

class Derived extends Base{
	int y;
	Derived(){
		System.out.println(y++);
	}
	
	//@Override
	public void display1() {
		System.out.println("Inside the display of derived class");
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base b = new Base();
		Derived b =new Derived();
		b.display();
		

	}

}
