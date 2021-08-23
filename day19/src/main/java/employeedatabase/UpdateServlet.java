package employeedatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	String uemail = "";
	String uemail2 = "";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
		{
				try {
					Connection con = DataConnection.initializeDatabase();
					Statement statement = con.createStatement();
					uemail = request.getParameter("uemail");
					ResultSet resultSet = statement.executeQuery("select email from employee");
					
					while(resultSet.next()) {
						uemail2 = resultSet.getString("email");
						if(uemail == uemail2) {
						
						PreparedStatement st = con
								.prepareStatement("insert into employee values(?, ?, ?, ?)");
						
						st.setString(1, request.getParameter("name"));
						
						st.setString(2, request.getParameter("email"));
						
						st.setString(3, request.getParameter("gender"));
						
						st.setString(4, request.getParameter("country"));
						
						st.executeUpdate();
						
						st.close();
						
						PrintWriter out = response.getWriter();
						out.println("<html><body><b>Successfully updated"
			                    + "</b></body></html>");
						}
					}
					statement.close();
					con.close();
				}
				catch (Exception e ) {
					e.printStackTrace();
				}
			}
}
