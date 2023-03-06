package com.example.springSecurity.Controllers;

import com.example.springSecurity.Authentication.StudentDetailsAuth;
import com.example.springSecurity.Entity.StudentEntity;
import com.example.springSecurity.Repository.StudentRepo;
import com.example.springSecurity.Repository.StudentRepository;
import com.example.springSecurity.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.Principal;
import java.util.Optional;

import static com.example.springSecurity.Authorities.UserRole.ADMIN;
import static com.example.springSecurity.Authorities.UserRole.STUDENT;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepo studentRepository;

    @GetMapping("google")
    public  String GoogleLogin()
    {
        return "google";
    }

    @GetMapping("login")
    public String loginPageController(){
        return "login";
    }

    @GetMapping("default")
    public String redirectDefaultPage(@AuthenticationPrincipal StudentDetailsAuth entity, Model model){
        StudentEntity entity1 = studentRepository.findByStudentName(entity.getUsername());
        model.addAttribute("Success",entity1);
        return "defaultpage";
    }

    @GetMapping("bong")
    public  String errorPage()
    {
        return "Bong";
    }


    @PostMapping("upload{studentName}")
    public String uploaded(@PathVariable String studentName,@RequestParam("pic")  MultipartFile multipartFile, Model model) throws IOException {
        StudentEntity entity1 = studentRepository.findByStudentName(studentName);
        entity1.setPic(multipartFile.getBytes());
        studentService.saveStudent(entity1);
        model.addAttribute("Success",entity1);
        return "defaultpage";
    }



}
