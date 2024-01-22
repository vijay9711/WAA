package waarest.waarest.repo;
// import java.util.List;
// import java.util.UUID;

// import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.data.jpa.repository.JpaRepository;
import waarest.waarest.entity.Comment;
import waarest.waarest.entity.Post;
import waarest.waarest.entity.dtos.PostDto;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

  Post save(PostDto data);

  public List<Post> findPostByTitle(String title);
  public List<Post> findPostByAuthor(String name);

//  Post save(Post data, int id);
//  List<Post> findAll();
//  Post findById(int id);
//  Post addPost(Post data);
//  String deleteById(int id);
//  String updatePost(Post data, int id);
}
