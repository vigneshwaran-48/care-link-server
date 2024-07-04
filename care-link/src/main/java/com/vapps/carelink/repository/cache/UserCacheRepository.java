package com.vapps.carelink.repository.cache;

import com.vapps.carelink.model.User;
import com.vapps.carelink.repository.UserRepository;
import com.vapps.carelink.repository.mongo.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserCacheRepository implements UserRepository {

    @Autowired
    private UserMongoRepository userRepository;

    @Override
    @Cacheable(value = "users", key = "'user_' + #id")
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    @CachePut(value = "users", key = "'user_' + #user.getId()")
    public User update(User user) {
        return null;
    }
}
