package com.example.ZIMNEW.Service;

import java.util.List;

import com.example.ZIMNEW.Model.User;

public interface UserService {
    List<User> getall() throws Exception;

    User addUser(User user) throws Exception;

    User getUserByUserName(String username) throws Exception;

}
