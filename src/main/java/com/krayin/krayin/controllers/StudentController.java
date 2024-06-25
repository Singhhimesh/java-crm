package com.krayin.krayin.controllers;

import com.krayin.krayin.entities.Student;
import com.krayin.krayin.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.type.IntersectionType;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping
    public ResponseEntity<List<Student>> index() {
        return ResponseEntity.ok(this.studentService.index());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> show(@PathVariable Integer id) {
        return ResponseEntity
                .ok(this.studentService.show(id));
    }

    @PostMapping
    public ResponseEntity<Student> store(@RequestBody Student student) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.studentService.store(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student student) {
        if (!this.studentService.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        student.setId(id);

        return ResponseEntity.status(HttpStatus.OK).body(this.studentService.store(student));
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable Integer id) {
        this.studentService.destroy(id);
    }
}
