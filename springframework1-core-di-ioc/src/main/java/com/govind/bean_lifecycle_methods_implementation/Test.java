package com.govind.bean_lifecycle_methods_implementation;

import com.govind.injectingcollections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // the init() method will be invoked by default but not destroy()
        //  so for that need to register shutdown hook which allows us to call the destroy() method
        // in order to use the method registerShutdownHook(), we need to use AbstractApplicationContext class object
        // instead of ApplicationContext.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_methods.xml");
        context.registerShutdownHook(); // now destroy method will be invoked


        Samosa samosa = context.getBean("samosa", Samosa.class);
        System.out.println(samosa);
        System.out.println();


        // using interface
        Pepsi pepsi = context.getBean("pepsi", Pepsi.class);
        System.out.println(pepsi);
        System.out.println();


        // using annotations
        LifecycleMethodsImplUsingAnnotations usingAnnotations = context.getBean("annot", LifecycleMethodsImplUsingAnnotations.class);
        System.out.println(usingAnnotations);
        System.out.println();

    }
}
