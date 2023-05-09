package com.ZIM.Zipcode.Instant.Messager.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<password> 
        extends JpaRepository<User, password > {

    static List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
