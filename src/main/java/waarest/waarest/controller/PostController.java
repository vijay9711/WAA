package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import waarest.waarest.entity.Comment;
import waarest.waarest.repo.PostRepo;
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
  @Autowired
  PostRepo postRepo;
  @GetMapping
  public List<Post> findAll(){
    return postService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Post> findById(@PathVariable("id") int id){
    return postService.findById(id);
  }

  @DeleteMapping("/{id}")
  public String deleteById(@PathVariable("id") int id){
    return postService.deleteById(id);
  }
  @PostMapping()
  public Post addPost(@RequestBody Post data){
    return postService.addPost(data);
  }

  @PostMapping("/{post_id}/user/{user_id}/addComment")
  public String addCommentToPost(@RequestBody Comment data, @PathVariable("post_id") int post_id, @PathVariable("user_id") int user_id){
    return postService.addCommentToPost(data, post_id, user_id);
//    return postRepo.findByIdAfterAndComments(post_id, (List<Comment>) data);
  }
  @PutMapping("/{id}")
  public String updatePost(@PathVariable("id") int id, @RequestBody Post data){
    return postService.updatePost(data,id);
  }

  @GetMapping("/filter/findByTitle/{text}")
  public List<Post> findPostsByTitle(@PathVariable("text") String text){
    return postRepo.findPostByTitle(text);
  }
}
