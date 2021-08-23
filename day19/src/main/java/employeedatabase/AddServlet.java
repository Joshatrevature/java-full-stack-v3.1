package employeedatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;



@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
			try {
				Connection con = DataConnection.initializeDatabase();
				
				PreparedStatement st = con
						.prepareStatement("insert into employee values(?, ?, ?, ?)");
				
				st.setString(1, request.getParameter("name"));
				
				st.setString(2, request.getParameter("email"));
				
				st.setString(3, request.getParameter("gender"));
				
				st.setString(4, request.getParameter("country"));
				
				st.executeUpdate();
				
				st.close();
				con.close();
				
				PrintWriter out = response.getWriter();
				out.println("<html><body><b>Successfully Inserted"
	                    + "</b></body></html>");
			}
			catch (Exception e ) {
				e.printStackTrace();
			}
		}
}