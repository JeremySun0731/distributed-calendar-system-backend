package com.example.calendar.user;
import com.example.calendar.user.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userservice) {
        this.userService = userservice;
    }

    // 测试用 GET
    @GetMapping("/register")
    public User testRegister() {

        User user = new User();
        user.setUserName("Test");
        user.setEmail("test@test.com");
        user.setPassword("123456");

        return userService.register(user);
    }

    // 正式 POST 注册
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}