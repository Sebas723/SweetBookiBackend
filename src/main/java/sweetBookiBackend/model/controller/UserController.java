package sweetBookiBackend.model.controller;

import org.springframework.web.bind.annotation.*;
import sweetBookiBackend.model.entity.User;
import sweetBookiBackend.model.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/list-users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
