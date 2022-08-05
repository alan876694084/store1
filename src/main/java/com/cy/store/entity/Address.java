package com.cy.store.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: SSG
 * @time: 2022/7/17  16:29
 */
@Data
public class Address extends BaseEntity implements Serializable {
    private Integer aid;//收获地址id
    private Integer uid;
    private String name;//收货人姓名
    private String provinceName;//省-名称
    private String provinceCode;//省-行政代号
    private String cityName;
    private String cityCode;//城市-行政代号
    private String areaName;//区-名称
    private String areaCode;//区-行政代号
    private String zip;//邮政编码
    private String address;
    private String phone;
    private String tel;//固话
    private String tag;//标签
    private Integer isDefault;//是否默认：0-不默认，1-默认
}
