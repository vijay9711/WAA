package waarest.waarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import waarest.waarest.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
