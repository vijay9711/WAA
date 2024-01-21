package waarest.waarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import waarest.waarest.entity.User;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
//    @Query()
    @Query( "select user from User user where size(user.posts) >= :count" )
    public List<User> findUsersByPostCount(int count);
}
