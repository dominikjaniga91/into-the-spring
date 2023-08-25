package com.intospring;


import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
class TestController {

    TestController() {
        System.out.println("TestController created");
    }

    @PostConstruct
    void init() {
        System.out.println("Test controller init post construct");
    }
}
