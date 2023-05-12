package com.example.ZIMNEW.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZIMNEW.Model.User;
import com.example.ZIMNEW.Repository.UserRepository;

@Service
public class UserServicelmpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getall() throws Exception {
        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            throw new Exception("User is not found");
        } else {
            return users;
        }
    }

    @Override
    public User addUser(User user) throws Exception {
        Optional<User> user1 = userRepository.findById(user.getUserName());

        if (user1.isPresent()) {
            throw new Exception("User Name is already taken");
        } else {
            return userRepository.save(user);
        }

    }

    @Override
    public User getUserByUserName(String username) throws Exception {
        Optional<User> user1 = userRepository.findById(username);

        if (user1.isPresent()) {
            return user1.get();
        } else {
            throw new Exception("User is not found");
        }

    }

}
