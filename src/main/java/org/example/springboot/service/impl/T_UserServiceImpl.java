package org.example.springboot.service.impl;

import org.example.springboot.entity.T_User;
import org.example.springboot.mapper.T_UserMapper;
import org.example.springboot.service.T_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T_UserServiceImpl implements T_UserService {
    @Autowired
    private T_UserMapper tUserMapper;

    @Override
    public T_User selectUserOrderById1(int id) {
        return tUserMapper.selectUserOrderById1(id);
    }

    @Override
    public T_User selectUserOrderById2(int id) {
        return tUserMapper.selectUserOrderById2(id);
    }
}
