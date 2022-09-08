package collections;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1 = new ArrayList<String>(); // Covariant Referencing
		//->
		ar1.add("India");
		ar1.add("China");
		ar1.add("Japan");
		ar1.add("Nepal");
		ar1.add("India");

		// By using Iterator interface
		System.out.println("Travesrig using iterator method");
		Iterator itr = ar1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		
		// by using simple for loop
		System.out.println("Travesrig using for loop");
		for(String country: ar1) 
				System.out.println(country);
		
		// by using for Each
		System.out.println("Travesrig using for forEach");
		ar1.forEach(System.out::println);
		
		ListIterator ltr = ar1.listIterator();
		
		System.out.println("Elements in forward directon");
		
		while(ltr.hasNext())
			System.out.println(ltr.next());
		
		System.out.println("Elements in reverse directon");
		while(ltr.hasPrevious())
			System.out.println(ltr.previous());
	}

}
