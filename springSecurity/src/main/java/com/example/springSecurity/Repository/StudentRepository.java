package com.example.springSecurity.Repository;

import com.example.springSecurity.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//@EnableMongoRepositories
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>/*MongoRepository<StudentEntity,Integer>*/ {
public Optional<StudentEntity> findByStudentName(String studentName);
public void deleteById(int studentId);


public StudentEntity findByStudentId(int studentId);

}
