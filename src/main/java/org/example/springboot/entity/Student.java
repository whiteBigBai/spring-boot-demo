package org.example.springboot.entity;

import lombok.Data;

/**
 * @author bailiang
 */
@Data
public class Student {
    private int id;
    private String name;
    private int sex;
    private StudentCard studentCard;
}
