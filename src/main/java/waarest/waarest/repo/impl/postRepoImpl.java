package waarest.waarest.repo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import waarest.waarest.entity.Post;
import waarest.waarest.repo.PostRepo;

@Repository
public class postRepoImpl implements PostRepo{

  private static List<Post> postList;
  static{
    postList = new ArrayList<Post>();
    Post p1 = new Post(100,"vijay", "content", "event");
    postList.add(p1);
  }


  @Override
  public List<Post> findAll() {
    return postList;
  }
  
}
