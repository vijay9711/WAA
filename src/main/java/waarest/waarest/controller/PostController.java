package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import waarest.waarest.service.PostService;

import java.util.List;
import java.util.Optional;
// import java.util.Random;

import waarest.waarest.entity.Post;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
  
  @Autowired
  PostService postService;

  @GetMapping
  public List<Post> findAll(){
    return postService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Post> findById(@PathVariable("id") int id){
    return postService.findById(id);
  }

//  @DeleteMapping("/{id}")
//  public String deleteById(@PathVariable("id") int id){
//    return postService.deleteById(id);
//  }
  @PostMapping()
  public Post addPost(@RequestBody Post data){
//    Random random = new Random();
//    var id = random.nextInt(900) + 100;
//    data.setId(id);
    return postService.addPost(data);
  }

//  @PutMapping("/{id}")
//  public Post updatePost(@PathVariable("id") int id, @RequestBody Post data){
//    return postService.updatePost(data,id);
//  }
}
