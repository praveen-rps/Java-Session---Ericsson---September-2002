package lambdas;

import java.util.function.*;
class PredicateTest{
	public static void m1(Predicate<Integer> p, int []x) {
		for(int n:x) {
			if(p.test(n))
				System.out.println(n);
		}
	}
	
	public static void m2(Function<Integer,Integer> p, int []x) {
		for(int n:x) 
		System.out.println(p.apply(n));
	
	}
}

public class PredicateFunctionTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = n->n%5==0;
		Predicate<Integer> p2 = n->n>20;
		
		Function<Integer,Integer> f1 = n->n*n;
		int a[]= {10,4,28,30,35,29};
	
		PredicateTest.m1(p1.or(p2), a);
		PredicateTest.m2(f1, a);
	}

}
