package com.example.springSecurity.Repository;

import com.example.springSecurity.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
    public StudentEntity findByStudentName(String studentName);

}

