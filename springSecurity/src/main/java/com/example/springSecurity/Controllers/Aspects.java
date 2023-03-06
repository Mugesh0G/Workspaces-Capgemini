package com.example.springSecurity.Controllers;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {

   //
    @Pointcut("execution(public String loginPageController())")
    public void pointcut()
    {
        System.out.println("welcome to aspects");
    }
    @AfterReturning("pointcut()")
    public void advice()
    {
        System.out.println("welcome to aspects executing point cut");
    }



}
