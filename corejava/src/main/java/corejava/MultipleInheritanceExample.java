package corejava;

interface Interf1{
	void f1();
	void f2();
}

interface Interf2{
	void f3();
	void f4();
}

interface Interf3 extends Interf1, Interf2{
	void f6();
}

class Class4{
	public void f5() {
		System.out.println("Inside f5 of class");
	}
}
class MultipleEx extends Class4 implements Interf1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("inside f1 of multipleex");
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("inside f2 of multipleex");
		
	}
	
}
class MultipleInherit implements Interf1,Interf2{

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("Inside f3");
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		System.out.println("Inside f4");
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Inside f1");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Inside f2");
	}
	
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInherit m = new MultipleInherit();
		m.f1();
		m.f2();
		m.f3();
		m.f4();
		
		MultipleEx m1 = new MultipleEx();
		m1.f1();
		m1.f2();
		m1.f5();
		

	}

}
