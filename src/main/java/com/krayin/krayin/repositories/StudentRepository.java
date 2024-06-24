package com.krayin.krayin.repositories;

import com.krayin.krayin.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface StudentRepository extends JpaRepository<Student, Integer> {
}