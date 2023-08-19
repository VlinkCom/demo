package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        Date now = new Date();
        user.setCreateTime(now);
        user.setUpdTime(now);
        return userRepository.save(user);
    }

    public List<User> queryAll() {
        Iterable<User> iterable = userRepository.findAll();
        List<User> users = new ArrayList<>();
        for(Iterator<User> it = iterable.iterator(); it.hasNext(); ){
            users.add(it.next());
        }
        return users;
    }
}
