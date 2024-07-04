package com.vapps.carelink.service;

import com.vapps.carelink.common.dto.UserDTO;
import com.vapps.carelink.common.exception.AppException;
import com.vapps.carelink.common.service.UserService;
import com.vapps.carelink.model.User;
import com.vapps.carelink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String createUser(UserDTO user) throws AppException {
        return "";
    }

    @Override
    public Optional<UserDTO> getUserById(String id) throws AppException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return Optional.of(user.get().toDTO());
        }
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> updateUser(UserDTO user) throws AppException {
        return Optional.empty();
    }
}
