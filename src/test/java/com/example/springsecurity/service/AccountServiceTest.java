package com.example.springsecurity.service;

import com.example.springsecurity.SpringSecurityApplication;
import com.example.springsecurity.entity.Credential;
import com.example.springsecurity.entity.dto.AccountLoginDto;
import com.example.springsecurity.entity.dto.AccountRegisterDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringSecurityApplication.class)
class AccountServiceTest {

    @Autowired
    AccountService accountService;

    @Test
    void register() {
        AccountRegisterDto accountRegisterDto = new AccountRegisterDto();
        accountRegisterDto.setUsername("vietcuong");
        accountRegisterDto.setPassword("123456");
        accountRegisterDto.setRole(1);
        AccountRegisterDto afterCreate = accountService.register(accountRegisterDto);
        System.out.println(afterCreate);
    }

    @Test
    void login() {
        AccountLoginDto accountLoginDto = new AccountLoginDto();
        accountLoginDto.setUsername("vietcuong");
        accountLoginDto.setPassword("123456");
        Credential credential= accountService.login(accountLoginDto);
        System.out.println(credential.toString());
    }
}