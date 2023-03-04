package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.Student;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    Student selectStuById1(int id);

    Student selectStuById2(int id);
}
