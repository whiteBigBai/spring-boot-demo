package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.StudentCard;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentCardMapper {
    StudentCard selectStuCardById(int id);
}
