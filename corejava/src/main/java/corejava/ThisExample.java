package corejava;
class Test1{
	Test1(){
		//this(10);
		System.out.println("Inside the default constructor");
		display();
	}
	
	Test1(int a){
		this();
		System.out.println("Inside the parametized constructor.");
	}
	public void display() {
		//this();
		System.out.println("Insid the display method...");
	}
	{
		System.out.println("inside the non static block");
	}
	static{
		System.out.println("inside the static block");
	}
}
public interface ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test1 t1 = new Test1();
		//t1.display();
		
		//Test1 t2 = new Test1(10);
		System.out.println(10);
		System.out.println(10.23f);
		System.out.println("India");
		System.out.println(true);
		System.out.println('c');
		System.out.println("Hello"+" Hai");
		System.out.println(10+20);
		System.out.println(10.23+43.23);
		

	}

}
