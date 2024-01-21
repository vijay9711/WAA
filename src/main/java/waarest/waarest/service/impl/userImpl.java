package waarest.waarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import waarest.waarest.entity.Post;
import waarest.waarest.entity.Post;
import waarest.waarest.entity.User;
// import waarest.waarest.repo.PostRepo;
import waarest.waarest.repo.PostRepo;
import waarest.waarest.repo.UserRepo;
import waarest.waarest.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class userImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    PostRepo postRepo;
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

    @Override
    public String deleteById(int id) {
        try {
            userRepo.deleteById(id);
            return "User deleted successfully";
        }catch (Exception e){
            return "There is some problem please try again";
        }
    }

    @Override
    public String updateUser(User data, int id) {
        Optional<User> p = userRepo.findById(id);
        if(p.isPresent()){
            userRepo.save(data);
            return "User updated successfully";
        }else {
            return "User not found";
        }
    }

    @Override
    public Optional<User> addPostToUser(Post data, int user_id) {
        Optional<User> user = userRepo.findById(user_id);
        if(user.isPresent()){
            Post newPost = postRepo.save(data);
            List<Post> userPostList = user.get().getPosts();
            newPost.setUser(user.get());
            userPostList.add(newPost);
            user.get().setPosts(userPostList);
            userRepo.save(user.get());
            return user;
        }else{
            return Optional.empty();
        }
    }

}
