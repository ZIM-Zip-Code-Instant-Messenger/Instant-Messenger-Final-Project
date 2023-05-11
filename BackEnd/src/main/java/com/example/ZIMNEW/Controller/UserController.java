package com.example.ZIMNEW.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZIMNEW.Service.UserService;
import com.example.ZIMNEW.Model.User;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll() throws IOException {
        try{
            return new ResponseEntity<List<User>>(service.getAll(), HttpStatus.OK);
        }catch (UserNotFoundException e){
            return ResponseEntity(body: "User not Found", HttpStatus.NOT_FOUND)
        }
    }

    @PostMapping("/add")
        public ResponseEntity<User> addUser(@RequestBody User user) throws IOException {
            try{
                return new ResponseEntity<User>(service.addUser(user), HttpStatus.CONFLICT);
            } catch (UserAlreadyExist e){
                return new ResponseEntity(body:"User already exists", HttpStatus.CONFLICT);
            }
        }

    @GetMapping("/getbyusername/{username}")
    public ResponseEntity<User> getUserByUserName(@PathVariable String username) throws IOException {
        try {
            return new ResponseEntity<User>(service.getUserByUserName(username), HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity(body: "User not Found", HttpStatus.NOT_FOUND);
        }
    }
}