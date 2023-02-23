package org.example.springboot.service;

import org.example.springboot.entity.User;

/**
 * @author bailiang
 */
public interface UserService {
    User selectUserByName(String userName);
}
