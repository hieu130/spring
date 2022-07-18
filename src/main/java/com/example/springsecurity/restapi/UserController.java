package com.example.springsecurity.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String say() {
        return "Hello user";
    }
}
