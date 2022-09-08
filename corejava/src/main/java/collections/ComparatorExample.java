package collections;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
	int htno;
	String name;
	String branch;
	public Student() {
		
	}
	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}

	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return htno+ " "+name+" "+branch;
	}
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

class DeptComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -o1.getBranch().compareTo(o2.getBranch());
	}

}

class HtnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -(o1.getHtno()-o2.getHtno());
	}

}




public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> c1 = (s1,s2)-> s1.getHtno()-s2.getHtno();
		Comparator<Student> c2 = (s1,s2)-> s1.getName().compareTo(s2.getName());
		Comparator<Student> c3 = (s1,s2)->s1.getBranch().compareTo(s2.getBranch());
		
		TreeSet<Student> ts = new TreeSet(c2);
		System.out.println("Sorted based on name");
		ts.add(new Student(9001,"praveen","cse"));
		ts.add(new Student(9005,"sunil","eee"));
		ts.add(new Student(9003,"krishna","ece"));
		ts.add(new Student(9006,"kamal","biotech"));
		System.out.println(ts);
		
		
		TreeSet<Student> ts1 = new TreeSet(c3);
		System.out.println("Sorted based on branch");
		ts1.add(new Student(9001,"praveen","cse"));
		ts1.add(new Student(9005,"sunil","eee"));
		ts1.add(new Student(9003,"krishna","ece"));
		ts1.add(new Student(9006,"kamal","biotech"));
		System.out.println(ts1);
		

		TreeSet<Student> ts2 = new TreeSet(c1);
		System.out.println("Sorted based on htno");
		ts2.add(new Student(9001,"praveen","cse"));
		ts2.add(new Student(9005,"sunil","eee"));
		ts2.add(new Student(9003,"krishna","ece"));
		ts2.add(new Student(9006,"kamal","biotech"));
		System.out.println(ts2);


	}

}
