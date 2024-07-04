package com.vapps.carelink.repository;

import com.vapps.carelink.model.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(String id);

    User save(User user);

    User update(User user);
}
