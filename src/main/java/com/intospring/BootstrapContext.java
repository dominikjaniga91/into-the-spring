package com.intospring;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

class BootstrapContext implements ApplicationContextInitializer<GenericApplicationContext> {

    public BootstrapContext() {
        System.out.println("Bootstrap Context");
    }

    @Override
    public void initialize(GenericApplicationContext context) {
        context.registerBean(FooBean.class);
        context.registerBean(BarBean.class, () -> new BarBean(context.getBean(FooBean.class)));
    }
}
