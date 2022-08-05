package com.cy.store.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/** 用户数据的实体类 */
@Data
public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;//盐值
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;//头像
    private Integer isDelete;

    // Generate: Getter and Setter、Generate hashCode() and equals()、toString()
}