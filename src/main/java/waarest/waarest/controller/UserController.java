package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waarest.waarest.Aspects.annotation.LogExecutionTime;
import waarest.waarest.entity.Post;
import waarest.waarest.entity.User;
import waarest.waarest.repo.UserRepo;
import waarest.waarest.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;
    @GetMapping
    @LogExecutionTime
    public List<User> findAllUser(){
        return userService.findAll();
    }

    @PostMapping()
    public User addUser(@RequestBody User data){
        return userService.addUser(data);
    }

    @PostMapping("/{user_id}/addPost")
    public Optional<User> addPostToUser(@RequestBody Post data, @PathVariable("user_id") int user_id){
        return userService.addPostToUser(data, user_id);
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") int id){
        return userService.findById(id);
    }

//    @PutMapping

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable("id") int id){
        return userService.deleteById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User data){
        return userService.updateUser(data,id);
    }

    @GetMapping("/filter/findUserByPostCount/{count}")
    public List<User> getUserByPostCount(@PathVariable("count") int count){
        return userRepo.findUsersByPostCount(count);
    }

    @GetMapping("/filter/findUserByPostTitle/{title}")
    public User getUserByPostTitle(@PathVariable("title") String title){
        return userRepo.getUserByPostTitle(title);
    }
}
