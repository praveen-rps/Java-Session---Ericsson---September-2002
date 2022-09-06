package lambdas;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("praveen",20000);
		Employee emp2 = new Employee("kumar",12000);
		
		Consumer<Employee> c1 = emp->{
			System.out.println("The Name of Employee: "+emp.name);
			System.out.println("The Salary of Employee: "+emp.salary);
			
		};
		
		Consumer<Integer> c2 = n->{
			if(n>10)
				System.out.println(n +" is greater than 10");
			else
				System.out.println(n +" is not greater than 10 ");
		};
		
		c1.accept(emp1);
		c1.accept(emp2);
		
		c2.accept(7);

	}

}
