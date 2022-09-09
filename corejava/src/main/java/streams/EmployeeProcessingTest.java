package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String name;
	String desg;
	int sal;
	public Employee() {
		
	}
	public Employee(int empid, String name, String desg, int sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	
	
}
public class EmployeeProcessingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1001,"praveen","manager",5000);
		Employee emp2 = new Employee(1002,"sunil","lead",4000);
		Employee emp3 = new Employee(1003,"kishore","developer",3000);
		
		Function<Employee,Employee> f = e->{
			switch(e.getDesg()) {
			case "manager": e.setSal(e.getSal()+1000);break;
			case "lead": e.setSal(e.getSal()+800);break;
			case "developer": e.setSal(e.getSal()+500);break;
			}
			return e;
		};
		
		ArrayList<Employee> data = new ArrayList<>();
		List<Employee> result = new ArrayList<>();
		data.add(emp1);
		data.add(emp2);
		data.add(emp3);
		System.out.println(data);
		/*for(Employee e:data) {
			switch(e.getDesg()) {
			case "manager": e.setSal(e.getSal()+1000);break;
			case "lead": e.setSal(e.getSal()+800);break;
			case "developer": e.setSal(e.getSal()+500);break;
			}
			result.add(e);
		}
		*/
		Comparator<Employee> c= (c1,c2)-> c1.getName().compareTo(c2.getName());
		result =  data.stream().map(f).sorted(c).collect(Collectors.toList());
		
		System.out.println("After processing:");
		System.out.println(result);
		

	}

}
