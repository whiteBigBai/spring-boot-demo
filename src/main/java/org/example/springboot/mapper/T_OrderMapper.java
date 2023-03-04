package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.T_Order1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface T_OrderMapper {
    List<T_Order1> selectOrderById(int id);
}
