package waarest.waarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waarest.waarest.entity.Comment;
import waarest.waarest.entity.Post;
import waarest.waarest.repo.CommentRepo;
import waarest.waarest.service.CommentService;

import java.util.List;
import java.util.Optional;

@Service
public class commentImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;
    @Override
    public List<Comment> findAll() {
        return commentRepo.findAll();
    }

    @Override
    public Optional<Comment> findById(long id) {
        return commentRepo.findById(id);
    }

    @Override
    public Comment addComment(Comment data) {
        return commentRepo.save(data);
    }

    @Override
    public String deleteById(long id) {
        commentRepo.deleteById(id);
        return "Comment deleted successfully";
    }

    @Override
    public String updateComment(Comment data, long id) {
        Optional<Comment> c = commentRepo.findById(id);
        if(c.isPresent()){
            commentRepo.save(data);
            return "Comment updated successfully";
        }else {
            return "Comment not found";
        }
    }
}
