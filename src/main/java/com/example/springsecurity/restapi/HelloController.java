package com.example.springsecurity.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String say() {
        return "Hello world";
    }
}
