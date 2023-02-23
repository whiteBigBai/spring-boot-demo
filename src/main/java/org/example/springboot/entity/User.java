package org.example.springboot.entity;

import lombok.Data;

/**
 * @author bailiang
 */
@Data
public class User {
    private String userName;
    private String password;
    private String salt;
}
