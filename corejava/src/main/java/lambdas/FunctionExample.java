package lambdas;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<Double,Double> f8 = n->n*n;
		Function<Double,Double> f9= n->n/2;

		Function<Integer,Integer> f1 = n->n*n;
		Function<Integer,Double> f2 = r-> 3.141*r*r;
		Function<String,String> f3 = str->str.toUpperCase();
		Function<Employee,String> f4 = emp-> {
				if(emp.salary>15000)
					return "High Salary";
				else
					return "Low Salary";
		};
		Employee emp1 = new Employee("praveen",20000);
		Employee emp2 = new Employee("kumar",12000);
		
		System.out.println("the square of 5 is :"+f1.apply(5));
		System.out.println("circle area with 4 radius is : "+f2.apply(4));
		System.out.println("upper case of program is "+f3.apply("program"));
		
		System.out.println("The salary of praveen is :"+f4.apply(emp1));
		System.out.println("The salary kumar is :"+f4.apply(emp2));
		
		System.out.println("f1 andThen f2-->"+f8.andThen(f9).apply(4.0));
		System.out.println("f1 compose f2-->"+f8.compose(f9).apply(4.0));

	}

}
