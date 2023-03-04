package org.example.springboot.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author bailiang
 */
@Data
public class Product {
    private int id;
    private String name;
    private int number;
    private Date start_time;
    private Date end_time;
    private Date create_time;
    private String product_img;

}
