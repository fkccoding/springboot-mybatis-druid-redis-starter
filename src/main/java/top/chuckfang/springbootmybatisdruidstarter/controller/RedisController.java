package top.chuckfang.springbootmybatisdruidstarter.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-04 18:29
 */
@RestController
public class RedisController {

    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping("/setandget")
    public String setandget(){
        redisTemplate.opsForValue().set("spring boot","redis-cluster");
        return (String) redisTemplate.opsForValue().get("spring boot");
    }
}
