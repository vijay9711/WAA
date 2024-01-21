package waarest.waarest.service;

// import waarest.waarest.entity.Post;
import waarest.waarest.entity.Post;
import waarest.waarest.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(int id);
    User addUser(User data);

    String deleteById(int id);

    String updateUser(User data, int id);

    Optional<User> addPostToUser(Post data, int user_id);

//    List<User> findUsersByPostsGreaterThan(int user_id, int count);
}
