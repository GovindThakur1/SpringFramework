package com.govind.injectingcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionsconfig.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getPhoneNumbers());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
        System.out.println(emp.getProperties());
    }
}
