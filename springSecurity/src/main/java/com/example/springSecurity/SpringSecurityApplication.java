package com.example.springSecurity;


import com.example.springSecurity.Controllers.StudentController;
import com.example.springSecurity.Entity.StudentEntity;
import com.example.springSecurity.Repository.StudentRepository;
import com.example.springSecurity.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.File;
import java.nio.file.Files;

@SpringBootApplication
//@EnableMongoRepositories
public class SpringSecurityApplication /*implements CommandLineRunner*/{

	@Autowired
	StudentService studentService;
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args)  {
		SpringApplication.run(SpringSecurityApplication.class, args);

	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		StudentEntity entity = new StudentEntity("dummy1","111");
//		StudentEntity entity2 = new StudentEntity("dummy2","222");
//		StudentEntity entity3 = new StudentEntity("dummy3","333");
//
//		studentService.saveStudent(entity);
//		studentService.saveStudent(entity2);
//		studentService.saveStudent(entity3);
//
//
//
//	}
}
