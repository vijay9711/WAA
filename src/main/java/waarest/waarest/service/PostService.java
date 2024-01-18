package waarest.waarest.service;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonValue;
import waarest.waarest.entity.Post;
public interface PostService {
 List<Post> findAll();
 Post findById(int id);
 Post addPost(Post data);

 String deleteById(int id);
}
