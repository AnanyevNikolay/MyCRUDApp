package web.dao;
import web.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void save(User user);
    User getUser(int id);
    void update(int id, User updateUser);
    void delete(int id);
}
