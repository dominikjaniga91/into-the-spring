package com.intospring.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

class OnClassCondition implements Condition {

    OnClassCondition() {
        System.out.println("OnClassCondition created");
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //TODO Spring invokes conditionals several times because they are not cached
        //  so we need to cache it manually
        return true;
    }
}
