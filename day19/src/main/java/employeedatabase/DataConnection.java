package employeedatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	protected static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
	{
		
		String dbURL = "jdbc:mysql:// localhost:3306/";
		
		String dbName = "webemployee";
		String dbUsername = "root";
		String dbPassword = "Jl0186329";
		
		//Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL +dbName,
				dbUsername, dbPassword);
		return con;
	}
}
