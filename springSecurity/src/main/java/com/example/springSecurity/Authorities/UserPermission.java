package com.example.springSecurity.Authorities;

public enum UserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write");

    public String permission;

     UserPermission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
