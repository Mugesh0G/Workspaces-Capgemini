package com.example.springSecurity.Jwt;

import io.jsonwebtoken.*;
import org.assertj.core.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JwtTokenVerifier extends OncePerRequestFilter {

    private final JwtCustomToken jwtCustomToken;
    private final SecretKey secretKey;

    @Autowired
    public JwtTokenVerifier(JwtCustomToken jwtCustomToken, SecretKey secretKey) {
        this.jwtCustomToken = jwtCustomToken;
        this.secretKey = secretKey;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader(jwtCustomToken.getHeader());

        if(Strings.isNullOrEmpty(authorizationHeader) || !authorizationHeader.startsWith(jwtCustomToken.getTokenPrefix()))
        {
            filterChain.doFilter(request,response);
            return;
        }

        try{
            String token = authorizationHeader.replace(jwtCustomToken.getTokenPrefix(),"");
            Jws<Claims>claimsJws = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token);

            Claims body = claimsJws.getBody();
            String username = body.getIssuer();
            var authorities = (List<Map<String,String>>)body.get("authority");

            Set<SimpleGrantedAuthority> simpleGrantedAuthority = authorities.stream()
                    .map(m->new SimpleGrantedAuthority(m.get("authority")))
                    .collect(Collectors.toSet());

            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    username,null,simpleGrantedAuthority
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }catch (JwtException e)
        {
            throw new IllegalStateException("Invalid Token");
        }
        filterChain.doFilter(request,response);
    }
}
