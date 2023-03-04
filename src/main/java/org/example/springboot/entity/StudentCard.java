package org.example.springboot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class StudentCard {
    private int id;
    private int studentId;
    private Date startDate;
    private Date endDate;
}
