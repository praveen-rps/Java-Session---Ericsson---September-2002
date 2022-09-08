package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> c1 = (s1,s2)-> s1.getHtno()-s2.getHtno();
		Comparator<Student> c2 = (s1,s2)-> s1.getName().compareTo(s2.getName());
		Comparator<Student> c3 = (s1,s2)->-s1.getBranch().compareTo(s2.getBranch());
		
		ArrayList<String> ar = new ArrayList<>();
		ArrayList<Student> ar1 = new ArrayList<>();
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("Nepal");
		ar.add("America");
		ar.add("Canada");
		System.out.println("Elements without order");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println("Elements after sorting..");
		System.out.println(ar);
		
		ar1.add(new Student(9001,"praveen","cse"));
		ar1.add(new Student(9005,"sunil","eee"));
		ar1.add(new Student(9003,"krishna","ece"));
		ar1.add(new Student(9006,"kamal","biotech"));
		Collections.sort(ar1,c1);
		System.out.println("Elements sorted on htno");
		System.out.println(ar1);
		
		Collections.sort(ar1,c2);
		System.out.println("Elements sorted on name");
		System.out.println(ar1);
		
		Collections.sort(ar1,c3);
		System.out.println("Elements sorted on branch");
		System.out.println(ar1);
	

	}

}
