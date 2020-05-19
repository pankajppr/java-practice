
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LcTest")
public class LcTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LcTest() {
    }

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    	
    	PrintWriter pw = res.getWriter();
    	HttpSession ses =  req.getSession();
    	//res.setHeader("refresh", "1");
    	res.setContentType("text/html");
    	pw.print("<html><head><title>Servlet Test</title></head><body>");
    	pw.println("Date and Time is : "+ new java.util.Date().toString());
    	pw.print("<h3>Servlet, Request - Response object information </h3>");
    	pw.println("<br />Tomcat implemented class for request object: "+ req.getClass());
    	pw.println("<br />Tomcat implemented class for response object: "+ res.getClass());
    	pw.println("<br />Tomcat implemented request object hash Code: "+ req.hashCode());
    	pw.println("<br />Tomcat implemented response object hash Code: "+ res.hashCode());
    	pw.println("<br />Current Request Thread name is: "+ Thread.currentThread().getName());
    	pw.println("<br />Hash code of our servlet class: "+ this.hashCode());
    	pw.print("<hr><h3>Header Information</h3>");
    	
    	pw.print("User-Agent:"+req.getHeader("user-agent"));
    	Enumeration<String> headernames = req.getHeaderNames();
    	while(headernames.hasMoreElements()){
    		String header = headernames.nextElement();
    		pw.print("<br>"+header+" : "+req.getHeader(header));
    	}
    	pw.print("<br>Remote Machine: "+req.getServerName());
    	pw.print("<hr><h3>Session Information</h3>");
    	pw.print("Session Id: "+res.encodeURL("LCTest"));
    	//pw.close();
    	pw.print("</body></html>");
    }
	

}
