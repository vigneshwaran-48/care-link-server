package com.vapps.carelink.repository.mongo;

import com.vapps.carelink.model.User;
import com.vapps.carelink.repository.UserRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, String> {
}
