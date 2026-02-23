package com.example.calendar.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/register")
    public User register() {
        User user = new User();
        user.setUserName("Test");
        user.setEmail("test@test.com");
        user.setPassword("123456");
        return userService.register(user);
    }
}