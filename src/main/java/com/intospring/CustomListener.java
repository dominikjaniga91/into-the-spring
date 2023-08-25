package com.intospring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.time.Instant;

class CustomListener implements ApplicationListener<ApplicationEvent> {

    public CustomListener() {
        System.out.println("CustomListener");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Received --> " + event.getClass().getName() + " at " + Instant.ofEpochMilli(event.getTimestamp()));
    }
}
