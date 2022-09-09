package postjdbcservice.service;

import java.sql.SQLException;
import java.util.List;

import postjdbcservice.model.Posts;

public interface IPostService {
	public List<Posts> getAllPosts()throws ClassNotFoundException, SQLException;
	public String insertPosts(Posts post)throws ClassNotFoundException, SQLException;
	public String deletePost(int pid) throws ClassNotFoundException, SQLException;
}
