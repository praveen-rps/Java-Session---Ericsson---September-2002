package lambdas;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

class User{
	String username;
	String password;
	public User() {
		
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class LoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<User> c = usr->{
			if(usr.getUsername().equals("admin") && usr.getPassword().equals("admin"))
				System.out.println("Valid User");
			else
				System.out.println("Invalid User");
		};
		
		
		Predicate<User> p1 = user->user.getUsername().equals("admin") &&
				user.getPassword().equals("admin");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username ");
		String uname = sc.nextLine();
		
		System.out.println("Enter password ");
		String passwd = sc.nextLine();
		
		
		User user1 = new User(uname,passwd);
		
		c.accept(user1);
		
		/*
		if(p1.test(user1))
			System.out.println("User is valid user");
		else
			System.out.println("Invalid user...pra");
			
	*/

	}

}
