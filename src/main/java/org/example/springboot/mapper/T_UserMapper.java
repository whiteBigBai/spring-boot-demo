package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.T_User;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface T_UserMapper {
    T_User selectUserOrderById1(int id);

    T_User selectUserOrderById2(int id);
}
