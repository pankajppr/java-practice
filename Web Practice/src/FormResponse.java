import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FormResponse
 */
@WebServlet("/FormResponse")
public class FormResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	java.sql.Connection con = null;
	ResultSet  rs = null;
	java.sql.Statement st = null;
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","pankaj","cricket");
			st = con.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		PrintWriter pw = response.getWriter();	
		pw.println("Your Name is: "+name+"\nAge is:"+age);
		
		try {
			rs = st.executeQuery("Select * from student;");
			while(rs.next()){
				 pw.println("Your ID is: "+rs.getInt(1)+" and Name is:"+rs.getString(2)+"\n");
				}
			
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
	}

}
