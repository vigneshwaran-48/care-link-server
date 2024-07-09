package com.vapps.carelink.common.service;

import com.vapps.carelink.common.dto.UserDTO;
import com.vapps.carelink.common.exception.AppException;

import java.util.Optional;

public interface UserService {

    String createUser(UserDTO user) throws AppException;

    Optional<UserDTO> getUserById(String id) throws AppException;

    Optional<UserDTO> updateUser(UserDTO user) throws AppException;
}
