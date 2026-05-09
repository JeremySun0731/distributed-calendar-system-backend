package com.example.calendar.user.controller;

import com.example.calendar.user.entity.User;
import com.example.calendar.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") // ✅ FIXED
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
    @PostMapping("/login")
    public User login(@RequestBody User loginUser){
        return userService.login(
                loginUser.getEmail(),
                loginUser.getPassword()
        );
    }
}