package com.intospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

class CustomEnvironmentPostProcessor implements EnvironmentPostProcessor {

    public CustomEnvironmentPostProcessor() {
        System.out.println("CustomEnvironmentPostProcessor");
    }

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("CustomEnvironmentPostProcessor postProcessEnvironment");
    }
}
