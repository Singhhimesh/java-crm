package com.krayin.krayin.controllers;

import com.krayin.krayin.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("")
    public Student index() {
        Student student = new Student();
        student.setId(1);
        student.setEmail("surajkashayp370@webkul.in");
        student.setName("Suraj Kashyap");
        student.setFatherName("Ram Kumar");

        return student;
    }
}
