package postjdbcservice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import postjdbcservice.model.Posts;

public class PostDaoImpl implements IPostDao{

	public List<Posts> getAllPosts() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Posts> data = new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";// rps@12345

		Connection con = DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement();

		String sql = "select * from posts";

		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			Posts post = new Posts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)); 
			data.add(post);
		}	

		rs.close();
		st.close();
		con.close();
		return data;
	}

	@Override
	public String insertPosts(Posts post) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Posts> data = new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";// rps@12345

		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "insert into posts values (?,?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, post.getPid());
		pst.setString(2, post.getAuthor());
		pst.setString(3, post.getTitle());
		pst.setString(4, post.getDescription());
		pst.executeUpdate();

		pst.close();
		con.close();
		return "Record Inserted";
	}

	@Override
	public String deletePost(int pid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
