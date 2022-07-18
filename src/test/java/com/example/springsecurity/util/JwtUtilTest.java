package com.example.springsecurity.util;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.springsecurity.entity.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {

    @Test
    public void testGenerateToken() {
//        String accessToken = JwtUtil.generateToken("12345678", "USER", "T2009M1", 7 * 24 * 60 * 60 * 1000);
//        System.out.println(accessToken);
//
//        DecodedJWT decodedJWT = JwtUtil.getVerifier().verify(accessToken);
//        System.out.println(decodedJWT.getSubject());
//        System.out.println(decodedJWT.getIssuer());
//        System.out.println(decodedJWT.getExpiresAt());
        Account account = Account.builder()
                .id(System.currentTimeMillis())
                .role(1)
                .username("vietcuong123")
                .passwordHash("abc")
                .build();
        String accessToken = JwtUtil.generateTokenByAccount(account, 15 * 24 * 60 * 60 * 1000);
        System.out.println(accessToken);
    }
}