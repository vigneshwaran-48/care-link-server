package com.vapps.carelink.model;

import com.vapps.carelink.common.dto.UserDTO;
import com.vapps.carelink.common.dto.UserDTO.Role;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {

    @Id
    private String id;

    private String name;
    private String fullName;
    private String lastName;
    private int age;
    private Role role;

    public UserDTO toDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(age);
        userDTO.setId(id);
        userDTO.setName(name);
        userDTO.setFullName(fullName);
        userDTO.setRole(role);
        userDTO.setLastName(lastName);
        return userDTO;
    }

    public static User build(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setAge(userDTO.getAge());
        user.setRole(userDTO.getRole());
        user.setFullName(userDTO.getFullName());
        user.setLastName(userDTO.getLastName());
        user.setName(userDTO.getName());
        return user;
    }
}
