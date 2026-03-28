package User.Management.API.User.Management.API.Controller;

import User.Management.API.User.Management.API.Entity.User;
import User.Management.API.User.Management.API.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
    private UserRepository userRepository;

    @PostMapping
    public User CreateUser(@RequestBody User user)
   {
        return  userRepository.save(user);
   }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

