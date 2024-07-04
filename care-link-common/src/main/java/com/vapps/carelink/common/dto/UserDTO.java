package com.vapps.carelink.common.dto;

import lombok.Data;

@Data
public class UserDTO {

    public enum Role {
        CUSTOMER,
        CARE_TAKER
    }

    private String id;
    private String name;
    private String fullName;
    private String lastName;
    private int age;
    private Role role;

}
