package waarest.waarest.service;

// import waarest.waarest.entity.Post;
import waarest.waarest.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(int id);
    User addUser(User data);
}
