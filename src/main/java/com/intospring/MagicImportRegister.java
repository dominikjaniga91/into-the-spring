package com.intospring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

class MagicImportRegister implements ImportBeanDefinitionRegistrar {

    public MagicImportRegister() {
        System.out.println("MagicImportRegister created");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("MagicImportRegister.registerBeanDefinitions importing auto configuration");
    }
}
