package lambdas;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateNFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> b1 = (a,b)->a<b;
		System.out.println(b1.test(2, 20));
		
		
		BiFunction<Integer,Integer,Integer> f1 = (a,b)-> a*b;
		System.out.println("The product is :"+f1.apply(4, 20));

	}
}
