package corejava;

public class ConstrctorExample extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee.org="Ericsson";
		Employee emp1 = new Employee();
		System.out.println(emp1);
		
		Employee emp2 = new Employee("kumar","finance");
		System.out.println(emp2);

	}

}
