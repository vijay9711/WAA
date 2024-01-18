package waarest.waarest.service.impl;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonValue;
import waarest.waarest.entity.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waarest.waarest.repo.PostRepo;
import waarest.waarest.service.PostService;

@Service
public class postImpl implements PostService{

  @Autowired
  PostRepo postRepo;

  @Override
  public List<Post> findAll() {
    return postRepo.findAll();
  }

  @Override
  public Post findById(int id) {
    return postRepo.findById(id);
  }

  @Override
  public Post addPost(Post data) {
    return postRepo.addPost(data);
  }

  @Override
  public String deleteById(int id) {
    return postRepo.deleteById(id);
  }

  @Override
  public String updatePost(Post data, int id) {
    return postRepo.updatePost(data, id);
  }

}
