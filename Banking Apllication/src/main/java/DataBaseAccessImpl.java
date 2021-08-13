import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DataBaseAccessImpl implements DataBaseAccess {
    private static DataBaseAccessImpl instance;

    private DataBaseAccessImpl() {
    }

    public static DataBaseAccessImpl getInstance() {
        if (instance == null) {
            instance = new DataBaseAccessImpl();
        }
        return instance;
    }

    public User getUser(String name) {
        try (Connection con = DataBaseConnector.getConnection()) {
            PreparedStatement ps = con
                    .prepareStatement("SELECT name, password, balance, admin, approved " + "FROM user_account WHERE name = ?");
            ps.setString(1, name);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return new User(resultSet.getString("name"), resultSet.getString("password"), resultSet.getFloat("balance"), resultSet.getBoolean("admin"),
                        resultSet.getBoolean("approved"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        return null;

    }

    public boolean insertUser(User u) {
        try (Connection con = DataBaseConnector.getConnection()) {
            // INSERT INTO user_account VALUES ('Ian', 123.45, 1, 1);
            int idx = 0;
            // CallableStatement stmt = conn.prepareCall("{CALL update_user(?, ?, ?, ?,
            // ?)}");
            PreparedStatement ps = con.prepareStatement("INSERT INTO user_account (name, password, balance, admin, approved) "
                    + "VALUES (?, ?, ?, ?, ?)");
            ps.setString(++idx, u.name);
            ps.setString(++idx, u.password);
            ps.setFloat(++idx, u.balance);
            ps.setBoolean(++idx, u.admin);
            ps.setBoolean(++idx, u.approved);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        return false;
    }

    public boolean deleteUser(User u) {
        // DELETE FROM user_account WHERE name = 'Ian B';
        try (Connection con = DataBaseConnector.getConnection()) {
            PreparedStatement ps = con.prepareStatement("DELETE FROM user_account WHERE name = ?");
            ps.setString(1, u.name);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        return false;
    }

    public boolean updateUser(User u) {
        // UPDATE user_account SET balance = 4.0, approved = 0 WHERE name = ?;
        try (Connection con = DataBaseConnector.getConnection()) {
            int idx = 0;
            PreparedStatement ps = con.prepareStatement("UPDATE user_account SET "
                    + "balance = ?, approved = ?, admin = ? WHERE name = ?");
            ps.setFloat  (++idx, u.balance);
            ps.setBoolean(++idx, u.approved);
            ps.setBoolean(++idx, u.admin);
            ps.setString (++idx, u.name);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        return false;
    }

    @Override
    public Map<String, User> getAllUsers() {
        Map<String, User> map = new HashMap<>();
        try (Connection con = DataBaseConnector.getConnection()) {
            PreparedStatement ps = con
                    .prepareStatement("SELECT name, password, balance, admin, approved "
                            + "FROM user_account");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getString("name"),
                        rs.getString("password"),
                        rs.getFloat("balance"),
                        rs.getBoolean("admin"),
                        rs.getBoolean("approved"));
                map.put(u.name, u);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        return map;
    }
}