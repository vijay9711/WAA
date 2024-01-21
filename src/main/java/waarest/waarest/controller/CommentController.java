package waarest.waarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waarest.waarest.entity.Comment;
import waarest.waarest.entity.Post;
import waarest.waarest.service.CommentService;
import waarest.waarest.service.PostService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment> findAllComments(){
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Comment> findById(@PathVariable("id") int id){
        return commentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") int id){
        return commentService.deleteById(id);
    }
    @PostMapping()
    public Comment addComment(@RequestBody Comment data){
        return commentService.addComment(data);
    }

    @PutMapping("/{id}")
    public String updatePost(@PathVariable("id") int id, @RequestBody Comment data){
        return commentService.updateComment(data,id);
    }
}
