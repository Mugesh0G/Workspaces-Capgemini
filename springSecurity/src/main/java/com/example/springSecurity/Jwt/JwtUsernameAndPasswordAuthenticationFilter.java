package com.example.springSecurity.Jwt;

import com.example.springSecurity.Entity.StudentEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.time.LocalDate;
import java.util.Date;

public class JwtUsernameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    private final JwtCustomToken jwtCustomToken;
    private final SecretKey secretKey;

    public JwtUsernameAndPasswordAuthenticationFilter(AuthenticationManager authenticationManager, JwtCustomToken jwtCustomToken, SecretKey secretKey) {
        this.authenticationManager = authenticationManager;
        this.jwtCustomToken = jwtCustomToken;
        this.secretKey = secretKey;
    }



    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
//            UsernameAndPasswordAuthenticationRequest authenticationRequest =
//                    new ObjectMapper()
//                            .readValue( request.getInputStream(), UsernameAndPasswordAuthenticationRequest.class);

            Authentication usernameAndPasswordAuthentication = new UsernamePasswordAuthenticationToken(
                    obtainUsername(request), obtainPassword(request));

            Authentication authenticated = authenticationManager
                    .authenticate(usernameAndPasswordAuthentication);

            return  authenticated;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        String token = Jwts.builder()
                .setIssuer(authResult.getName())
                .setSubject("This is Generated token")
                .claim("authority",authResult.getAuthorities())
                        .setIssuedAt(new Date())
                                .setExpiration(java.sql.Date.valueOf(LocalDate.now().plusDays(jwtCustomToken.getTokenExpirationInDays())))
                                        .signWith(secretKey)
                                                .compact();

        response.addHeader(jwtCustomToken.getHeader(), jwtCustomToken.getTokenPrefix()+token);

//        setAuthenticationSuccessHandler(new SavedRequestAwareAuthenticationSuccessHandler() {
//            @Override
//            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                getRedirectStrategy().sendRedirect(request,response,"/default");
//            }
//        });
    }
}
