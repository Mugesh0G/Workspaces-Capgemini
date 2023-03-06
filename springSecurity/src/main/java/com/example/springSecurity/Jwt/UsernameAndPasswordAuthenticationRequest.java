package com.example.springSecurity.Jwt;

public class UsernameAndPasswordAuthenticationRequest {

    private String studentName;
    private String password;

    public String getUsername() {
        return studentName;
    }

    public void setUsername(String username) {
        this.studentName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsernameAndPasswordAuthenticationRequest() {
    }
}
