package ericssonjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. establish a connection
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String uid = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, uid, pwd);

		// 3. create a statement object

		Statement st = con.createStatement();
		// 4. write the sql query and execute the query
		// 5. fecth the result
		String sql = "insert into ericsson values(9002,'kumar','quality')";
		st.executeUpdate(sql);
		
		// process the result
		System.out.println("record inserted...");
		
		// 6. close the connections
		st.close();
		con.close();


	}

}
