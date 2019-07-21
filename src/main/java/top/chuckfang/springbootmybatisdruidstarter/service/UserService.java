package top.chuckfang.springbootmybatisdruidstarter.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import top.chuckfang.springbootmybatisdruidstarter.domain.User;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-21 22:06
 */
public interface UserService {
    User findById(String id);
}
