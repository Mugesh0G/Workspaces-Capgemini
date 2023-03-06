package com.example.springSecurity.Controllers;

import com.example.springSecurity.Entity.StudentEntity;
import com.example.springSecurity.Repository.StudentRepository;
import com.example.springSecurity.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;
import javax.validation.Validation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;
//public static List<StudentEntity>studentList = new ArrayList<>();
//
//public static void saveDetails(){
//
//    studentList.add(new StudentEntity("Mugesh","123"));
//    studentList.add( new StudentEntity("Deenadhayalan","112"));
//    studentList.add(new StudentEntity("Karthikeyan","1234"));
//
//}

//@GetMapping(path = "{studentId}")
//public StudentEntity getStudent(@PathVariable("studentId") Integer studentId)
//{
//    return studentList.stream()
//            .filter(student->studentId.equals(student.getStudentId()))
//            .findFirst()
//            .orElseThrow(()->new IllegalStateException("Student ID "+studentId+"not found" ));
//}

@GetMapping
@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_STUDENT')")
public List<StudentEntity>getStudent(){
    return studentService.studentList();
}


@PostMapping
@PreAuthorize("hasRole('ROLE_ADMIN')")
public Optional<StudentEntity> postStudent(@RequestBody StudentEntity student)
{
    studentService.saveStudent(student);
    return studentRepository.findByStudentName(student.getStudentName());
}
@DeleteMapping
public String deleteStudent(@RequestBody StudentEntity student){
//    AtomicInteger removeStudent = new AtomicInteger();
//    studentService.studentList().stream()
//            .forEach(studentEntity -> {
//                if(student.getStudentId()!=studentEntity.getStudentId()) {
//                    removeStudent.incrementAndGet();
//                    System.out.println(removeStudent.get());
//                }
//            });
//    session =  studentService.studentList().get(removeStudent.get()).getStudentName();
//    studentService.studentList().remove(removeStudent.get());
    StudentEntity entity = studentRepository.findByStudentId(student.getStudentId());
    studentService.deleteStudent(student.getStudentId());

    return "Deleted Student: "+entity.getStudentName();
}

@PutMapping
public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
   StudentEntity entity = studentRepository.findByStudentId(studentEntity.getStudentId());
   entity.setStudentName(studentEntity.getStudentName());
   studentService.saveStudent(entity);
    return entity;
}
@PostMapping("/cred")
    public String validatingCredentials( @Valid @RequestBody StudentEntity entity)
{

//    System.out.println(entity.getPassword());
//    String password_pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()%–[{}]:;',?/*~$^+=<>]).{8,24}$";
//    Pattern pattern = Pattern.compile(password_pattern);
//    Matcher match = pattern.matcher(entity.getPassword());
//    if (match.matches())
//    {
//        studentService.saveStudent(entity);
//        return "hello";
//    }
//    else
//    {
//       return "bye";
//    }

    studentService.saveStudent(entity);
    return "done";

}


}
