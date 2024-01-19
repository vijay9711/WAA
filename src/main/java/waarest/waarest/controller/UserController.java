package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waarest.waarest.entity.User;
import waarest.waarest.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping()
    public User addPost(@RequestBody User data){
        return userService.addUser(data);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") int id){
        return userService.findById(id);
    }
}
