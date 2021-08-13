import java.util.Map;

public interface DataBaseAccess {
    boolean insertUser(User user);

    User getUser(String name);

    boolean updateUser(User user);

    boolean deleteUser(User user);

    Map<String, User> getAllUsers();
}
