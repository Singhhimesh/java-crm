package com.krayin.krayin.controllers;

import com.krayin.krayin.entities.Student;
import com.krayin.krayin.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> index() {
        return this.studentService.index();
    }

    @GetMapping("/{id}")
    public Student show(@PathVariable Integer id) {
        return this.studentService.show(id);
    }

    @PostMapping
    public Student store(@RequestBody Student student) {
        return this.studentService.store(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Integer id, @RequestBody Student student) {
        student.setId(id);

        return this.studentService.store(student);
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable Integer id) {
        this.studentService.destroy(id);
    }
}
