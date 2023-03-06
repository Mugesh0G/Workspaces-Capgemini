package com.example.springSecurity.Jwt;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;

@Configuration
@EnableAutoConfiguration
public class JwtSecretKey {


    private JwtCustomToken jwtCustomToken;


    @Autowired
    public JwtSecretKey(JwtCustomToken jwtCustomToken) {
        this.jwtCustomToken = jwtCustomToken;
    }

    @Bean
    public SecretKey secretKey()
    {
        return Keys.hmacShaKeyFor(jwtCustomToken.getSecretKey().getBytes());
    }
}
