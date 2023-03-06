package com.example.springSecurity.Authorities;
import com.example.springSecurity.Authorities.UserPermission;
import com.google.common.collect.Sets;
import org.hibernate.mapping.Set;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.springSecurity.Authorities.UserPermission.*;

public enum UserRole {
    STUDENT(Sets.newHashSet(STUDENT_READ)),
    ADMIN(Sets.newHashSet(STUDENT_READ,STUDENT_WRITE));

    public final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions){
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthority(){
        Set<SimpleGrantedAuthority>permission = getPermissions().stream()
                .map(userPermission -> new SimpleGrantedAuthority(userPermission.getPermission()))
                .collect(Collectors.toSet());
        permission.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permission;
    }
}
