import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        String host = "jdbc:mysql://localhost:3306/";
        String database = "firstjava";

        String connectionString = host + database;
        String username = "root";
        String password = "Jl0186329";

        Connection conn = DriverManager.getConnection(connectionString, username, password);

        Statement statement = conn.createStatement();

        /*String query = "create table customers (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50))";
        statement.execute(query);
        System.out.println("made a table");*/

        String query = "insert into customers (name, email) values (? , ?)";

        PreparedStatement preparedStatement =  conn.prepareStatement(query);

        preparedStatement.setString(1,"Hank");
        preparedStatement.setString(2,"Hank@propane.com");

        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("("+rowAffected+") rows affected");

        /*String query = "update customers set name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, "Paul");
        preparedStatement.setString(2, "p@gmail.com");
        preparedStatement.setInt(3, 1);
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("("+rowAffected+") rows affected");*/

       /* String query = "delete from customers where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, 1);
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("(" + rowAffected + ") rows affected");

        if (conn.isClosed()) {
            System.out.println("connection closed");
        } else {
            System.out.println("connection open");
        }*/

        String query2 = "select * from customers";
        ResultSet resultSet =  statement.executeQuery(query2);

        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);

            System.out.println("Id = "+ id+ ", Name = "+ name+", Email: "+ email);

        }
    }
}
