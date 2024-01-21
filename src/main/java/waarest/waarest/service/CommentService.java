package waarest.waarest.service;

import org.springframework.stereotype.Service;
import waarest.waarest.entity.Comment;

import java.util.List;
import java.util.Optional;


public interface CommentService {
    List<Comment> findAll();
    Optional<Comment> findById(long id);
    Comment addComment(Comment data);

    String deleteById(long id);
    String updateComment(Comment data, long id);
}
