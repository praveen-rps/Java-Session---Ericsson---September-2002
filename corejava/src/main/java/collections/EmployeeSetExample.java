package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EmployeeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs = new HashSet<>();
		LinkedHashSet<Employee> lhs = new LinkedHashSet<>();
		TreeSet<Employee> ts = new TreeSet<>();
		
		ts.add(new Employee(10001, "praveen", "finance"));
		ts.add(new Employee(10002, "kumar", "quality"));
		ts.add(new Employee(10003, "sunil", "sales"));
		System.out.println(ts);
		
		
		
		

	}

}
