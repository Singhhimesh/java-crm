package com.krayin.krayin.services.impl;

import java.util.List;

import com.krayin.krayin.entities.Teacher;

public interface TeacherService {
    public List<Teacher> index();

    public Teacher show(Integer id);

    public Teacher store(Teacher teacher);

    public void destroy(Integer id);

    public boolean existsById(Integer id);
}
