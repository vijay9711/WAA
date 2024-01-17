package waarest.waarest.service.impl;

import java.util.List;

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
  
}
