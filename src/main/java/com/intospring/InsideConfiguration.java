package com.intospring;


import com.intospring.conditional.SampleConditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@SampleConditional
class InsideConfiguration {

    InsideConfiguration() {
        System.out.println("InsideConfiguration");
    }
}