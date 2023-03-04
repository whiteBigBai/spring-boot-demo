package org.example.springboot.entity;

import lombok.Data;

import java.util.List;

@Data
public class T_User {
    private int id;
    private String name;
    private String pwd;
    private List<Order> orderList;
}
