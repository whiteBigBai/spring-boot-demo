package org.example.springboot.service.impl;

import org.example.springboot.entity.User;
import org.example.springboot.mapper.UserMapper;
import org.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bailiang
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
