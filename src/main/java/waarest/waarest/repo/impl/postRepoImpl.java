package waarest.waarest.repo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonValue;
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

  @Override
  public Post findById(int id) {
    return postList.stream().filter(x->x.getId() == id).findFirst().orElse(null);
  }

  @Override
  public Post addPost(Post data) {
    postList.add(data);
    return data;
  }

  @Override
  public String deleteById(int id) {
    List<Post> newPost = new ArrayList<Post>(postList.size());
    for(var i = 0; i < postList.size(); i++){
      if(postList.get(i).getId() != id){
        newPost.add(postList.get(i));
      }
    }
    postList = newPost;
    return "deleted successfully";
  }
  @Override
  public String updatePost(Post data, int id) {
    for(var i = 0; i < postList.size(); i++){
      if(postList.get(i).getId() == id){
        data.setId(id);
        postList.set(i,data);
      }
    }
    return "updated successfully";
  }

}
