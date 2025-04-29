package com.narteykwamemeshack.userregistrationservice;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
 @Repository
public class InMemoryUserRepository implements UserRepository {
     //HasHMap for storing the users.
    HashMap<String, User> users = new HashMap<String, User>();
    @Override
    public void save(User user) {
        System.out.println("Saving user");
        users.put(user.UserEmail, user);
    }
    @Override
    public User findByUserEmail(String UserEmail) {
        return users.getOrDefault(UserEmail, null);
    }
}
