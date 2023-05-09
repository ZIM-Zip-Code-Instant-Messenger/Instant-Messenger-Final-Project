package com.ZIM.Zipcode.Instant.Messager.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    public UserService(UserRepository userRepository){
    }
	public List <User> getUsers(){
		return UserRepository.findAll();
    
}

}
