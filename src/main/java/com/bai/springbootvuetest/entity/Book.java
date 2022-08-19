package com.bai.springbootvuetest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @program: SpringBoot
 * @description: book类
 * @author: BaiWenHui
 * @create: 2022-08-16 11:22
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置id自增
    private Integer id;//和数据库的book表的id属性自动绑定
    private String name;
    private String author;
}
