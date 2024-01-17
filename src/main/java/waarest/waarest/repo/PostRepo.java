package waarest.waarest.repo;
import java.util.List;

import waarest.waarest.entity.Post;

public interface PostRepo {
  List<Post> findAll();
}
