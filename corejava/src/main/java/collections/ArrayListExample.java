package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<String> p = str->str.charAt(0)=='J';
		
		ArrayList<String> ar = new ArrayList();
		ar.add("America");
		ar.add("Canada");
		ar.add("Australia");
				
		List ar1= new LinkedList<String>();  // Covariant Referencing
		
		ar1.add("India");
		ar1.add("China");
		ar1.add("Japan");
		ar1.add("Nepal");
		ar1.add("India");
		//ar1.add(null);
		System.out.println(ar1);
		
		ar1.addAll(ar);  // ar1 = ar1 + ar;
		System.out.println(ar1);
		System.out.println(ar1.removeIf(p));
		System.out.println(ar1);
		System.out.println("size of list: "+ar1.size());
		//ar1.clear();
		//System.out.println("size of list: "+ar1.size());
		
		if (ar1.contains("Newzealand"))
			System.out.println("found..");
		else
			System.out.println("not found...");

	}

}
