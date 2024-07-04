package com.vapps.carelink.controller;

import com.vapps.carelink.common.dto.UserDTO;
import com.vapps.carelink.common.exception.AppException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDTO user, HttpServletRequest request) throws AppException {

    }
}