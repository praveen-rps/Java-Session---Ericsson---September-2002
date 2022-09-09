package ericssonjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedReadExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. establish a connection
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String uid = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, uid, pwd);

		// 3. create a statement object
		
		String sql = "delete from ericsson where empid =?";
		PreparedStatement pst = con.prepareStatement(sql);
		// Fetech the values for record 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid...");
		int empid = sc.nextInt();
		
		pst.setInt(1, empid);
		
		int k = pst.executeUpdate();
		

		// process the result
		if(k>0)
			System.out.println("record deleted......");
		else
			System.out.println("record not found...");
		
		// 6. close the connections
		pst.close();
		con.close();


	}

}
