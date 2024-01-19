package waarest.waarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import waarest.waarest.entity.Post;
import waarest.waarest.entity.User;
// import waarest.waarest.repo.PostRepo;
import waarest.waarest.repo.UserRepo;
import waarest.waarest.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class userImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public User addUser(User data) {
        return userRepo.save(data);
    }
}
