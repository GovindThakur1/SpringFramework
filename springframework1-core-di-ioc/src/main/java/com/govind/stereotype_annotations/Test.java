package com.govind.stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype_annotations.xml");

        Student student = context.getBean("student", Student.class);


//        student.setStudentName("govind");
//        student.setCity("kathmandu");


        // Instead of using setter, we can use @Value annotation to set the default value.
        // Testing stereotype annotations
        //        System.out.println(student);
        //        System.out.println(student.getOwnedCars());
        //        System.out.println(student.getOwnedCars().getClass());


        //********** Bean Scope **************
        Student student2 = context.getBean("student", Student.class);


        // using prototype means we will be getting a new object every time we get that bean
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

    }
}
