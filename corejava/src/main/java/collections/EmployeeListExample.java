package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

class Employee {
	int empid;
	String name;
	String dept;

	public Employee() {

	}

	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	// @Override
	// public String toString() {
	// return empid+" "+name+" "+dept;
	// }

}

public class EmployeeListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> ar = new LinkedList<>();
		ar.add(new Employee(10001, "praveen", "finance"));
		ar.add(new Employee(10002, "kumar", "quality"));
		ar.add(new Employee(10003, "sunil", "sales"));
		System.out.println(ar);
		Iterator itr = ar.iterator();

		while (itr.hasNext()) {

			Employee e = (Employee) itr.next();
			System.out.println(e.getEmpid() + " " + e.getName() + " " + e.getDept());
		}

		Predicate<Employee> p = emp -> emp.getEmpid() >= 10002;
		ar.removeIf(p);
		Iterator itr1 = ar.iterator();

		while (itr1.hasNext()) {

			Employee e = (Employee) itr1.next();
			System.out.println(e.getEmpid() + " " + e.getName() + " " + e.getDept());
		}

	}

}
