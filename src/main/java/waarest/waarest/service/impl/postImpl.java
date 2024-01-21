package waarest.waarest.service.impl;

import java.util.List;
import java.util.Optional;

import waarest.waarest.entity.Comment;
import waarest.waarest.entity.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waarest.waarest.entity.User;
import waarest.waarest.entity.dtos.UserDto;
import waarest.waarest.repo.CommentRepo;
import waarest.waarest.repo.PostRepo;
import waarest.waarest.repo.UserRepo;
import waarest.waarest.service.PostService;

@Service
public class postImpl implements PostService{

  @Autowired
  PostRepo postRepo;
  @Autowired
  CommentRepo commentRepo;

  @Autowired
  UserRepo userRepo;

  @Override
  public List<Post> findAll() {
    return postRepo.findAll();
  }

  @Override
  public Optional<Post> findById(int id) {
    return postRepo.findById(id);
  }

  @Override
  public Post addPost(Post data) {
    return postRepo.save(data);
  }

  @Override
  public String deleteById(int id) {
    try {
      postRepo.deleteById(id);
      return "Post deleted successfully";
    }catch (Exception e){
      return "There is some problem please try again";
    }
  }

  @Override
  public String updatePost(Post data, int id) {
    Optional<Post> p = postRepo.findById(id);
    if(p.isPresent()){
      postRepo.save(data);
      return "Post updated successfully";
    }else {
      return "Post not found";
    }
  }

  @Override
  public String addCommentToPost(Comment comment, int post_id, int user_id) {
    Optional<Post> post = postRepo.findById(post_id);
    if(post.isPresent()){
      Comment newComment = commentRepo.save(comment);
      Optional<User> user = userRepo.findById(user_id);
      if(user.isPresent()){
        newComment.setName(user.get().getName());
      }else {
        return "User not found";
      }
      List<Comment> postCommentList = post.get().getComments();
      postCommentList.add(newComment);
      post.get().setComments(postCommentList);
      postRepo.save(post.get());
      return "Comment added successfully";
    }else{
      return "Post not found";
    }
  }

}
