package com.narteykwamemeshack.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationServiceApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(UserRegistrationServiceApplication.class, args);
        var UserService = context.getBean(UserService.class);
       // UserService.registerUser(new User(56L,"Mesh","meshack@mentormecollective","234JFJj"));

        // trying to add the same user again
        UserService.registerUser(new User(56L,"Mesh","meshack@mentormecollective","234JFJj"));
    }
}
