package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginExample
 */
@WebServlet("/LoginExample")
public class LoginExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: my sample page ").append(request.getContextPath());
		
		RequestDispatcher rd=request.getRequestDispatcher("DisplayServlet");  
		Connection con = null;
		Statement st=null;
		ResultSet rs = null;
		boolean isFound = false;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String uid = "root";
		String pwd = "root";
		try {
			con = DriverManager.getConnection(url, uid, pwd);
		
			st = con.createStatement();
			String sql = "select * from user";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String tuname = rs.getString(1);
				String tpasswd = rs.getString(2);
				if(uname.equals(tuname) && passwd.equals(tpasswd))	{
						isFound=true;
						break;
					}
			}
			if(isFound)
					//out.println("<h2 style='color:green'>Authorized user </h2>");
					rd.forward(request,response);
				else
					out.println("<h2 style='color:red'>Not registered user </h2>");
				out.println("</body></html>");
				out.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
