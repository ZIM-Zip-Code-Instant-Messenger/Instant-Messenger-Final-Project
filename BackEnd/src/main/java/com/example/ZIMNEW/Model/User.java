package com.example.ZIMNEW.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Table(name = "users")
@Entity
public class User {

    @Id
    private String userName;

    public User(){

    }

    public User(String userName){

    this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    
}
