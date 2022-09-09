package postjdbcservice.service;

import java.sql.SQLException;
import java.util.List;

import postjdbcservice.dao.IPostDao;
import postjdbcservice.dao.PostDaoImpl;
import postjdbcservice.model.Posts;

public class PostServiceImpl implements IPostService {

	IPostDao dao;
	
	public PostServiceImpl() {
		dao = new PostDaoImpl();
	}
	
	public List<Posts> getAllPosts() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.getAllPosts();
	}

	@Override
	public String insertPosts(Posts post) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.insertPosts(post);
	}

	@Override
	public String deletePost(int pid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
