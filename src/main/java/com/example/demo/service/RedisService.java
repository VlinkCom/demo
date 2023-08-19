package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public String getDemoByRedis() {
        Object o = redisTemplate.opsForValue().get("good_luck");
        if (Objects.isNull(o)) {
            return "null";
        }
        return o.toString();
    }
}
