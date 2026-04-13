package User.Management.API.User.Management.API.Service;

import User.Management.API.User.Management.API.Entity.User;

import java.util.List;

public interface userService {
    User CreateUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    User updateUser(long id,User user);
    void deleteUser(long id);
}
