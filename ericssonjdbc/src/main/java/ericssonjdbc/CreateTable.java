package ericssonjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		String sql = "create table ericsson(empid int, name varchar(20), dept varchar(20))";
		st.execute(sql);
		
		// process the result
		System.out.println("Table Created...");
		
		// 6. close the connections
		st.close();
		con.close();

	}

}
