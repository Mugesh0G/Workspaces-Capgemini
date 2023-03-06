package com.example.springSecurity.Entity;

import com.example.springSecurity.Authentication.checkvalidpassword;
import com.example.springSecurity.Encoder.PasswordEncode;
import net.bytebuddy.implementation.bind.annotation.FieldValue;
import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.beans.ConstructorProperties;


@Entity
//@Document
public class StudentEntity {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(unique = true)
   // @Field
    private String studentName;
//    @checkvalidpassword
  // @Field
    @Column(unique = true)
    private String password;
   //@Field
    @Column
   private byte[] pic;

    public StudentEntity(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getPassword() {
        return password;
    }


    public StudentEntity(  String studentName, String password) {
        this.studentName = studentName;
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        this.password = passwordEncoder.encode(password);
    }

    public StudentEntity(){
    }

}
