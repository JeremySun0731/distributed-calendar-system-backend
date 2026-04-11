package com.example.calendar.user;

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
}