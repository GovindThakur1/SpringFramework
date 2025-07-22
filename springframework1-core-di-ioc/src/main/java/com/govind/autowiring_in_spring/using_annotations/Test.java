package com.govind.autowiring_in_spring.using_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring_using_annotations.xml");



        Student student = context.getBean("student", Student.class);
        System.out.println(student);


    }
}
