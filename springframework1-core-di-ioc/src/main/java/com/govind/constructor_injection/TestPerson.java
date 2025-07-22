package com.govind.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person1 = (Person) context.getBean("person2");
        System.out.println(person1);

        Person person2 = (Person) context.getBean("person3");
        System.out.println(person2);


    }
}
