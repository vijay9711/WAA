package waarest.waarest.repo;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonValue;
import waarest.waarest.entity.Post;

public interface PostRepo {
  List<Post> findAll();
  Post findById(int id);
  Post addPost(Post data);
  String deleteById(int id);
  String updatePost(Post data, int id);
}
