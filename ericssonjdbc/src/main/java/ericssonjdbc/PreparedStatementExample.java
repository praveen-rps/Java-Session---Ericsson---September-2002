package ericssonjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. establish a connection
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String uid = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, uid, pwd);

		// 3. create a statement object
		
		String sql = "insert into ericsson values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		// Fetech the values for record 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid...");
		int empid = sc.nextInt();
		//sc.next();
		System.out.println("Enter name...");
		String name = sc.next();
		
		System.out.println("Enter dept...");
		String dept = sc.next();
		
		pst.setInt(1, empid);
		pst.setString(2, name);
		pst.setString(3, dept);
		
		pst.executeUpdate();
		
		
		// process the result
		System.out.println("record inserted...");
		
		// 6. close the connections
		pst.close();
		con.close();


	}
}
