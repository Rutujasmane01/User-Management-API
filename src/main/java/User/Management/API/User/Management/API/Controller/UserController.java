package User.Management.API.User.Management.API.Controller;
import User.Management.API.User.Management.API.Entity.User;
import User.Management.API.User.Management.API.Repository.UserRepository;
import User.Management.API.User.Management.API.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private userService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.CreateUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id)
    {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping
    public   void deleteUser(@PathVariable long id)
    {
        userService.deleteUser(id);
    }
}


