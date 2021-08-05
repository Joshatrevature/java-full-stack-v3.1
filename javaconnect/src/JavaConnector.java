import java.sql.*;

public class JavaConnector {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1: load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        // Step 2: Create connection Object
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day7", "root", "Jl0186329");

        // Step 3: Create Statement Object
        Statement statement = conn.createStatement();

        // Step 4: Execute Query
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while (resultSet.next()) {
            System.out.println("Id: " + resultSet.getInt(1) + ", Name: "
                    + resultSet.getString(2)/* + ", Email: " + resultSet.getString(3)*/);
        }

        // Step 5: Close the connection
        conn.close();


    }
}
