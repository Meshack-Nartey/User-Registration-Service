package com.narteykwamemeshack.userregistrationservice;

public interface UserRepository {
    // an interface to save a user or find the user.
    void save(User user);
    User findByUserEmail(String UserEmail);
}
