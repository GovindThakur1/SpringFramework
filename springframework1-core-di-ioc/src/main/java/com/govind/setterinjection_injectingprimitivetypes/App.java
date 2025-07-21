package com.govind.setterinjection_injectingprimitivetypes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);


        // using constructor injection
        Student student3 = context.getBean("student3", Student.class);
        System.out.println(student3);


    }
}
