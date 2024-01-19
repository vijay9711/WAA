package waarest.waarest.service;

import java.util.List;
import java.util.Optional;

// import org.springframework.data.jpa.repository.JpaRepository;
import waarest.waarest.entity.Post;
public interface PostService {
 List<Post> findAll();
 Optional<Post> findById(int id);
 Post addPost(Post data);

// String deleteById(int id);
// Post updatePost(Post data, int id);
}
