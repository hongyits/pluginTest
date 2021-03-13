package com.huanghy.scaff.domain;

import lombok.Data;

import java.util.Date;

@Data
public class AuthUser {

    private Integer id;

    private String password;

    private Date lastLogin;

    private String isSuperuser;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String isStaff;

    private String isActive;

    private Date dateJoined;
}
