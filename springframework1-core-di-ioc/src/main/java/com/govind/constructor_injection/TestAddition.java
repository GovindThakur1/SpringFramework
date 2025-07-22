package com.govind.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddition {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");

        Addition addition = context.getBean("addition", Addition.class);
        addition.doSum();

        Addition addition1 = context.getBean("addition2", Addition.class);
        System.out.println(addition1.getA());
        System.out.println(addition1.getB());

    }

}
