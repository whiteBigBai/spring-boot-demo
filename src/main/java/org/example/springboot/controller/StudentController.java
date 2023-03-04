package org.example.springboot.controller;

import org.example.springboot.common.Result;
import org.example.springboot.entity.Student;
import org.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Result getStudent(int id) {
        Student selectStuById1 = studentService.selectStuById1(id);
        Student selectStuById2 = studentService.selectStuById2(id);
        System.out.println(selectStuById1);
        System.out.println(selectStuById2);
        return new Result(200, "查询成功", null);
    }


}
