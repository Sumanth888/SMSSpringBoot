package com.spring.smsspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.smsspringboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
