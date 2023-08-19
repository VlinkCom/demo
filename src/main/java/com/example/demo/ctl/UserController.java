package com.example.demo.ctl;

import com.example.demo.model.User;
import com.example.demo.service.RedisService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private RedisService redisService;

    @GetMapping("/hello_mysql")
    public List<User> queryAll() {
        return userService.queryAll();
    }


//    @PostMapping("/create")
//    public User createUser(@RequestBody User user) {
//        if (!StringUtils.hasLength(user.getName())) {
//            throw new RuntimeException("name is null");
//        }
//        return userService.createUser(user);
//    }

    @GetMapping("/hello_redis")
    public String getByRedis() {
        return redisService.getDemoByRedis();
    }

}
