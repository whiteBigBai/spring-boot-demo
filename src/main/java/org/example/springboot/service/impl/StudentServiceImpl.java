package org.example.springboot.service.impl;

import org.example.springboot.entity.Student;
import org.example.springboot.mapper.StudentMapper;
import org.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectStuById1(int id) {
        return studentMapper.selectStuById1(id);
    }

    @Override
    public Student selectStuById2(int id) {
        return studentMapper.selectStuById2(id);
    }
}
