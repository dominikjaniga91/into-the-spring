package com.intospring;


import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationBeansConfiguration {

    static {
        System.out.println("ApplicationBeansConfiguration created");
    }
}
