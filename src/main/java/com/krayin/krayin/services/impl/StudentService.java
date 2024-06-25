package com.krayin.krayin.services.impl;

import com.krayin.krayin.entities.Student;

import java.util.List;

public interface StudentService {
    public List<Student> index();

    public Student show(Integer id);

    public Student store(Student student);

    public void destroy(Integer id);

    public boolean existsById(Integer id);
}