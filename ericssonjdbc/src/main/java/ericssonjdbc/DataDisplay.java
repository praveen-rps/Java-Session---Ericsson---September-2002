package ericssonjdbc;

import java.sql.*;

public class DataDisplay {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// 1. loading the driver class

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
		String sql = "select * from notes";
		ResultSet rs = st.executeQuery(sql);

		// process the result

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}

		// 6. close the connections

		rs.close();
		st.close();
		con.close();

	}

}
