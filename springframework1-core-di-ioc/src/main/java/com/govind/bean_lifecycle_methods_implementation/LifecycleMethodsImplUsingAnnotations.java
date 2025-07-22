package com.govind.bean_lifecycle_methods_implementation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleMethodsImplUsingAnnotations {
    private String message;

    public LifecycleMethodsImplUsingAnnotations() {
    }

    public LifecycleMethodsImplUsingAnnotations(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setting message property of usingAnnotations class");
        this.message = message;
    }

    @Override
    public String toString() {
        return "LifecycleMethodsImplUsingAnnotations{" +
                "message='" + message + '\'' +
                '}';
    }


    @PostConstruct
    public void start() {
        System.out.println("inside start -- init");
    }


    @PreDestroy
    public void end() {
        System.out.println("inside end -- destroy");
    }

}
