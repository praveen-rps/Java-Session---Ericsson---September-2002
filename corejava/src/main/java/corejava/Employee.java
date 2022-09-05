package corejava;

public class Employee {
	
	private int empid;
    private String name;
	private String department;
	static String org;
	
	public  void readEmployeeDetailsAndDisplaySalaries() {
		
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showEmployeeDetails() {
		int count;
		System.out.println(name+" "+department+" "+empid+" "+org);
		
	}
	
	@Override
	public String toString() {
		return empid+" "+name+" "+department+" "+org;
	}
	
	
	{
		System.out.println("Inside the non static block");
	}
	
	static{
		System.out.println("Inside the static block");
	}
	
	public static void test()
	{
		System.out.println("Inside the test method..."+org);
		
	}
	

}
