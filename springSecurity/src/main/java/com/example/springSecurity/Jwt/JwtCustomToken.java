package com.example.springSecurity.Jwt;

import com.google.common.net.HttpHeaders;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "application.jwt")
@Component("JwtCustomToken")
public class JwtCustomToken {

private String secretKey;
private String tokenPrefix;
private Integer tokenExpirationInDays;


    public JwtCustomToken() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExpirationInDays() {
        return tokenExpirationInDays;
    }

    public void setTokenExpirationInDays(Integer tokenExpirationInDays) {
        this.tokenExpirationInDays = tokenExpirationInDays;
    }
    public String getHeader( ){
        return HttpHeaders.AUTHORIZATION;
    }
}
