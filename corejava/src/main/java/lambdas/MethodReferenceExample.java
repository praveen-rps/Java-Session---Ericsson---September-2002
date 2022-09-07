package lambdas;

@FunctionalInterface
interface Maths5{
	public int add(int a, int b);
	
}

class Mathematics{
	public int addition(int x, int y) {
		// statements;
		System.out.println("Inside the addtion method...");
		return x + y;
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maths5 m5 = Mathematics::addition;
		// Above assingment should be called when the addition method 
		// is a static method.
		// If the method is non static, then first object is to be created
		// and then assign the reference as below:
		
		Mathematics m = new Mathematics();
		Maths5 m5 = m::addition;
		System.out.println(m5.add(20,30));

	}

}
