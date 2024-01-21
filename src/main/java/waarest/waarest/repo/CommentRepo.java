package waarest.waarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import waarest.waarest.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
