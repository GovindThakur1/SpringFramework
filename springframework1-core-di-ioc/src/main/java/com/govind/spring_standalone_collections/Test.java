package com.govind.spring_standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone_collections.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);


    }
}
