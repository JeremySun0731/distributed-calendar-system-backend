package com.example.calender.calendar.user;

public class UserService {
    private UserRepository userRepository;
    public User rigister(User user){
        return userRepository.save(user);
    }
}
