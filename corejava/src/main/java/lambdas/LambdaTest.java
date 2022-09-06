package lambdas;

@FunctionalInterface
interface Maths{
	public int add(int a, int b);
	
}

interface Utils{
	public boolean checkEvenOrOdd(int n);
}


/*
 * public boolean checkEvenOrOdd(int n){
 *    if(n%2==0)
 *    	return true;
 *    else
 *      return false;
	}
 * 
 * (n)->n%2==0;
 *   n->n%2==0;
 */

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Maths m = (a,b)->a+b;
		
		Utils m1 = n->n%2==0;
		
		System.out.println(m.add(70,20));
		System.out.println(" is 4 even ->"+ m1.checkEvenOrOdd(4));
		System.out.println(" is 17 even ->"+ m1.checkEvenOrOdd(17));
	}
}
