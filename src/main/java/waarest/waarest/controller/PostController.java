package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import waarest.waarest.service.PostService;

import java.util.List;

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

}
