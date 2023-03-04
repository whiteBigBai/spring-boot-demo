package org.example.springboot.service;

import org.example.springboot.entity.T_User;

public interface T_UserService {
    T_User selectUserOrderById1(int id);

    T_User selectUserOrderById2(int id);
}
