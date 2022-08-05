package com.cy.store.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: SSG
 * @time: 2022/7/20  23:54
 */
@Data
public class Product extends BaseEntity implements Serializable {
    private Integer id;
    private Integer categoryId;
    private String itemType;
    private String title;
    private String sellPoint;
    private Long price;
    private Integer num;
    private String image;
    private Integer status;
    private Integer priority;
}
