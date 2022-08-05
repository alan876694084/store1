package com.cy.store.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: SSG
 * @time: 2022/7/17  21:32
 */
@Data
public class District implements Serializable {
    private Integer id;
    private String parent;//父代号
    private String code;
    private String name;
}
