package com.intospring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

class BarBean implements BeanPostProcessor {

    private static boolean postProcessBefore = true;
    private static boolean postProcessAfter = true;
    private final FooBean fooBean;

    BarBean(FooBean fooBean) {
        this.fooBean = fooBean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (postProcessBefore || beanName.contains("TestController")) {
            System.out.println("BarBean.postProcessBeforeInitialization " + bean + " with name " + bean);
            postProcessBefore = false;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (postProcessAfter || beanName.contains("TestController")) {
            System.out.println("BarBean.postProcessAfterInitialization " + bean + " with name " + bean);
            postProcessAfter = false;
        }
        return bean;
    }
}
