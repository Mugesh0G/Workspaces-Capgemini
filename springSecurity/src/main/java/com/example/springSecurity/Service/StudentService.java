package com.example.springSecurity.Service;

import com.example.springSecurity.Authentication.StudentDetailsAuth;
import com.example.springSecurity.Entity.StudentEntity;
import com.example.springSecurity.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

import static com.example.springSecurity.Authorities.UserRole.ADMIN;
import static com.example.springSecurity.Authorities.UserRole.STUDENT;

@Service
public class StudentService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;



    private final PasswordEncoder passwordEncoder;

    public StudentService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        StudentEntity studentEntities = studentRepository
                .findByStudentName(username)
                .orElseThrow(()->new UsernameNotFoundException(username+"not found"));
        if(studentEntities.getStudentName().equalsIgnoreCase("dummy")) {
            StudentDetailsAuth studentDetailsAuth = new StudentDetailsAuth(ADMIN.getGrantedAuthority(),
                    studentEntities.getStudentName(),
                    studentEntities.getPassword(),
                    true,
                    true,
                    true,
                    true);
            return studentDetailsAuth;

        }else{

            StudentDetailsAuth studentDetailsAuth = new StudentDetailsAuth(STUDENT.getGrantedAuthority(),
                    studentEntities.getStudentName(),
                    studentEntities.getPassword(),
                    true,
                    true,
                    true,
                    true);
            return studentDetailsAuth;

        }


    }

    public void saveStudent(StudentEntity studentEntity){
        studentRepository.save(studentEntity);
    }
    public List<StudentEntity>studentList(){
       return studentRepository.findAll();
    }

    public void deleteStudent(int Id){
        studentRepository.deleteById(Id);
    }




}
