package com.krayin.krayin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krayin.krayin.entities.Teacher;
import com.krayin.krayin.services.TeacherServiceImp;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherServiceImp teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> index() {
        return ResponseEntity.ok(this.teacherService.index());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> show(@PathVariable Integer id) {
        return ResponseEntity.ok(this.teacherService.show(id));
    }

    @PostMapping
    public ResponseEntity<Teacher> store(@RequestBody Teacher teacher) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.teacherService.store(teacher));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teacher> update(@PathVariable Integer id, @RequestBody Teacher teacher) {
        if (! this.teacherService.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        System.err.println(teacher);
        System.err.println(id);

        teacher.setId(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.teacherService.store(teacher));
    }
}
