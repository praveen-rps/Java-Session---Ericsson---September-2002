package lambdas;

import java.util.function.Predicate;
class Employee{
	String name;
	int salary;
	public Employee() {
		
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n>10;
		Predicate<String> p3 = str->str.length()>10;
			
		Employee emp1 = new Employee("praveen",20000);
		Employee emp2 = new Employee("kumar",12000);
		
		Predicate<Employee> p4 = emp-> emp.salary>15000;
		Predicate<Employee> p5 = emp-> emp.name.charAt(0)=='k';
		
		System.out.println(p1.test(4));
		System.out.println(p1.test(7));
		System.out.println(p2.test(71));
		System.out.println(p3.test("india is my country"));
		
		System.out.println(p4.test(emp1));
		System.out.println(p4.test(emp2));
		
		System.out.println(p1.and(p2).test(6));
		System.out.println(p1.or(p2).test(7));
		
		System.out.println(p4.or(p5).test(emp2));


	}

}
