package org.example.springboot.service;

import org.example.springboot.entity.Student;

public interface StudentService {
    Student selectStuById1(int id);

    Student selectStuById2(int id);
}
