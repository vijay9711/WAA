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
    Post p1 = new Post(100,"Social", "content about social", "James");
    Post p2 = new Post(101,"Event", "Node js with mongoDB event", "Lil ni");
    Post p3 = new Post(102,"Friendly", "Feel to share friendly post.", "Ana kim");
    Post p4 = new Post(103,"Snowboard", "Outdoor activity in winter.", "Tim nick");
    postList.add(p1);
    postList.add(p2);
    postList.add(p3);
    postList.add(p4);
  }


  @Override
  public List<Post> findAll() {
    return postList;
  }
  
}
