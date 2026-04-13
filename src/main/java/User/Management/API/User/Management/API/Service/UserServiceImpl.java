package User.Management.API.User.Management.API.Service;

import User.Management.API.User.Management.API.Entity.User;
import User.Management.API.User.Management.API.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.Override;
import java.util.List;

@Service
public class UserServiceImpl implements userService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User CreateUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id)
    {
        return userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));
    }

    @Override
    public User updateUser(long id,User user)
    {
        User  updatedUser = userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));

        updatedUser.setName(user.getName());
        updatedUser.setEmail(user.getEmail());
        return userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(long id)
    {
        userRepository.deleteById(id);
    }
}
