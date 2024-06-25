package com.krayin.krayin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.krayin.krayin.entities.Teacher;
import com.krayin.krayin.exceptions.ResourceNotFoundException;
import com.krayin.krayin.repositories.TeacherRepository;
import com.krayin.krayin.services.impl.TeacherService;

@Component
public class TeacherServiceImp implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> index() {
        return this.teacherRepository.findAll();
    }

    @Override
    public Teacher show(Integer id) {
        return this
                .teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("The teacher associated with %d is not exits", id)));
    }

    @Override
    public Teacher store(Teacher teacher) {
        return this.teacherRepository.save(teacher);
    }

    @Override
    public void destroy(Integer id) {
        this.teacherRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return this.teacherRepository.existsById(id);
    }
}
