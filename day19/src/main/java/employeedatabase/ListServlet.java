package employeedatabase;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.sql.*;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
		{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		try
		{
			Connection con = DataConnection.initializeDatabase();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee");
			out.println("<table border = 1 width=50% height=50%>");
			out.println("<tr><th>Name</th><th>Email</th><th>Gender</th><th>Country</th>,</tr>");
			
			while (rs.next())
			{
				String name = rs.getString("name");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				String country = rs.getString("country");
				out.println("<tr><td>" + name + "</td><td>" + email + "</td><td>" + gender + "</td><td>" + country + "</tr>");
			}
			out.println("</table>");  
            out.println("</html></body>");  
            con.close(); 
		}
		catch (Exception e) 
		{
			out.println("error");
		}
		}
}
