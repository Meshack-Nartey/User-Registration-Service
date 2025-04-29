package com.narteykwamemeshack.userregistrationservice;

import org.springframework.stereotype.Service;

@Service
public class UserService{
    // fields for two classes implemented.
    private final UserRepository userRepository;
    private final NotificationService notificationService;

     //constructor for the UserService fields..
    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    // throw an exception if the user already exists in the repository.
    public void registerUser(User user){
        if (userRepository.findByUserEmail(user.getUserEmail()) != null){
            throw new IllegalArgumentException("User already exists");
        }
        userRepository.save(user);
        notificationService.send("You registered successfully", user.getUserEmail());

    }
}
