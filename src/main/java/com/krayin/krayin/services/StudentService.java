package com.krayin.krayin.services;

import com.krayin.krayin.entities.Student;
import com.krayin.krayin.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> index() {
        return this.studentRepository.findAll();
    }

    public Student show(Integer id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    public Student store(Student student) {
        return this.studentRepository.save(student);
    }

    public void destroy(Integer id) {
        this.studentRepository.deleteById(id);
    }
}
