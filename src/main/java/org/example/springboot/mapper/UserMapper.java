package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.springboot.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author bailiang
 */
@Repository
@Mapper
public interface UserMapper {
    /**
     * 查询所有数据
     *
     * @return
     */
    User selectUserByName(@Param("userName") String userName);
}
