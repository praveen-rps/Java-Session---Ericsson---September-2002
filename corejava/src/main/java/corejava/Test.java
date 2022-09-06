package corejava;

import java.util.Scanner;

public interface Test {
	public static void main(String[] args) {
		
		Employee.org="Erricson";
		Employee.test();
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.setEmpid(1001);
		emp1.setDepartment("finance");
		emp1.setName("Kumar");
		emp1.test();
		
		
		emp1.showEmployeeDetails();
		emp1.org="Sony";
		
		emp2.setEmpid(1002);
		emp2.setDepartment("quality");
		emp2.setName("sunil");
		emp2.showEmployeeDetails();
		
		emp3.showEmployeeDetails();
		
		System.out.println("emp1==>"+emp1);
		System.out.println("emp2==>"+emp2);
		System.out.println("emp3==>"+emp3);
		


	}
}
