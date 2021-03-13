package com.huanghy.scaff.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {


    private String name;
    private double salary;
    private String address;
    private String remark;
    private Date createTime;
    private String birthDate;

}
