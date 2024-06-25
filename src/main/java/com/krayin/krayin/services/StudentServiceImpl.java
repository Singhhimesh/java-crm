package com.krayin.krayin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.krayin.krayin.entities.Student;
import com.krayin.krayin.exceptions.ResourceNotFoundException;
import com.krayin.krayin.repositories.StudentRepository;
import com.krayin.krayin.services.impl.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> index() {
        return this.studentRepository.findAll();
    }

    @Override
    public boolean existsById(Integer id) {
        return this.studentRepository.existsById(id);
    }

    @Override
    public Student show(Integer id) {
        return this
                .studentRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("The user associated with %d id was not found", id)));
    }

    @Override
    public Student store(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public void destroy(Integer id) {
        this.studentRepository.deleteById(id);
    }
}
