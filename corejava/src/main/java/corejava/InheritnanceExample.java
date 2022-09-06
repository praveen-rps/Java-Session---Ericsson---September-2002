package corejava;
class Box2D extends Object{
	int length;
	int breadth;
	Box2D(int length, int breadth){
		System.out.println("Base class constructor is called..");
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea() {
		System.out.println("The area is : "+(length*breadth));
	}
}

class Box3D extends Box2D{
	int height;
	Box3D(int height){
		super(3,4);
		System.out.println("Derived class constructor is called..");
		this.height=height;
	}
	
	
	public void calVolume() {
		System.out.println("The volume is : "+length*breadth*height);
	}
}

public class InheritnanceExample extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box2D b1 = new Box2D(10,20);
		//b1.calArea();
		
		Box3D b1 = new Box3D(4);
		b1.calArea();
		b1.calVolume();

	}

}
